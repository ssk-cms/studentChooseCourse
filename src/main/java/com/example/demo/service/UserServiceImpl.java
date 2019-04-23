package com.example.demo.service;


import com.example.demo.entity.Student;
import com.example.demo.entity.User;
import com.example.demo.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class UserServiceImpl implements UserService {

    @Autowired
    UserMapper userMapper;

    @Override
    public void insertUsers(User user) {

        userMapper.insertUsers(user);

    }

    @Override
    public User login(User user) {

        User user1 = userMapper.login(user);
        return user1;
    }

    @Override
    public User findUser() {

        return userMapper.findUser();
    }

    @Override
    public List<User> showAllUsersMsg(){

        return userMapper.showAllUsersMsg();
    }

    @Override
    public User toUpdate(Integer id){

        return userMapper.toUpdate(id);
    }

    @Override
    public void updateUserMsg(User user){

        userMapper.updateUserMsg(user);
    }

    @Override
    public void deleteUserMsg(User user){

        userMapper.deleteUserMsg(user);
    }

    @Override
    public Student crossUserIdFindStudentMsg(User user){

        return userMapper.crossUserIdFindStudentMsg(user);
    }

    @Override
    public User crossNameFindUserMsg(User user){

        return userMapper.crossNameFindUserMsg(user);
    }

    @Override
    public User findPassword(User user){

        return userMapper.findPassword(user);
    }
}
