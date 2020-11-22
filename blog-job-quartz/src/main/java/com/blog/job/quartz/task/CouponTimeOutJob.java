package com.blog.job.quartz.task;

import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;
import org.springframework.scheduling.quartz.QuartzJobBean;

/**
 * @description:
 * @author: youcong
 * @time: 2020/11/18 19:51
 */
public class CouponTimeOutJob extends QuartzJobBean {
    @Override
    protected void executeInternal(JobExecutionContext jobExecutionContext) throws JobExecutionException {
        System.out.println("定时任务执行");
    }
}
