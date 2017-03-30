package com.drunk2013.thread.manager.deamon;

import java.util.Date;
import java.util.Deque;

/**
 * Created by shuangfu on 17-3-17.
 * Author : DRUNK
 * email :len1988.zhang@gmail.com
 */
public class CleanerTask extends Thread {
    private Deque<Event> deque;

    public CleanerTask(Deque<Event> deque) {
        this.deque = deque;
        setDaemon(true);
    }

    @Override
    public void run() {
        while (true) {
            Date date = new Date();
            clean(date);
        }
    }

    private void clean(Date date) {
        long diffrence;
        boolean delete;
        if (deque.size() == 0) {
            return;
        }

        delete = false;
        do {
            Event e = deque.getLast();
            diffrence = date.getTime() - e.getDate().getTime();
//            System.out.printf("difrrence:%d\n", diffrence);
            if (diffrence > 10000) {
                System.out.printf("Cleaner: %s\n", e.getEvent());
                deque.removeLast();
                delete = true;
            }
        } while (diffrence > 10000);

        if (delete) {
            System.out.printf("Cleaner : size of deque :%d\n", deque.size());
        }
    }
}
