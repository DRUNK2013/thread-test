package com.drunk2013.thread.manager.deamon;

import junit.framework.TestCase;

import java.util.ArrayDeque;
import java.util.Deque;

/**
 * Created by shuangfu on 17-3-17.
 * Author : DRUNK
 * email :len1988.zhang@gmail.com
 */
public class DeamonTest extends TestCase {
    public void testDeamon() {
        System.out.printf("Start test Deamon.\n");
        Deque<Event> deque = new ArrayDeque<Event>();
        WriterTask writerTask = new WriterTask(deque);
        for (int i = 0; i < 3; i++) {
            Thread threadWrite = new Thread(writerTask);
            threadWrite.start();
            System.out.printf("id:%s\n", threadWrite.getId());
        }

        CleanerTask cleanerTask = new CleanerTask(deque);
        cleanerTask.start();
    }

}