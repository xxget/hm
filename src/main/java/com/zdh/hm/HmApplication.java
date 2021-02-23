package com.zdh.hm;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

/**
 * @Author(开发者) Xi
 * @E-mail(邮箱) xxget@live.com
 * @Description(说明) 项目启动类
 * @Date(日期) 11:13 2021/2/20
 * @Param(参数)
 * @return(返回)
 * @Version(版本) 1.0.0
**/
@SpringBootApplication
// 开启任务调度
@EnableScheduling
public class HmApplication {

    public static void main(String[] args) {
        SpringApplication.run(HmApplication.class, args);
        System.out.println("系统正常启动！");
    }

}
