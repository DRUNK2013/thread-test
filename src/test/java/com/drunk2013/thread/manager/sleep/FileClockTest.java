package com.drunk2013.thread.manager.sleep;

import junit.framework.TestCase;

import java.util.concurrent.TimeUnit;

/**
 * Created by shuangfu on 17-3-17.
 * Author : DRUNK
 * email :len1988.zhang@gmail.com
 */
public class FileClockTest extends TestCase {
    public void testRun() throws Exception {
        FileClock fileClock = new FileClock();
        Thread thread = new Thread(fileClock);
        thread.start();

        try {
            TimeUnit.SECONDS.sleep(5);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}