package com.blog.job.schedule.task;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.scheduling.annotation.Async;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.util.Date;

/**
 * @description:
 * @author: youcong
 * @time: 2020/11/21 20:01
 */

@Component
@EnableAsync
public class ScheduleAsyncTask {

    private Logger logger = LoggerFactory.getLogger(ScheduleAsyncTask.class);

    @Scheduled(cron = "0/1 * * * * ? ")
    @Async
    public void one() {

        logger.info("one Async:" + new Date());
    }

    @Scheduled(cron = "0/1 * * * * ? ")
    @Async
    public void two() {

        logger.info("two Async:" + new Date());
    }


    @Scheduled(cron = "0/1 * * * * ? ")
    @Async
    public void three() {

        logger.info("three Async:" + new Date());
    }
}
