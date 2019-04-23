package com.example.demo.service;

import com.example.demo.entity.Student;
import com.example.demo.entity.User;

import java.util.List;


public interface UserService {

    void insertUsers(User user); //注册接口

    User login(User user); //登陆接口

    User findUser(); //查询是否有用户存在接口

    List<User> showAllUsersMsg();//查询所有已注册用户信息的service

    User toUpdate(Integer id); //根据用户id查找用户信息，为修改用户信息做准备的service

    void updateUserMsg(User user); //根据用户id更新该条记录的service

    void deleteUserMsg(User user); //根据用户id删除该条信息

    Student crossUserIdFindStudentMsg(User user); //根据用户id去学生信息表中查找该用户添加的学生信息

    User crossNameFindUserMsg(User user); //根据用户姓名去查找该用户的信息

    User findPassword(User user);//找回密码的service
}
