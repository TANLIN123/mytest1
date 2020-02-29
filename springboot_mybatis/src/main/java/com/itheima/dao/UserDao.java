package com.itheima.dao;

import com.itheima.pojo.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @author TanLin
 * @date 2019/11/11 19:05
 * @className com.itheima.dao
 * @projectName springboot
 */
@Mapper
public interface UserDao {
    List<User> findAll();
}
