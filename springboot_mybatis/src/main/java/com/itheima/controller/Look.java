package com.itheima.controller;

import com.itheima.pojo.User;
import com.itheima.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author TanLin
 * @date 2019/11/11 19:33
 * @className com.itheima.controller
 * @projectName springboot
 */
@RestController
@RequestMapping("/user")
public class Look {
    @Autowired
    private UserService userService;
    @GetMapping("/look")
    public List<User> check(){
       return userService.findAll();
    }
}
