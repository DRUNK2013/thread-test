package com.drunk2013.thread.manager.wait;

import java.util.Date;
import java.util.concurrent.TimeUnit;

/**
 * Created by shuangfu on 17-3-17.
 * Author : DRUNK
 * email :len1988.zhang@gmail.com
 */
public class DataSourcesLoader implements Runnable {
    @Override
    public void run() {
        System.out.printf("Beginning datasources loading:%s\n", new Date());
        try {
            TimeUnit.SECONDS.sleep(4);
        }catch (InterruptedException e){
            e.printStackTrace();
            System.out.printf("Data sources loading has finished:%s\n",new Date());
        }
    }
}

