package com.example.demo.controller;

import com.example.demo.entity.Student;
import com.example.demo.service.StudentService;
import com.example.demo.utils.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @Author: Seth
 * @Date: 2019/3/15 18:00
 * @Version 1.0
 */

@RestController
@RequestMapping("student")
public class StudentController {

    @Autowired
    StudentService studentService;

    //学生自己新增自己的信息路由
    @PostMapping("/addMsg")
    public Response addMsg(@RequestBody Student student){

        Response response = new Response();
        studentService.insertStudents(student);
        response.setMessage("success");
        return response;
    }

    //管理员查看所有学生信息的路由
    @GetMapping("/showAllStudentsMsg")
    public Response showAllStudentsMsg(){

        Response response = new Response();
        List<Student> studentTemp = studentService.showAllStudentsMsg();
        response.setData(studentTemp);

        return response;
    }

    //管理员通过学生信息id修改学生信息的路由
    @GetMapping("/toUpdate")
    public Response toUpdate(Integer id){

        Response response = new Response();
        Student studentMsg = studentService.toUpdate(id);
        response.setData(studentMsg);

        return response;
    }

    //更新表记录
    @PostMapping("/updateStudentMsg")
    public Response updateStudentMsg(@RequestBody Student student){

        Response response = new Response();
        try{
            studentService.updateStudentMsg(student);
        }catch (Exception e){
            response.setData(e);
            return response;
        }
        response.setMessage("success");
        return response;
    }

    //删除表记录
    @PostMapping("/deleteStudentMsg")
    public Response deleteStudentMsg(@RequestBody Student student){

        Response response = new Response();
        try{
            studentService.deleteStudentMsg(student);
        }catch (Exception e){
            response.setData(e);
            return response;
        }
        response.setMessage("success");
        return response;
    }

    /*根据学生姓名去选课表中查询是否有选课记录*/
    @PostMapping("/chooseCourse")
    public Response chooseCourse(String studentName,Integer courseId){

        Response response = new Response();
        Integer courseId1 = null;
        try{
            courseId1 = studentService.chooseCourse(studentName,courseId);
        }catch (Exception e){
            System.out.println(e);
            response.setMessage("sql语句错误");
            return response;
        }
        response.setMessage("已选该课");
        System.out.println(courseId1);
        response.setStatus(courseId1);
        return response;

    }
}