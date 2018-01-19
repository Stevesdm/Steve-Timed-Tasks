package com.steve.task;

import java.util.TimerTask;

/**
 * @Description:
 * @Author: stevejobson
 * @CreateDate: 2018/1/19 下午6:11
 */
public class MyTask extends TimerTask {
    @Override
    public void run() {
        System.out.println("开始执行任务");
    }
}
