package com.drunk2013.thread.manager.sleep;

import java.util.Date;
import java.util.concurrent.TimeUnit;

/**
 * Created by shuangfu on 17-3-17.
 * Author : DRUNK
 * email :len1988.zhang@gmail.com
 */
public class FileClock implements Runnable {
    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.printf("%s\n", new Date());
            try {
                TimeUnit.SECONDS.sleep(1);
            } catch (InterruptedException e) {
                System.out.printf("The FileClock has been interrupted.");
            }
        }
    }
}
