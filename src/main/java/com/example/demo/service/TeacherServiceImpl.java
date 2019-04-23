package com.example.demo.service;

import com.example.demo.entity.Teacher;
import com.example.demo.mapper.TeacherMapper;
import com.example.demo.utils.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author: Seth
 * @Date: 2019/4/8 13:49
 * @Version 1.0
 */

@Service
public class TeacherServiceImpl implements TeacherService{

    @Autowired
    TeacherMapper teacherMapper;

    @Override
    public Teacher selectTeacherMsg(Teacher teacher){

        Teacher teacher1 = teacherMapper.selectTeacherMsg(teacher);
        return teacher1;
    }

    @Override
    public Integer countMsg(){

        return teacherMapper.countMsg();
    }

    @Override
    public void addTeacherMsg(Teacher teacher){

        teacherMapper.addTeacherMsg(teacher);
    }

    @Override
    public Teacher showTeacherName(Teacher teacher){

        return teacherMapper.showTeacherName(teacher);
    }/*根据传入的教师ID查询教师姓名*/

    @Override
    public List<Teacher> showAllTeachersMsg(){

        return teacherMapper.showAllTeachersMsg();
    }/*查询所有教师信息*/

    @Override
    public void updateTeacherMsg(Teacher teacher){

        teacherMapper.updateTeacherMsg(teacher);
    }/*修改教师信息*/

    @Override
    public void deleteTeacherMsg(Teacher teacher){

        teacherMapper.deleteTeacherMsg(teacher);
    }/*删除教师信息*/
}
