package com.study.mogodbdemo.service.impl;

import com.study.mogodbdemo.entity.User;
import com.study.mogodbdemo.entity.UserParam;
import com.study.mogodbdemo.service.UserService;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 用户实现类
 */
@Service
public class UserServiceImpl implements UserService {
    @Override
    public List<User> findUerList(UserParam userParam) {
        return null;
    }

    @Override
    public User findUserById(Integer id) {
        return null;
    }

    @Override
    public User addUser(User user) {
        return null;
    }

    @Override
    public User updateUser(User user) {
        return null;
    }

    @Override
    public void deleteUserById(Integer id) {

    }
}
