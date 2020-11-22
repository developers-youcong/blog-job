package com.blog.job.schedule;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

/**
 * @description:
 * @author: youcong
 * @time: 2020/11/21 19:57
 */
@SpringBootApplication
@EnableScheduling
public class BlogScheduleApplication {

    public static void main(String[] args) {
        SpringApplication.run(BlogScheduleApplication.class, args);
    }


}
