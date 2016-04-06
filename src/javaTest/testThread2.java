package javaTest;

import common.HttpUtil;

import java.util.HashMap;
import java.util.Map;

/**
 * Created with IntelliJ IDEA.
 * User: zhangchen
 * Date: 13-12-25
 * Time: 上午10:30
 * To change this template use File | Settings | File Templates.
 */
public class testThread2 implements Runnable {
    @Override
    public void run() {
        Map<String, String> map = new HashMap<String, String>();
        HttpUtil.post("http://localhost:8080/treasure/buy/snapUp?phone=12345678909&id=3",map,null);
    }
}
