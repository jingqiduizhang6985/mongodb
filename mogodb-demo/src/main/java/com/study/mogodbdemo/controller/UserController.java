package com.study.mogodbdemo.controller;

import com.study.mogodbdemo.entity.RestResponse;
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
    public RestResponse getUserList(@RequestBody UserParam userParam){
        List<User> list =  userService.findUerList(userParam);
        return new RestResponse(list);
    }
    @GetMapping("/findByName")
    public RestResponse findByName(@RequestParam(name = "name",defaultValue = "") String name){
        User user = userService.findUserByName(name);
        return new RestResponse(user);
    }
    @PostMapping("/add")
    public RestResponse addUser(@RequestBody User user){
        User entity = userService.addUser(user);
        return new RestResponse(entity);
    }
    @PostMapping("/update")
    public RestResponse getUserList(@RequestBody User user){
        userService.updateUser(user);
        return new RestResponse(null,"更新完成",200);
    }
    @GetMapping("/delete")
    public RestResponse getUserList(@RequestParam(name = "id")Integer id){
         userService.deleteUserById(id);
        return new RestResponse(null,"删除完成",200);
    }
}
