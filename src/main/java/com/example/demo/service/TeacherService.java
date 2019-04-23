package com.example.demo.service;

import com.example.demo.entity.Teacher;

import java.util.List;

/**
 * @Author: Seth
 * @Date: 2019/4/8 13:48
 * @Version 1.0
 */
public interface TeacherService {

    /*查询教师表中是否有记录接口*/
    Teacher selectTeacherMsg(Teacher teacher);

    /*查看教师表中有几条记录*/
    Integer countMsg();

    /*添加老师信息*/
    void addTeacherMsg(Teacher teacher);

    Teacher showTeacherName(Teacher teacher);/*根据传入的教师ID查询教师姓名*/

    List<Teacher> showAllTeachersMsg();/*查询所有教师信息*/
    void updateTeacherMsg(Teacher teacher);/*修改教师信息*/
    void deleteTeacherMsg(Teacher teacher);/*删除教师信息*/

}
