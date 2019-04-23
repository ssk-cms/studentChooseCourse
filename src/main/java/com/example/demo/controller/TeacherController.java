package com.example.demo.controller;

import com.example.demo.entity.Teacher;
import com.example.demo.service.TeacherService;
import com.example.demo.utils.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @Author: Seth
 * @Date: 2019/4/8 13:50
 * @Version 1.0
 */

@RestController
@RequestMapping("teacher")
public class TeacherController {

    @Autowired
    TeacherService teacherService;

    /*查看老师是否是首次登录，如果是完善个人信息*/
    @PostMapping("/teacherMsg")
    public Response selectTeacherMsg(@RequestBody Teacher teacher){

        Response response = new Response();
        Teacher teacher1 = null;

        try {
            teacher1 = teacherService.selectTeacherMsg(teacher);
        }catch (Exception e){
            response.setData(e);
            return response;
        }
        if (teacher1 == null){
            response.setMessage("首次登录");
            return response;
        }
        response.setData(teacher1);
        response.setMessage("欢迎您");
        return response;
    }

    /*统计教师表中有几条记录，用来给teacherId赋值*/
    @PostMapping("/countMsg")
    public Response countMsg(){

        Response response = new Response();
        Integer count = null;

        try{
            count = teacherService.countMsg();
        }catch (Exception e){
            response.setData(e);
            return response;
        }
        if (count == null){
            count = 1;
            response.setMessage("第一条记录");
            response.setStatus(count);
            return response;
        }
        response.setStatus(count);
        response.setMessage("记录信息");
        return response;
    }

    /*添加老师信息的路由*/
    @PostMapping("/addTeacherMsg")
    public Response addTeacherMsg(@RequestBody Teacher teacher){

        Response response = new Response();

        try {
            teacherService.addTeacherMsg(teacher);
        }catch (Exception e){
            response.setData(e);
            return response;
        }
        response.setStatus(200);
        return response;
    }

    /*根据教师ID查询教师姓名*/
    @PostMapping("/showTeacherName")
   public Response showTeacherName(@RequestBody Teacher teacher){

        Response response = new Response();
        Teacher teacher1 = null;
        try {
            teacher1 = teacherService.showTeacherName(teacher);
        }catch (Exception e){
            System.out.println(e);
            response.setMessage("sql语句出错");
            return response;
        }
        if (teacher1 == null){
            response.setMessage("老师姓名为空");
            response.setStatus(100);
            return response;
        }
        response.setData(teacher1);
        response.setMessage("查询成功");
        response.setStatus(200);
        return response;
    }

    @PostMapping("/showAllTeachersMsg")
    public Response showAllTeachersMsg(){

        Response response = new Response();
        List<Teacher> teacherList = null;
        try {
            teacherList = teacherService.showAllTeachersMsg();
        }catch (Exception e){
            System.out.println(e);
            response.setData(e);
            return response;
        }
        response.setData(teacherList);
        response.setStatus(200);
        response.setMessage("查询成功");
        return response;
    }

    @PostMapping("/updateTeacherMsg")
    public Response updateTeacherMsg(@RequestBody Teacher teacher){

        Response response = new Response();
        try{
            teacherService.updateTeacherMsg(teacher);
        }catch (Exception e){
            System.out.println(e);
            response.setMessage("服务器出错");
            return response;
        }

        response.setStatus(200);
        response.setMessage("修改成功");
        return response;
    }

    @PostMapping("/deleteTeacherMsg")
    public Response deleteTeacherMsg(@RequestBody Teacher teacher){

        Response response = new Response();
        try {
            teacherService.deleteTeacherMsg(teacher);
        }catch (Exception e){
            System.out.println(e);
            response.setMessage("服务器出错");
            response.setData(e);
            return response;
        }
        response.setStatus(200);
        response.setMessage("删除成功");
        return response;
    }
}
