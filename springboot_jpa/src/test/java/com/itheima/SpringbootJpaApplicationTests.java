package com.itheima;

import com.itheima.pojo.User;
import com.itheima.userdao.UserDao;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class SpringbootJpaApplicationTests {
    @Autowired
    private UserDao userDao;

    @Test
    void contextLoads() {
        List<User> all = userDao.findAll();
        System.out.println(all);
    }

}
