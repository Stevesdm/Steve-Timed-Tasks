package com.steve;

import com.steve.task.MyTask;

import java.util.Timer;
import java.util.TimerTask;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        TimerTask task = new MyTask();
        Timer timerDemo = new Timer();
        timerDemo.schedule(task,1000);

    }
}
