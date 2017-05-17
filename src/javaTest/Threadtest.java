package javaTest;

import java.util.Date;

/**
 * Created with IntelliJ IDEA.
 * User: zhangchen
 * Date: 2017/2/24
 * Time: 14:12
 * To change this template use File | Settings | File Templates.
 */
public class ThreadTest extends Thread {

    @Override
    public void run() {
//        super.run();
//        System.out.println("ThreadTest");

        for (int i = 0; i < 10; i++) {
            int time = (int) Math.random() * 1000;
            try {
                Thread.sleep(time);
                System.out.println("run = " + Thread.currentThread().getName() + " " + new Date().getTime());
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
