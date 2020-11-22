package com.blog.job.schedule.task;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.util.Date;

/**
 * @description:
 * @author: youcong
 * @time: 2020/11/21 20:48
 */
@Component
public class ScheduleSingleThreeTask {

    private Logger logger = LoggerFactory.getLogger(ScheduleSingleThreeTask.class);

    @Scheduled(cron = "0/1 * * * * ? ")
    public void one() {

        logger.info("one:" + new Date());
    }

    @Scheduled(cron = "0/1 * * * * ? ")
    public void two() {

        logger.info("two:" + new Date());
    }


    @Scheduled(cron = "0/1 * * * * ? ")
    public void three() {

        logger.info("three:" + new Date());
    }


}
