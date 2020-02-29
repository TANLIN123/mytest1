package com.itheima.service.impl;

import com.itheima.dao.UserDao;
import com.itheima.pojo.User;
import com.itheima.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author TanLin
 * @date 2019/11/11 19:31
 * @className com.itheima.service.impl
 * @projectName springboot
 */
@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserDao userDao;

    @Autowired
    private RedisTemplate redisTemplate;
    @Override
    public List<User> findAll() {
        String key = "user";
        List<User> user = (List<User>) redisTemplate.boundValueOps(key).get();
        if (user == null){
            List<User> all = userDao.findAll();
            redisTemplate.boundValueOps(key).set(all);
        }
        return user;
    }
}
