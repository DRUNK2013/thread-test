package com.drunk2013.thread.manager.factory;

import junit.framework.TestCase;

/**
 * Created by shuangfu on 17-3-17.
 * Author : DRUNK
 * email :len1988.zhang@gmail.com
 */
public class TaskTest extends TestCase {
    public void testRun() throws Exception {
        MyThreadFactory threadFactory = new MyThreadFactory("myThreadFactory");
        Task task = new Task();

        Thread thread;
        System.out.printf("Starting the Threads\n");
        for (int i = 0; i < 10; i++) {
            thread = threadFactory.newThread(task);
            thread.start();
        }

        System.out.printf("Factory Stats:\n");
        System.out.printf("%s\n", threadFactory.getStats());
    }

}