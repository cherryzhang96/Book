package javaTest;

import java.util.Date;

/**
 * Created with IntelliJ IDEA.
 * User: zhangchen
 * Date: 2017/2/24
 * Time: 14:13
 * To change this template use File | Settings | File Templates.
 */
public class ThreadTestMain {

    public static void main(String[] args) {
//        ThreadTest threadTest = new ThreadTest();
//        threadTest.start();
//        System.out.println("运行结束！");

        ThreadTest threadTest = new ThreadTest();
        threadTest.setName("threadTest");
        threadTest.start();
        for (int i = 0; i < 10; i++) {
            int time = (int) Math.random() * 1000;
            try {
                Thread.sleep(time);
                System.out.println("main = " + Thread.currentThread().getName() + " " + new Date().getTime());
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
