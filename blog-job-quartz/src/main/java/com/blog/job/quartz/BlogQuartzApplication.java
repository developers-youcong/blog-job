package com.blog.job.quartz;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

/**
 * @description:
 * @author: youcong
 * @time: 2020/11/21 21:18
 */
@SpringBootApplication
@EnableScheduling
public class BlogQuartzApplication {

    public static void main(String[] args) {
        SpringApplication.run(BlogQuartzApplication.class, args);
    }


}