package com.example.demo.service;

import com.example.demo.entity.*;
import com.example.demo.mapper.CourseMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author: Seth
 * @Date: 2019/4/8 13:49
 * @Version 1.0
 */

@Service
public class CourseServiceImpl implements CourseService{

    @Autowired
    CourseMapper courseMapper;

    @Override
    public void addCourse(Course course){
        courseMapper.addCourse(course);
    }

    @Override
    public Integer count(){

        return courseMapper.count();
    }

    @Override
    public List<Course> showCourseMsg(Teacher teacher){

        return courseMapper.showCourseMsg(teacher);
    }/*根据教师名称查找该教师教授的课程*/

    @Override
    public Course toUpdate(Course course){

        return courseMapper.toUpdate(course);
    }/*根据课程id查询课程信息*/

    @Override
    public void updateCourseMsg(Course course){

        courseMapper.updateCourseMsg(course);
    }/*根据课程id更新课程信息*/

    @Override
    public void deleteCourseMsg(Course course){

        courseMapper.deleteCourseMsg(course);
    }/*根据课程id删除该条记录*/

    @Override
    public List<Course> showChooseCourse(Student student){

        return courseMapper.showChooseCourse(student);
    }
    /*根据学生学院查找指定课程*/

    @Override
    public void chooseCourseStudentNumber(Course course){

        courseMapper.chooseCourseStudentNumber(course);
    }/*根据课程id更新选课人数*/

    @Override
    public void addChooseCourse(ChooseCourse chooseCourse){

        courseMapper.addChooseCourse(chooseCourse);
    }/*向选课信息表中插入记录*/

    @Override
    public Integer studentChooseMaxCourse(String studentNname){

        return courseMapper.studentChooseMaxCourse(studentNname);
    }/*查询每名学生选了几门课*/

    @Override
    public List<TeacherSeeCourseList> chooseCourseList(String teacherName){

        return courseMapper.chooseCourseList(teacherName);
    }/*查询选择该老师的课程信息*/

    @Override
    public List<adminSeeStudentChooseCourseMsg> adminSeeStudentChooseCourseMsg(){

        return courseMapper.adminSeeStudentChooseCourseMsg();
    }/*管理员查看学生选课信息*/

    @Override
    public List<Course> showAllCourseMsg(){

        return courseMapper.showAllCourseMsg();
    }/*查看所有课程信息*/
}
