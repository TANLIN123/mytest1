package com.itheima.userdao;

import com.itheima.pojo.User;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author TanLin
 * @date 2019/11/14 20:29
 * @className com.itheima.userdao
 * @projectName springboot
 */
public interface UserDao extends JpaRepository<User,Integer> {

}
