package com.itheima.service;

import com.itheima.pojo.User;

import java.util.List;

/**
 * @author TanLin
 * @date 2019/11/14 20:26
 * @className com.itheima.service
 * @projectName springboot
 */
public interface UserService {
    List<User> findAll();

}
