package com.drunk2013.thread.manager.exception;

import junit.framework.TestCase;

/**
 * Created by shuangfu on 17-3-17.
 * Author : DRUNK
 * email :len1988.zhang@gmail.com
 */
public class TaskTest extends TestCase {
    public void testRun() throws Exception {
        Task task = new Task();
        Thread thread = new Thread(task);
        thread.setUncaughtExceptionHandler(new ExceptionHandler());
        thread.start();
    }

}