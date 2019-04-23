package com.example.demo.controller;


import com.example.demo.entity.Student;
import com.example.demo.entity.User;
import com.example.demo.service.UserService;
import com.example.demo.utils.Response;
import com.example.demo.utils.Verify;
import com.google.code.kaptcha.impl.DefaultKaptcha;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.imageio.ImageIO;
import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.awt.image.BufferedImage;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.List;

@RestController
@RequestMapping("user")
public class UserController {

    @Autowired
    UserService userService;
    @Autowired //自动根据该类型进行注入
    DefaultKaptcha defaultKaptcha;


    //    注册的路由，返回状态
    @PostMapping("/register")
    public Response register(@RequestBody User user) {

        Response response = new Response();

        try {
            userService.insertUsers(user);
        } catch (Exception e) {
            response.setMessage("该用户已注册");

            e.printStackTrace();

            return response;
        }
        response.setMessage("success");
        return response;

    }

    //    登陆的路由，返回一个user对象
    @PostMapping("/login")
    public Response login(@RequestBody User user, HttpSession session) {

        Response response = new Response();
        User userTemp = userService.login(user);
        if (userTemp == null || !userTemp.getPassword().equals(user.getPassword())) {
            return null;
        }
        session.setAttribute("userName",userTemp);
        response.setData(userTemp);
        return response;
    }

    //在前端页面显示是哪个用户登陆的路由
    @GetMapping("/userMsg")
    public User userMsg(HttpSession session) {

        User users = (User) session.getAttribute("userName");
        return users;
    }

    //管理员查看所有用户信息的路由
    @PostMapping("/showAllUsersMsg")
    public Response showAllUsersMsg(){

        Response response = new Response();
        List<User> users = userService.showAllUsersMsg();
        response.setData(users);

        return response;
    }

    //根据传入的id来查看用户信息
    @GetMapping("/toUpdate")
    public Response toUpdate(Integer id){

        Response response = new Response();
        User userTemp = null;
        try {
            userTemp = userService.toUpdate(id);
        }catch (Exception e){
            response.setMessage("没有该用户信息");
            return response;
        }
        response.setData(userTemp);
        return response;
    }

    //根据传入的id来更新该条表记录的路由
    @PostMapping("/updateUserMsg")
    public Response updateUserMsg(@RequestBody User user){

        Response response = new Response();
        try {
            userService.updateUserMsg(user);
        }catch (Exception e){
            System.out.println(e);
            response.setMessage("添加失败，服务器错误");
            return response;
        }
        response.setMessage("success");
        return response;
    }

    /*根据传入的id删除用户*/
    @PostMapping("/delete")
    public Response deleteUserMsg(@RequestBody User user){

        Response response = new Response();
        try{
            userService.deleteUserMsg(user);
        }catch (Exception e){
            response.setMessage("删除失败，服务端出错");
        }

        response.setMessage("success");
        return response;
    }

    /*根据传入的用户名去学生信息表中查找该用户添加的学生信息*/
    @PostMapping("/crossUserIdFindStudentMsg")
    public Response crossUserIdFindStudentMsg(@RequestBody User user){

        Response response = new Response();

        Student student = null;
        try{
            student = userService.crossUserIdFindStudentMsg(user);
        }catch (Exception e){
            response.setData(e);
            response.setMessage("null");
            return response;
        }
        if(student == null){
            response.setMessage("null");
            return response;
        }
        response.setData(student);
        response.setMessage("success");
        return response;
    }

    /*根据传入的用户名去查找该用户信息*/
    @PostMapping("/crossNameFindUserMsg")
    public Response crossNameFindUserMsg(@RequestBody User user){

        Response response = new Response();
        User userTemp = null;
        try{
            userTemp = userService.crossNameFindUserMsg(user);
        }catch (Exception e){
            response.setMessage("请登录后查看");
            return response;
        }
        response.setData(userTemp);
        return response;
    }

    /*找回密码*/
    @PostMapping("/findPassword")
    public Response findPassword(@RequestBody User user){

        Response response = new Response();

        User user1 = null;
        try{
            user1 = userService.findPassword(user);
        }catch (Exception e){
            response.setData(e);
            System.out.println(e);
            response.setMessage(null);
            return response;
        }
        if(user1 == null){
            response.setMessage(null);
            return response;
        }else{
            response.setMessage("查到密码");
            response.setData(user1);
            return response;
        }
    }

    /*生成验证码，返回前端*/
    @RequestMapping("/defaultKaptcha")
    public void defaultKaptcha(HttpServletRequest httpServletRequest,HttpServletResponse httpServletResponse) throws Exception {

        byte[] captchaChallengeAsJpeg = null;
        ByteArrayOutputStream jpegOutputStream = new ByteArrayOutputStream();
        try {
            //生产验证码字符串并保存到session中
            String createText = defaultKaptcha.createText();
            httpServletRequest.getSession().setAttribute("vrifyCode", createText);
            //使用生产的验证码字符串返回一个BufferedImage对象并转为byte写入到byte数组中
            BufferedImage challenge = defaultKaptcha.createImage(createText);
            ImageIO.write(challenge, "jpg", jpegOutputStream);
        } catch (IllegalArgumentException e) {
            httpServletResponse.sendError(HttpServletResponse.SC_NOT_FOUND);
            return;
        }

        //定义response输出类型为image/jpeg类型，使用response输出流输出图片的byte数组
        captchaChallengeAsJpeg = jpegOutputStream.toByteArray();
        httpServletResponse.setHeader("Cache-Control", "no-store");
        httpServletResponse.setHeader("Pragma", "no-cache");
        httpServletResponse.setDateHeader("Expires", 0);
        httpServletResponse.setContentType("image/jpeg");
        ServletOutputStream responseOutputStream =
                httpServletResponse.getOutputStream();
        responseOutputStream.write(captchaChallengeAsJpeg);
        responseOutputStream.flush();
        responseOutputStream.close();
    }

    /*验证码验证*/
    @RequestMapping("/imgvrifyControllerDefaultKaptcha")
    public Response imgvrifyControllerDefaultKaptcha(HttpServletRequest httpServletRequest,HttpServletResponse httpServletResponse,@RequestBody String vrifyCode){

        Response response = new Response();
        String captchaId = (String) httpServletRequest.getSession().getAttribute("vrifyCode");
//        String parameter = httpServletRequest.getParameter("vrifyCode");
        String parameter = vrifyCode.substring(0,4);

        System.out.println("Session  vrifyCode "+captchaId+" form vrifyCode "+parameter);

        if (!captchaId.equals(parameter)) {
            response.setMessage("错误的验证码");
            response.setData("index");
            return response;
        } else {
            response.setMessage("登录成功");
            response.setStatus(200);
            return response;
        }
    }

    /*退出登录，删除session*/
    @GetMapping("/checkout")
    public Response checkOut(HttpSession session){

        Response response = new Response();

        session.removeAttribute("userName");
        response.setMessage("200");
        return response;

    }
}

