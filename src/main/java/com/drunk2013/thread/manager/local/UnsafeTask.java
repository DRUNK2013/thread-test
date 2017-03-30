package com.drunk2013.thread.manager.local;

import java.util.Date;
import java.util.concurrent.TimeUnit;

/**
 * Created by shuangfu on 17-3-17.
 * Author : DRUNK
 * email :len1988.zhang@gmail.com
 */
public class UnsafeTask implements Runnable {
    private Date startData;

    @Override
    public void run() {
        startData = new Date();
        System.out.printf("Starting Thread:%s : %s\n", Thread.currentThread().getId(), startData);
        try {
            TimeUnit.SECONDS.sleep((int) Math.rint(Math.random() * 10));
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.printf("Thread Finished:%s : %s\n", Thread.currentThread().getId(), startData);
    }
}
