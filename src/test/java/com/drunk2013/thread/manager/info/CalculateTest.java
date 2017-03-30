package com.drunk2013.thread.manager.info;

import junit.framework.TestCase;

import java.io.FileWriter;
import java.io.PrintWriter;

/**
 * Created by shuangfu on 17-3-17.
 * Author : DRUNK
 * email :len1988.zhang@gmail.com
 */
public class CalculateTest extends TestCase {

    public void test() throws Exception {
        Thread[] threads = new Thread[10];
        Thread.State[] status = new Thread.State[10];

        for (int i = 0; i < 10; i++) {
            threads[i] = new Thread(new Calculate(i));
            if (i % 2 == 0) {
                threads[i].setPriority(Thread.MAX_PRIORITY);
            } else {
                threads[i].setPriority(Thread.MIN_PRIORITY);
            }
            threads[i].setName("Thread-" + i);
        }

        FileWriter file = new FileWriter("thread.log");
        PrintWriter pw = new PrintWriter(file);
        for (int i = 0; i < 10; i++) {
            pw.println("Main:Status of Thread " + i + " : " + threads[i].getState());
            status[i] = threads[i].getState();
        }

        for (int i = 0; i < 10; i++) {
            threads[i].start();
        }

        boolean finish = false;
        while (!finish) {
            for (int i = 0; i < 10; i++) {
                if (threads[i].getState() != status[i]) {
                    writeThreadInfo(pw, threads[i], status[i]);
                    status[i] = threads[i].getState();
                }
            }
            finish = true;
            for (int i = 0; i < 10; i++) {
                finish = finish && (threads[i].getState() == Thread.State.TERMINATED);
            }
        }


    }

    private void writeThreadInfo(PrintWriter pw, Thread thread, Thread.State state) {
        pw.printf("Main : Id %d - %s\n", thread.getId(), thread.getName());
        pw.printf("Main : Priority %d\n", thread.getPriority());
        pw.printf("Main : Old State: %s\n", state);
        pw.printf("Main : New State: %s\n", thread.getState());
        pw.printf("Main : ********************************\n");
    }

}