package com.drunk2013.thread.synchronizad;

import junit.framework.TestCase;

/**
 * Created by shuangfu on 17-3-17.
 * Author : DRUNK
 * email :len1988.zhang@gmail.com
 */
public class AccountTest extends TestCase {
    public void testAcount() {
        Account account = new Account();
        account.setBalance(1000);

        Company company = new Company(account);
        Thread companyThread = new Thread(company);

        Bank bank = new Bank(account);
        Thread bankThread = new Thread(bank);

        System.out.printf("Account: Initial Banlance :%f\n", account.getBalance());

        companyThread.start();
        bankThread.start();

        try {
            companyThread.join();
            bankThread.join();
            System.out.printf("Account: Final Banlance :%f\n", account.getBalance());
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }

}