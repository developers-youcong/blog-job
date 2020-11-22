package com.blog.job.shedlock.redis;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

/**
 * @description:
 * @author: youcong
 * @time: 2020/11/22 10:37
 */
@SpringBootApplication
@EnableScheduling
public class ShedLockRedisApplication {
    public static void main(String[] args) {
        SpringApplication.run(ShedLockRedisApplication.class);
    }
}
