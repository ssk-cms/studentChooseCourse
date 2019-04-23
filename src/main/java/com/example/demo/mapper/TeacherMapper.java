package com.example.demo.mapper;

import com.example.demo.entity.Teacher;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @Author: Seth
 * @Date: 2019/4/8 13:47
 * @Version 1.0
 */

@Mapper
public interface TeacherMapper {

    Teacher selectTeacherMsg(Teacher teacher); /*查看是否完善信息接口*/

    Integer countMsg(); /*查看有多少条表记录*/

    void addTeacherMsg(Teacher teacher);/*添加老师信息*/

    Teacher showTeacherName(Teacher teacher);/*根据传入的教师ID查询教师姓名*/

    List<Teacher> showAllTeachersMsg();/*查询所有教师信息*/

    void updateTeacherMsg(Teacher teacher);/*修改教师信息*/

    void deleteTeacherMsg(Teacher teacher);/*删除教师信息*/
}
