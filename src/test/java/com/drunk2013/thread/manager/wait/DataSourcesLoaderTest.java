package com.drunk2013.thread.manager.wait;

import junit.framework.TestCase;

import java.util.Date;

/**
 * Created by shuangfu on 17-3-17.
 * Author : DRUNK
 * email :len1988.zhang@gmail.com
 */
public class DataSourcesLoaderTest extends TestCase {
    public void testRun() throws Exception {
        DataSourcesLoader dataSourcesLoader = new DataSourcesLoader();
        Thread threadDataSouce = new Thread(dataSourcesLoader);

        NetworkConnectionsLoader networkConnectionsLoader = new NetworkConnectionsLoader();
        Thread threadNetwork = new Thread(networkConnectionsLoader);

        threadDataSouce.start();
        threadNetwork.start();

        try {
            threadDataSouce.join();
            threadNetwork.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        //main thread writer messege info
        System.out.printf("Main Configuration has been loading:%s\n", new Date());
    }

}