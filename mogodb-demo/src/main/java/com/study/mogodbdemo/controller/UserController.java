package com.study.mogodbdemo.controller;

import com.study.mogodbdemo.entity.User;
import com.study.mogodbdemo.entity.UserParam;
import com.study.mogodbdemo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserService userService;

    @PostMapping("/list")
    public List<User> getUserList(@RequestBody UserParam userParam){
        List<User> list =  userService.findUerList(userParam);
        return list;
    }
}
