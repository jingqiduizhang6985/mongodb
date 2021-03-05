package com.study.mogodbdemo.service;

import com.study.mogodbdemo.entity.User;
import com.study.mogodbdemo.entity.UserParam;

import java.util.List;

public interface UserService {
    /**
     * 查询列表
     * @return
     */
     List<User> findUerList(UserParam userParam);
    /**
     * 查询单个
     */
    User findUserById(Integer id);
    /**
     * add
     */
    User addUser(User user);
    /**
     * update
     */
    User updateUser(User user);
    /**
     * 删除
     */
    void deleteUserById(Integer id);
}
