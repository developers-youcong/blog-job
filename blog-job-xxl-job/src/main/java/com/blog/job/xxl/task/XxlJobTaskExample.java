package com.blog.job.xxl.task;

import com.xxl.job.core.biz.model.ReturnT;
import com.xxl.job.core.handler.annotation.XxlJob;
import com.xxl.job.core.log.XxlJobLogger;
import org.springframework.stereotype.Component;

import java.util.concurrent.TimeUnit;

/**
 * @description:
 * @author: youcong
 * @time: 2020/11/21 22:27
 */
@Component
public class XxlJobTaskExample {


    @XxlJob("blogJobHandler")
    public ReturnT<String> blogJobHandler(String param) throws Exception {
        System.out.println("执行");
        XxlJobLogger.log("XXL-JOB, Hello World.");

        for (int i = 0; i < 5; i++) {
            XxlJobLogger.log("beat at:" + i);
            TimeUnit.SECONDS.sleep(2);
        }
        return ReturnT.SUCCESS;
    }

}
