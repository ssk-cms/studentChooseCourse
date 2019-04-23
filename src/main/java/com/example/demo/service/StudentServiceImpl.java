package com.example.demo.service;

import com.example.demo.entity.Student;
import com.example.demo.mapper.StudentMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author: Seth
 * @Date: 2019/3/15 17:53
 * @Version 1.0
 */

@Service
public class StudentServiceImpl implements StudentService {

    @Autowired
    StudentMapper studentMapper;

    @Override
    public void insertStudents(Student student){
        studentMapper.insertStudents(student);
    }

    @Override
    public List<Student> showAllStudentsMsg(){
        return studentMapper.showAllStudentsMsg();
    }

    @Override
    public Student toUpdate(Integer id){
        return studentMapper.toUpdate(id);
    }

    //根据学生id去更新表记录
    @Override
    public void updateStudentMsg(Student student){
        studentMapper.updateStudentMsg(student);
    }

    //根据学生id删除表记录
    @Override
    public void deleteStudentMsg(Student student){
        studentMapper.deleteStudentMsg(student);
    } //根据学生id删除该条记录

    @Override
    public Integer chooseCourse(String studentName,Integer courseId){

        return studentMapper.chooseCourse(studentName,courseId);
    }/*根据学生姓名去选课表中查询是否有选课记录*/
}
