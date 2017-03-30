package com.drunk2013.thread.manager.group;

import junit.framework.TestCase;

/**
 * Created by shuangfu on 17-3-17.
 * Author : DRUNK
 * email :len1988.zhang@gmail.com
 */
public class TaskTest extends TestCase {
    public void testRun() throws Exception {
        MyThreadGroup myThreadGroup = new MyThreadGroup("myThreadGroup");
        Task task = new Task();

        for (int i = 0; i < 2; i++) {
            Thread t = new Thread(myThreadGroup, task);
            t.start();
        }
    }

}