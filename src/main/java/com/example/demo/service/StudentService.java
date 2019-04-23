package com.example.demo.service;

import com.example.demo.entity.Student;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author: Seth
 * @Date: 2019/3/15 17:53
 * @Version 1.0
 */


public interface StudentService {

    void insertStudents(Student student); //添加学生信息的service

    List<Student> showAllStudentsMsg(); //管理员显示所有学生信息的service

    Student toUpdate(Integer id); //管理员通过id修改学生信息的service

    void updateStudentMsg(Student student); //根据学生id去更新表记录的service

    void deleteStudentMsg(Student student); //根据学生id删除该条记录的service

    Integer chooseCourse(String studentName,Integer courseId);/*根据学生姓名去选课表中查询是否有选课记录*/
}
