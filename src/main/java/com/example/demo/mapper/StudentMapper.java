package com.example.demo.mapper;

import com.example.demo.entity.Course;
import com.example.demo.entity.Student;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @Author: Seth
 * @Date: 2019/3/15 17:48
 * @Version 1.0
 */

@Mapper
public interface StudentMapper {

    void insertStudents(Student student); //添加学生信息的mapper

    List<Student> showAllStudentsMsg(); //管理员显示所有学生信息的mapper

    Student toUpdate(Integer id); //通过学生的id去查找学生信息，返回结果为student的全部信息

    void updateStudentMsg(Student student); //根据学生id去更新表记录

    void deleteStudentMsg(Student student); //根据学生id删除该条记录

    Integer chooseCourse(@Param("studentName") String student,@Param("courseId") Integer id);/*根据学生姓名去选课表中查询是否有选课记录*/

}
