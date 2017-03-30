package com.drunk2013.thread.manager.local;

import junit.framework.TestCase;

import java.util.concurrent.TimeUnit;

/**
 * Created by shuangfu on 17-3-17.
 * Author : DRUNK
 * email :len1988.zhang@gmail.com
 */
public class TaskTest extends TestCase {
    public void testRun() throws Exception {
        Task task = new Task();
        Thread thread1 = new Thread(task);
        thread1.start();

        Task task2 = new Task();
        Thread thread2 = new Thread(task2);
        thread2.start();

        Task task3 = new Task();
        Thread thread3 = new Thread(task3);
        thread3.start();

        task.setName("zsf");
        TimeUnit.SECONDS.sleep(5);
        task.setName("DRUNK");


        TimeUnit.SECONDS.sleep(10);
        thread1.interrupt();
        thread2.interrupt();
        thread3.interrupt();
    }

}