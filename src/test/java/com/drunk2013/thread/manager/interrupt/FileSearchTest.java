package com.drunk2013.thread.manager.interrupt;

import junit.framework.TestCase;

import java.util.concurrent.TimeUnit;

/**
 * Created by shuangfu on 17-3-17.
 * Author : DRUNK
 * email :len1988.zhang@gmail.com
 */
public class FileSearchTest extends TestCase {
    public void testRun() throws Exception {
        FileSearch fileSearch = new FileSearch("/home/shuangfu/code", "update.sh");
        Thread thread = new Thread(fileSearch);
        thread.start();

        try {
            TimeUnit.SECONDS.sleep(10);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        thread.interrupt();

    }

}