package com.example.demo.mapper;

import com.example.demo.entity.Student;
import com.example.demo.entity.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface UserMapper {

    void insertUsers(User user); //注册接口

    User login(User user); //登陆接口

    User findUser(); //查询该用户是否存在

    List<User> showAllUsersMsg(); //查询所有已经注册的用户信息

    User toUpdate(Integer id); //根据用户id查找用户信息，为修改用户信息做准备

    void updateUserMsg(User user); //根据用户id更新该条记录

    void deleteUserMsg(User user); //根据用户id删除该条信息

    Student crossUserIdFindStudentMsg(User user); //根据用户id去学生信息表中查找该用户所注册的学生信息

    User crossNameFindUserMsg(User user);//根据用户姓名去查找该用户信息

    User findPassword(User user);//找回密码


}
