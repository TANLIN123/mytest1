package com.itheima.service.impl;

import com.itheima.pojo.User;
import com.itheima.service.UserService;
import com.itheima.userdao.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author TanLin
 * @date 2019/11/14 20:26
 * @className com.itheima.service.impl
 * @projectName springboot
 */
@Service
public class UserServiceimpl implements UserService {
    @Autowired
    private UserDao userDao;


    @Override
    public List<User> findAll() {
        return userDao.findAll();
    }
}
