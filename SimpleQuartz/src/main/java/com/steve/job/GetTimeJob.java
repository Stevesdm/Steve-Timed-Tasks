package com.steve.job;

import org.quartz.Job;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @Description:
 * @Author: stevejobson
 * @CreateDate: 2018/2/1 上午10:25
 */
public class GetTimeJob implements Job{

    static final SimpleDateFormat sdt = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

    public void execute(JobExecutionContext jobExecutionContext) throws JobExecutionException {
        System.out.println("now the time is :" + sdt.format(new Date()));
    }
}
