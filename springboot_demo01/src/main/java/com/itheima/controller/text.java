package com.itheima.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author TanLin
 * @date 2019/11/11 14:34
 * @className com.itheima.controller
 * @projectName springboot
 */
@RestController
@RequestMapping("/end")
public class text {
    @GetMapping("/add")
    public String pring(){
        return "text success";
    }
}
