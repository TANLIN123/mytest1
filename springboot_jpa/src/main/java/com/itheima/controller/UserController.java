package com.itheima.controller;

import com.itheima.pojo.User;
import com.itheima.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author TanLin
 * @date 2019/11/14 20:24
 * @className com.itheima.controller
 * @projectName springboot
 */
@RequestMapping("/user")
@RestController
public class UserController {
    @Autowired
    private UserService userService;
    @RequestMapping("/all")
    public List<User> findAll(){
        List<User> all = userService.findAll();
        return all;
    }

}
