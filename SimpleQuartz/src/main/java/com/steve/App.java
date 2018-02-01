package com.steve;

import com.steve.job.GetTimeJob;
import org.quartz.*;
import org.quartz.impl.StdSchedulerFactory;

import java.util.Collection;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) throws SchedulerException {

        SchedulerFactory schedulerFactory = new StdSchedulerFactory();
        Scheduler scheduler = schedulerFactory.getScheduler();

        JobDetail jobDetail = JobBuilder.newJob(GetTimeJob.class).withIdentity("get time job").build();

        Trigger trigger = TriggerBuilder.newTrigger()
                .withIdentity("cron trigger")
                .withSchedule(CronScheduleBuilder.cronSchedule("*/5 * * * * ?"))
                .startNow()
                .build();
        scheduler.scheduleJob(jobDetail, trigger);
        scheduler.start();
    }
}
