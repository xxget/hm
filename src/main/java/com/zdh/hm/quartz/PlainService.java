package com.zdh.hm.quartz;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @Author(开发者) Xi
 * @E-mail(邮箱) xxget@live.com
 * @Description(说明) //定时调度部分的方法
 * @Date(日期) 15:42 2021/2/23
 * @Param(参数)
 * @return(返回)
 * @Version(版本) 1.0.0
**/
@Service
public class PlainService {

    //@Scheduled(cron = "30 * * * * ?")
    //@Scheduled(fixedDelay = 3000)每隔3000毫秒执行一次，必须是上次调度成功后3000毫秒；
    @Scheduled(fixedRate = 3000)//每个3000毫秒执行一次，无论上次是否会执行成功，下次都会执行
    public void cronScheduled(){
        SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");//设置日期格式
        System.out.println(df.format(new Date()) + "我来了。。。");
    }

}