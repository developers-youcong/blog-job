package com.blog.job.quartz.task;

import org.quartz.*;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @description:
 * @author: youcong
 * @time: 2020/11/18 19:50
 */
@Configuration
public class QuartzConfiguration {
    // 使用jobDetail包装job
    @Bean
    public JobDetail myCronJobDetail() {
        return JobBuilder.newJob(CouponTimeOutJob.class).withIdentity("couponTimeOutJob").storeDurably().build();
    }

    // 把jobDetail注册到Cron表达式的trigger上去
    @Bean
    public Trigger CronJobTrigger() {
        CronScheduleBuilder cronScheduleBuilder = CronScheduleBuilder.cronSchedule("0/1 * * * * ?");

        return TriggerBuilder.newTrigger()
                .forJob(myCronJobDetail())
                .withIdentity("CouponTimeOutJobTrigger")
                .withSchedule(cronScheduleBuilder)
                .build();
    }
}