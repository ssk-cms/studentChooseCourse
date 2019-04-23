package com.example.demo.service;

import com.example.demo.entity.*;

import java.util.List;

/**
 * @Author: Seth
 * @Date: 2019/4/8 13:48
 * @Version 1.0
 */
public interface CourseService {

    void addCourse(Course course);/*添加课程*/
    Integer count(); /*查询表记录个数*/
    List<Course> showCourseMsg(Teacher teacher);/*根据教师名称查找该教师教授的课程*/
    Course toUpdate(Course course);/*根据课程id查询课程信息*/
    void updateCourseMsg(Course course);/*根据课程id更新课程信息*/
    void deleteCourseMsg(Course course);/*根据课程id删除该条记录*/
    List<Course> showChooseCourse(Student student);/*根据学生学院查找指定课程*/
    void chooseCourseStudentNumber(Course course);/*根据课程id更新课程选课人数*/
    void addChooseCourse(ChooseCourse chooseCourse);/*向选课信息表中插入记录*/
    Integer studentChooseMaxCourse(String studentNname);/*查询每名学生选了几门课*/
    List<TeacherSeeCourseList> chooseCourseList(String teacherName);/*查询选择该老师的课程信息*/
    List<adminSeeStudentChooseCourseMsg> adminSeeStudentChooseCourseMsg();/*管理员查看学生选课信息*/
    List<Course> showAllCourseMsg();/*查看所有课程信息*/
}
