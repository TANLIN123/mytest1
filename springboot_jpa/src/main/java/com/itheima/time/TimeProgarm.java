package com.itheima.time;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

/**
 * @author TanLin
 * @date 2019/11/14 22:54
 * @className com.itheima.time
 * @projectName springboot
 */
@Component
public class TimeProgarm {
    @Scheduled(cron ="30 45 15 08 07 *")
    public void test(){
        System.out.println("测试成功");
        System.out.println("执行了");
    }
}
