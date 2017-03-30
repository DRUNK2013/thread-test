package com.drunk2013.thread.manager.interrupt;

import junit.framework.TestCase;

/**
 * Created by shuangfu on 17-3-17.
 * Author : DRUNK
 * email :len1988.zhang@gmail.com
 */
public class PrimeGeneratorTest extends TestCase {
    public void testRun() throws Exception {
        Thread task = new PrimeGenerator();
        task.start();

        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        task.interrupt();
    }

}