package com.blog.job.xxl;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

/**
 * @description:
 * @author: youcong
 * @time: 2020/11/21 22:06
 */
@SpringBootApplication
@EnableScheduling
public class BlogXxlApplication {

    public static void main(String[] args) {
        SpringApplication.run(BlogXxlApplication.class, args);
    }


}