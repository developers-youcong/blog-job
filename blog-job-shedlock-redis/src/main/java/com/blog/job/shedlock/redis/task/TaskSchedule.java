package com.blog.job.shedlock.redis.task;

import net.javacrumbs.shedlock.spring.annotation.SchedulerLock;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.util.Date;

/**
 * @description:
 * @author: youcong
 * @time: 2020/11/22 10:40
 */

@Component
public class TaskSchedule {

    /**
     * 每分钟执行一次
     * [秒] [分] [小时] [日] [月] [周] [年]
     */
    @Scheduled(cron = "1 * * * * ?")
    @SchedulerLock(name = "synchronousSchedule")
    public void SynchronousSchedule() {
        
        System.out.println("Start run schedule to synchronous data:" + new Date());

    }
}
