package com.drunk2013.thread.manager.local;

import junit.framework.TestCase;

import java.util.concurrent.TimeUnit;

/**
 * Created by shuangfu on 17-3-17.
 * Author : DRUNK
 * email :len1988.zhang@gmail.com
 */
public class UnsafeTaskTest extends TestCase {
    public void testRun() throws Exception {
        UnsafeTask unsafeTask = new UnsafeTask();
        for (int i = 0; i < 10; i++) {
            Thread thread = new Thread(unsafeTask);
            thread.start();
            TimeUnit.SECONDS.sleep(2);
        }
    }


}