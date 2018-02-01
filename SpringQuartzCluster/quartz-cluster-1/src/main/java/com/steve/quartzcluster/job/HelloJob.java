package com.steve.quartzcluster.job;

import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;
import org.springframework.scheduling.quartz.QuartzJobBean;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @Description:
 * @Author: stevejobson
 * @CreateDate: 2018/2/1 下午3:34
 */
public class HelloJob extends QuartzJobBean {

    static final SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");


    @Override
    protected void executeInternal(JobExecutionContext jobExecutionContext) throws JobExecutionException {
        System.out.println(sdf.format(new Date()) + "------hello world ");
    }
}
