package com.study.mogodbdemo.service.impl;

import com.study.mogodbdemo.entity.User;
import com.study.mogodbdemo.entity.UserParam;
import com.study.mogodbdemo.mongodb.MongoUser;
import com.study.mogodbdemo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 用户实现类
 */
@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private MongoUser mongoUser;

    @Override
    public List<User> findUerList(UserParam userParam) {
        return mongoUser.findUserList(userParam);
    }

    @Override
    public User findUserByName(String name) {
        return mongoUser.findUserByName(name);
    }

    @Override
    public User addUser(User user) {
        return mongoUser.save(user);
    }

    @Override
    public void updateUser(User user) {
         mongoUser.updateUser(user);
    }

    @Override
    public void deleteUserById(Integer id) {
        mongoUser.deleteTestById(id);
    }
}
