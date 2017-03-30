package com.drunk2013.thread.manager.exception;

/**
 * Created by shuangfu on 17-3-17.
 * Author : DRUNK
 * email :len1988.zhang@gmail.com
 */
public class ExceptionHandler implements Thread.UncaughtExceptionHandler {

    public void uncaughtException(Thread t, Throwable e) {
        System.out.printf("An exption has been captured\n");
        System.out.printf("Thread: %s\n", t.getId());
        System.out.printf("Exption,%s:$s\n", e.getClass().getName(), e.getMessage());
        System.out.printf("Stack trace:\n");
        e.printStackTrace(System.out);
        System.out.printf("Thread Status:%s\n", t.getState());

    }
}
