package javaTest;

import com.alibaba.fastjson.JSONObject;
import com.google.gson.Gson;
import com.google.gson.JsonElement;
import com.google.gson.JsonParser;

import java.io.*;
import java.math.BigDecimal;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLDecoder;
import java.security.MessageDigest;
import java.text.DateFormat;
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;

/**
 * Created with IntelliJ IDEA.
 * User: cherry
 * Date: 13-4-9
 * Time: 下午2:54
 * To change this template use File | Settings | File Templates.
 */
public class Creator {
    public static Books creator1() {
//        return (new java.Book());
//        return (new java.Periodical());
        return (new NewsPaper());
    }

    public static void main(String[] args) throws Exception{
//        creator1();
//        Map<String, String> userInfoMap = new HashMap<String, String>();
//        userInfoMap.put("id","1");
//        userInfoMap.put("name","cherry");
//        userInfoMap.put("id","2");
//        Set<String> kes = userInfoMap.keySet();
//        for (String key:kes) {
//            System.out.println(userInfoMap.get(key));
//        }



//        List<String> a = new ArrayList<String>();
//        a.add("a");
//        a.add("b");d
//        List<String> b = new ArrayList<String>();
//        b.add("c");
//        b.add("d");
//        System.out.println(a);
//        System.out.println(b);
//        a = b;
//        System.out.println(a);

//        System.out.println(Integer.MAX_VALUE);
//        System.out.println(Integer.MIN_VALUE);

//        List<java.Book> a = new ArrayList<java.Book>();
//        a.add(new java.Book());
//        List<java.NewsPaper> b = new ArrayList<java.NewsPaper>();
//        System.out.println(a.get(0).getClass().getName());
//        System.out.println(b.getClass());

//        System.out.println("2013-1-2 00:00:00".compareTo("2013-1-12 00:00:00"));
//        String a = "a";
//        a+= "bc";
//        System.out.println(a);

//        String pattern = "^(cloud.access.log-2013-07)([\\s\\S]*)?";
//        String str = "cloud.access.log-2013-07-03-1372846681";
//        String str1 = "cloud.access.log-2013-08-03-1372846681";
//        System.out.println(str.matches(pattern));
//        System.out.println(str1.matches(pattern));

//        Date date = new Date();
//        DateFormat df = new SimpleDateFormat("yyyy-MM-dd");
//        Date date = df.parse("2013-07-01");
//        Calendar cal = Calendar.getInstance();
//        cal.setTime(date);
//        long timestamp = cal.getTimeInMillis();
//        System.out.println(timestamp);
//        date = df.parse("2013-08-01");
//        cal.setTime(date);
//        timestamp = cal.getTimeInMillis();
//        System.out.println(timestamp);

//        DateFormat df = new SimpleDateFormat("yyyy-M-d");
//        //获取当前月第一天：
//        Calendar c = Calendar.getInstance();
//        c.add(Calendar.MONTH, 1);
//        c.set(Calendar.DAY_OF_MONTH,1);//设置为1号,当前日期既为本月第一天
//        c.set(Calendar.HOUR_OF_DAY,0);
//        c.set(Calendar.MINUTE,0);
//        c.set(Calendar.SECOND,0);
//        c.set(Calendar.MILLISECOND,0);
//        String date = df.format(c.getTime());
//        System.out.println(c.getTimeInMillis());
//        System.out.println(date);
//        System.out.println(c.getTime());

        DateFormat df = new SimpleDateFormat("yyyy-M-d");
//        Date monthDate = new Date();
//        Calendar c = Calendar.getInstance();
//        c.setTime(monthDate);
//        c.set(Calendar.DAY_OF_MONTH,1);
//        c.add(Calendar.MONTH, 1);
//        String d = df.format(c.getTime());
//        System.out.println(d);

//        Calendar cal = Calendar.getInstance();
//        Date orderDate = df.parse("2014-02-02");
////        cal.set(Calendar.YEAR,orderDate.getYear());
////        cal.set(Calendar.MONTH, orderDate.getMonth());
//        cal.setTime(orderDate);
//        cal.set(Calendar.DATE, 1);
////        cal.roll(Calendar.DATE, -1);
//        String d = df.format(cal.getTime());
//        System.out.println(d);

//        Calendar c = Calendar.getInstance();
//        Integer year = c.get(Calendar.YEAR);
//        Integer month = c.get(Calendar.MONTH) + 0;
//        String y = year.toString();
//        String m = month.toString();
//        if (month < 10) {
//            m = "0" + m;
//        }
//        System.out.print( y + m);
//
//
//        DateFormat df = new SimpleDateFormat("yyyy-M-d");
//        Calendar c2 = Calendar.getInstance();
//        c2.set(Calendar.HOUR_OF_DAY,-1);
//        c2.add(Calendar.MONTH, +1);
//        c2.set(Calendar.DAY_OF_MONTH,1);//设置为1号,当前日期既为本月第一天
//        c2.set(Calendar.HOUR_OF_DAY,0);
//        c2.set(Calendar.MINUTE,0);
//        c2.set(Calendar.SECOND,0);
//        c2.set(Calendar.MILLISECOND,0);
//        String date2 = df.format(c2.getTime());
//        System.out.println(c2.getTimeInMillis());
//        System.out.println(date2);
//        System.out.println(date2);

//        Date date1 = new Date();
//        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
//        String specifiedDay = sdf.format(date1);
//        Calendar c = Calendar.getInstance();
//        Date date = null;
//        date = sdf.parse(specifiedDay);
//        c.setTime(date);
//        int day = c.get(Calendar.DATE);
//        c.set(Calendar.DATE, day - 1);
//
//        String dayBefore = sdf.format(c
//                .getTime());
//        Date d = sdf.parse(dayBefore);
//        System.out.println(new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(d));
//        System.out.println(specifiedDay);
//        System.out.print(StringUtils.substring("2014-01-23 00:00:00",0,10));
//        Date d = new Date();
//        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
//        System.out.println(sdf.format(d));
//        System.out.println(d.getHours());
//        String a = "2014-02-26,";
//        String b = "2014-02-27";
////        System.out.println(a.compareTo(b));
//        System.out.println(a.substring(0, a.length()-1));
//        System.out.println(a);



//        Calendar c = Calendar.getInstance();
//        System.out.println(c.get(Calendar.YEAR));
//        System.out.println(c.get(Calendar.MONTH)+1);

//        Calendar c = Calendar.getInstance();
//        Integer year = c.get(Calendar.YEAR);
//        Integer month = c.get(Calendar.MONTH)+1;
//        String y = year.toString();
//        String m = month.toString();
//        if (month < 10) {
//            m = "0" + m;
//        }
//        System.out.println(y+m);

//        DecimalFormat df2 = new DecimalFormat("###.00");
//        Integer a = 100;
//        Integer b = 1024;
//        Double aa = Double.parseDouble(a.toString());
//        Double bb = Double.parseDouble(b.toString());
//        Double cc = div(aa, bb, 2);
//        System.out.println(div(cc, bb, 2));

//        Timestamp t1 = new Timestamp(System.currentTimeMillis());
//        Timestamp t2 = new Timestamp(1380681260000L);
//        Long l1 = System.currentTimeMillis();
//        Long l2 = 1383027720000L;
//        System.out.println(t1.compareTo(t2));

//        SimpleDateFormat simpleDateFormate = new SimpleDateFormat();
//        System.out.println(t1);
//        System.out.println(t2);
//        System.out.println(simpleDateFormate.format(t1));
//        System.out.println(simpleDateFormate.format(t2));
//        System.out.println((simpleDateFormate.format(t1)).compareTo(simpleDateFormate.format(t2)));
//        int hours = (int) ((l1 - l2) / 3600000);
//        int minute = (int) (((l1 - l2) / 1000 - hours * 3600) / 60);
//        System.out.println(minute);

        //apkutil解析apk
//        try {
////            String demo = "cn.kuwo.player-4214.apk";
//            String demo = "com.skype.raider_145919.apk";
//            if (args.length > 0) {
//                demo = args[0];
//            }
//            ApkUtil apkUtil = new ApkUtil();
//            apkUtil.setmAaptPath("lib/aapt.exe");
//            ApkInfo apkInfo = apkUtil.getApkInfo(demo);
//            System.out.println(apkInfo);
//            System.out.println("----------");
//            System.out.println(apkInfo.getApplicationIcon());
//        } catch (Exception e) {
//            e.printStackTrace();
//        }

        //读出apk的图片
//        getIconName();
//        getIcon();

//        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
//        java.sql.Date d = new java.sql.Date(new java.util.Date().getTime());
//        String s = sdf.format(d);
//        Date date = sdf.parse(s);
//        System.out.println(d.toLocaleString());
//        java.testThread java.testThread = new java.testThread();
//        java.testThread.run();

//        ScheduledExecutorService service = Executors.newScheduledThreadPool(2);
//        service.scheduleAtFixedRate(new java.testThread(), 1000,15000, TimeUnit.MILLISECONDS);
//        service.scheduleAtFixedRate(new java.testThread2(), 1000,15000, TimeUnit.MILLISECONDS);

//        Timestamp nowTime = new Timestamp(System.currentTimeMillis());
//        System.out.print(nowTime.getTime()/1000);

//        String regx = "^[0-9]*$";
//        Pattern p = Pattern.compile(regx);
//        Matcher m = p.matcher("1.2");
//        boolean b = m.matches();
//        System.out.println(b);

//        String regx = "1\\d{10}";
//        Pattern p = Pattern.compile(regx);
//        Matcher m = p.matcher("");
//        boolean b = m.matches();
//        System.out.println(b);

//        String regx = "^[0-9a-zA-Z_-]+$";
//        Pattern p = Pattern.compile(regx);
//        Matcher m = p.matcher("");
//        boolean b = m.matches();
//        System.out.println(b);

//        String a = null;
//        System.out.println(null == a ? null : Long.parseLong(a.toString()));

//        String a = new String();
//        String b = null;
//        List list = new ArrayList<>();
//        list.add(b);
//        list.add(a);
//        System.out.println(list.toArray().toString());
//        list.add(a);
//        list.add(a);
//        System.out.println(list.toArray().toString());

//        Set set = new HashSet<>();
//        String a = new String();
//        set.add(a);
//        set.add(a);
//        System.out.println(set.size());

//        Object s = "";
//        System.out.print(s.toString());

//        Hashtable<String, String> temp = new Hashtable<>();
//        temp.put("aKey", "a");
//        temp.put("aKey", "a2");
//        temp.put("bKey", "b");
//        Iterator iter = temp.entrySet().iterator();
//        while (iter.hasNext()) {
//            Map.Entry entry = (Map.Entry)iter.next();
//            Object key = entry.getKey();
//            Object value = entry.getValue();
//            System.out.println(key.toString() + ": " + value.toString() + " keyHashCode: " + key.hashCode());
//        }

//        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
//        System.out.println(sdf.parse("2016-05-01"));

//        通配符替换
//        String a = "${acc_nbr}ddd${acc_nbr}adjfs${cust_name}";
//        String[] arr = a.split("$");
//        Pattern p = Pattern.compile("$");
//        Matcher m = p.matcher(a);
//        System.out.println(m.matches());
//        System.out.println(arr.length);
//        System.out.println(a.contains("${"));
//
//        if (a.contains("${")) {
//            char[] contentArr = a.toCharArray();
//            List<String> columNames = new ArrayList<>();
//            StringBuffer columName = new StringBuffer();
//            for (int i = 0; i< contentArr.length; i++) {
//                char contentChar = contentArr[i];
//                if (contentChar=='$' && contentArr[i+1] == '{') {
//                    i = i+2;
//                    while (contentArr[i] != '}') {
//                        columName.append(contentArr[i]);
//                        i++;
//                    }
//                    columNames.add(columName.toString());
//                    columName = new StringBuffer();
//                }
//            }
//            for (String test : columNames) {
//                System.out.println("---"+test);
//                a = a.replace("${" + test + "}", "cherry");
//            }
//            System.out.println(a);
//        }
//        Integer a = 8;
//        Integer b = 3;
//        Double c = ((double) a)/b;
//        DecimalFormat dff = new DecimalFormat("0.00");
//        System.out.println(dff.format(c));

//        for (int i = 0; i < 460022 ; i++) {
//            Integer a = 8;
//            Integer b = 3;
//            Double c = ((double) a)/b;
//            DecimalFormat dff = new DecimalFormat("0.00");
////            if (i==0 || i==460021) {
////                System.out.println(new Date());
////            }
//            System.out.println(new Date());
//        }

//        Integer jobFlag = -127;
//        Integer salesFlag = -127;
//        System.out.println(jobFlag==salesFlag);

//        Calendar c2 = Calendar.getInstance();
//        c2.set(Calendar.HOUR_OF_DAY,23);
//        c2.set(Calendar.MINUTE,59);
//        c2.set(Calendar.SECOND,59);
//        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
////        System.out.println(sdf.format(c2.getTime()));
//        System.out.println(c2.getTimeInMillis());

//        String lowerCode = "abcde";
//        System.out.println(lowerCode.substring(0,2));
//        System.out.println(lowerCode.substring(2, lowerCode.length()));

//        long a = 1466997669522L;
//        Long b = 1466997668595L;
//        Long c = 86400000L;
//        System.out.println(a-b<c);

//            DateFormat df2 = new SimpleDateFormat("yyyy-MM-dd");
//            Calendar c = Calendar.getInstance();
//            c.add(Calendar.MONTH, +(0));
//            c.set(Calendar.DAY_OF_MONTH, 1);//设置为1号
//            System.out.println(df2.format(c.getTime()));
//        String a = "12345-FAIL_INTEGRAL";
//        String[] aa = a.split("-");
//        System.out.println(aa[1]);

//        for (int i = 0; i<10; i++) {
//            int random = new Random().nextInt(10);
//            System.out.println(random);
//        }
//        String phoneSub = "1234567890".substring(0,7);
//        System.out.println(phoneSub);

//        System.out.println("啊啊啊");
//        String a = "100+%C3%A6%C2%89%C2%8B%C3%A6%C2%9C%C2%BA";
//        String b = "100%2B手机";
//        System.out.println(new String(b.getBytes("ISO-8859-1"), "UTF-8"));
//        System.out.println(URLDecoder.decode(a,"UTF-8"));

//        System.out.println(String.valueOf(new Date().getTime()));

//        Float a = 299.999f;
//        int b = (int) (a*100);
//        System.out.println(b);

//        Pattern p = Pattern.compile("(.*?<\\!\\[CDATA)(.*?\\] >)");
//        Matcher m = p.matcher("<xml><return_code><![CDATA[FAIL]]></return_code><return_msg><![CDATA[mch_id参数长度有误]]></return_msg></xml>");
//
//        String rtn ="";
//        while(m.find()){
//            rtn += m.group(1) +
//                    m.group(2).replaceAll("\\s", "&nbsp;");
//        }
//        System.out.println(rtn);
//        String responseString = "<xml><return_code><![CDATA[FAIL]]></return_code><return_msg><![CDATA[mch_id参数长度有误]]></return_msg></xml>";
//        responseString = responseString.replaceAll("<\\!\\[CDATA\\[", "");
//        responseString = responseString.replaceAll("]]>", "");
//        System.out.println(responseString);

//        System.out.println((new Date().getTime())/1000);

//        String a = "1234";
//        String b = "1235";
//        System.out.println(Long.parseLong(a) != Long.parseLong(b));

//        String base = "abcdefghijklmnopqrstuvwxyz0123456789";
//        Random random = new Random();
//        StringBuffer sb = new StringBuffer();
//        for (int i = 0; i < 32; i++) {
//            int number = random.nextInt(base.length());
//            sb.append(base.charAt(number));
//        }
//        System.out.println(sb.toString());

//        String a1 = "appid=wxb133be61f42dc4e1&body=中国电信贵州加油站-手机&device_info=WEB&mch_id=1383891702&nonce_str=dcoyo80ba7rjqaq7lfid6jon7pgdsr6c&notify_url=http://in.mobicloud.com.cn/weixin/model/payNotify&openid=oJO3uwu8f8MGn2opnSA09jRzQBtg&out_trade_no=1477471797989&spbill_create_ip=121.69.50.18&total_fee=1&trade_type=JSAPI&key=zrsa6zgxzhpl4rtn3gmmccg9nfh8h54l";
//        String a2 = "appid=wxb133be61f42dc4e1&body=中国电信贵州加油站-手机&device_info=WEB&mch_id=1383891702&nonce_str=dcoyo80ba7rjqaq7lfid6jon7pgdsr6c&notify_url=http://in.mobicloud.com.cn/weixin/model/payNotify&openid=oJO3uwu8f8MGn2opnSA09jRzQBtg&out_trade_no=1477471797989&spbill_create_ip=121.69.50.18&total_fee=1&trade_type=JSAPI&key=zrsa6zgxzhpl4rtn3gmmccg9nfh8h54l";
//        System.out.println(MD5.MD5Encode(a2).toUpperCase());
//
//        String a3= "appId=wxb133be61f42dc4e1&nonceStr=49xy088doc60sseowhhszy25d7j90ker&package2=prepay_id=wx20161026171552d241675aba0705109247&signType=MD5&timeStamp=1477473370&key=zrsa6zgxzhpl4rtn3gmmccg9nfh8h54l";
//CBAE4D4374CA6ABAFBE7836E6424A43B
//        System.out.println(unescapeUnicode("\"data\":{\"info\":{\"status\":\"1\",\"com\":\"shunfeng\",\"state\":\"3\",\"context\":[{\"time\":\"1478306865\",\"desc\":\"\\u5df2\\u7b7e\\u6536,\\u611f\\u8c22\\u4f7f\\u7528\\u987a\\u4e30,\\u671f\\u5f85\\u518d\\u6b21\\u4e3a\\u60a8\\u670d\\u52a1\"}"));
//        System.out.println(URLDecoder.decode("\"data\":{\"info\":{\"status\":\"1\",\"com\":\"shunfeng\",\"state\":\"3\",\"context\":[{\"time\":\"1478306865\",\"desc\":\"\\u5df2\\u7b7e\\u6536,\\u611f\\u8c22\\u4f7f\\u7528\\u987a\\u4e30,\\u671f\\u5f85\\u518d\\u6b21\\u4e3a\\u60a8\\u670d\\u52a1\"}","utf-8"));
        String jsonResult = "{\"msg\":\"\",\"status\":\"0\",\"error_code\":\"0\",\"data\":{\"info\":{\"status\":\"1\",\"com\":\"shunfeng\",\"state\":\"3\",\"context\":[{\"time\":\"1478306865\",\"desc\":\"\\u5df2\\u7b7e\\u6536,\\u611f\\u8c22\\u4f7f\\u7528\\u987a\\u4e30,\\u671f\\u5f85\\u518d\\u6b21\\u4e3a\\u60a8\\u670d\\u52a1\"},{\"time\":\"1478304563\",\"desc\":\"\\u5feb\\u4ef6\\u4ea4\\u7ed9\\u5468\\u632f\\u4e91\\uff0c\\u6b63\\u5728\\u6d3e\\u9001\\u9014\\u4e2d\\uff08\\u8054\\u7cfb\\u7535\\u8bdd\\uff1a18536891936\\uff09\"},{\"time\":\"1478304563\",\"desc\":\"\\u5feb\\u4ef6\\u5230\\u8fbe \\u3010\\u592a\\u539f\\u5e02\\u5c0f\\u5e97\\u533a\\u534e\\u5e9c\\u8425\\u4e1a\\u70b9\\u3011\"},{\"time\":\"1478280301\",\"desc\":\"\\u5feb\\u4ef6\\u5728\\u3010\\u592a\\u539f\\u5c0f\\u5e97\\u96c6\\u6563\\u4e2d\\u5fc3\\u3011\\u5df2\\u88c5\\u8f66\\uff0c\\u51c6\\u5907\\u53d1\\u5f80 \\u3010\\u592a\\u539f\\u5e02\\u5c0f\\u5e97\\u533a\\u534e\\u5e9c\\u8425\\u4e1a\\u70b9\\u3011\"},{\"time\":\"1478261758\",\"desc\":\"\\u5feb\\u4ef6\\u5230\\u8fbe \\u3010\\u592a\\u539f\\u5c0f\\u5e97\\u96c6\\u6563\\u4e2d\\u5fc3\\u3011\"},{\"time\":\"1478184946\",\"desc\":\"\\u5feb\\u4ef6\\u5728\\u3010\\u5317\\u4eac\\u9996\\u90fd\\u673a\\u573a\\u96c6\\u6563\\u4e2d\\u5fc32\\u3011\\u5df2\\u88c5\\u8f66\\uff0c\\u51c6\\u5907\\u53d1\\u5f80 \\u3010\\u592a\\u539f\\u5c0f\\u5e97\\u96c6\\u6563\\u4e2d\\u5fc3\\u3011\"},{\"time\":\"1478181800\",\"desc\":\"\\u5feb\\u4ef6\\u5230\\u8fbe \\u3010\\u5317\\u4eac\\u9996\\u90fd\\u673a\\u573a\\u96c6\\u6563\\u4e2d\\u5fc32\\u3011\"},{\"time\":\"1478175926\",\"desc\":\"\\u5feb\\u4ef6\\u5728\\u3010\\u5317\\u4eac\\u6d77\\u6dc0\\u5317\\u7406\\u5de5\\u8425\\u4e1a\\u70b9\\u3011\\u5df2\\u88c5\\u8f66\\uff0c\\u51c6\\u5907\\u53d1\\u5f80 \\u3010\\u5317\\u4eac\\u9996\\u90fd\\u673a\\u573a\\u96c6\\u6563\\u4e2d\\u5fc32\\u3011\"},{\"time\":\"1478162638\",\"desc\":\"\\u987a\\u4e30\\u901f\\u8fd0 \\u5df2\\u6536\\u53d6\\u5feb\\u4ef6\"}],\"_source_com\":\"\"},\"com\":\"shunfeng\",\"company\":{\"url\":\"http:\\/\\/www.kuaidi100.com\\/all\\/sf.shtml?from=openv\",\"fullname\":\"\\u987a\\u4e30\\u901f\\u8fd0\",\"shortname\":\"\\u987a\\u4e30\",\"icon\":{\"id\":\"16\",\"smallurl\":\"https:\\/\\/ss2.baidu.com\\/6ONYsjip0QIZ8tyhnq\\/it\\/u=1807529516,3291075151&fm=58\",\"smallpos\":\"0,32\",\"middleurl\":\"https:\\/\\/ss1.baidu.com\\/6ONXsjip0QIZ8tyhnq\\/it\\/u=1835223070,3312272045&fm=58\",\"middlepos\":\"0,180\",\"normal\":\"https:\\/\\/ss2.baidu.com\\/6ONYsjip0QIZ8tyhnq\\/it\\/u=3775999286,734565944&fm=58\"},\"icon249\":\"https:\\/\\/ss2.baidu.com\\/6ONYsjip0QIZ8tyhnq\\/it\\/u=659014994,2919842554&fm=58\",\"website\":{\"title\":\"www.sf-express.com\",\"url\":\"http:\\/\\/www.sf-express.com\"},\"tel\":\"95338\",\"auxiliary\":[{\"title\":\"\\u7f51\\u70b9\\u67e5\\u8be2\",\"url\":\"http:\\/\\/www.sf-express.com\\/cn\\/sc\\/dynamic_functions\\/store\\/?from=kuaidi100\"},{\"title\":\"\\u7f51\\u4e0a\\u5bc4\\u4ef6\",\"url\":\"http:\\/\\/www.sf-express.com\\/cn\\/sc\\/dynamic_functions\\/order\\/?from=kuaidi100\"}],\"timecost\":{\"btn_show\":\"1\",\"url\":\"http:\\/\\/www.sf-express.com\\/mobile\\/cn\\/sc\\/dynamic_functions\\/payFee\\/payFee.html\"},\"onlineorder\":{\"btn_show\":\"1\",\"url\":\"http:\\/\\/www.sf-express.com\\/mobile\\/cn\\/sc\\/dynamic_functions\\/ship\\/ship.html\"}},\"source\":{\"logo\":\"https:\\/\\/ss2.baidu.com\\/6ONYsjip0QIZ8tyhnq\\/it\\/u=1429564979,1787167512&fm=58\",\"title\":\"\\u6570\\u636e\\u6765\\u81ea\\u5feb\\u9012100\",\"url\":\"http:\\/\\/www.kuaidi100.com\\/?from=baidu_ala\",\"name\":\"\\u5feb\\u9012100\",\"showName\":\"\\u5feb\\u9012100\"},\"kuaidiSource\":{\"logo\":\"https:\\/\\/ss2.baidu.com\\/6ONYsjip0QIZ8tyhnq\\/it\\/u=1429564979,1787167512&fm=58\",\"title\":\"\\u6570\\u636e\\u6765\\u81ea\\u5feb\\u9012100\",\"url\":\"http:\\/\\/www.kuaidi100.com\\/?from=baidu_ala\",\"name\":\"\\u5feb\\u9012100\",\"showName\":\"\\u5feb\\u9012100\"}}}";
//        Gson gson=new Gson();
//        JsonParser parser = new JsonParser();
//        JsonElement el = parser.parse(jsonResult);
//        String aString=gson.toJson(jsonResult);
//        System.out.println(aString);
//        byte[] bt = jsonResult.getBytes("utf-8");
//        String ret = new String(bt, "utf-8");
//        System.out.println(ret);
        JSONObject jsonObject=JSONObject.parseObject(jsonResult);
        System.out.println(jsonObject.toJSONString());
    }

    public static String unescapeUnicode(String str){
        StringBuffer b=new StringBuffer();
        Matcher m = Pattern.compile("\\\\u([0-9a-fA-F]{4})").matcher(str);
        while(m.find())
            b.append((char)Integer.parseInt(m.group(1),16));
        return b.toString();
    }











    public static double div(double v1, double v2, int scale) {
        if (scale < 0) {
            throw new IllegalArgumentException(
                    "The scale must be a positive integer or zero");
        }
        BigDecimal b1 = new BigDecimal(Double.toString(v1));
        BigDecimal b2 = new BigDecimal(Double.toString(v2));
        return b1.divide(b2, scale, BigDecimal.ROUND_HALF_UP).doubleValue();
    }


    private static String apkoldName = "";
//    private static String apkPath = "com.skype.raider_145919.apk";
    private static String apkPath = "cn.kuwo.player-4214.apk";
    public static void getIconName() {
        try {
            Runtime rt = Runtime.getRuntime();
            String order = "lib/aapt.exe d badging \"" + apkPath + "\"";
            System.out.println(order);
            Process proc = rt.exec(order);
            InputStream stderr = proc.getInputStream();
            InputStreamReader isr = new InputStreamReader(stderr);
            BufferedReader br = new BufferedReader(isr);
            String line = null;
            while ((line = br.readLine()) != null) {
                if (line.contains("application:")) {
                    apkoldName = line.substring(line.lastIndexOf("/") + 1,line.lastIndexOf("'")).trim().toLowerCase();
                    break;
                }
            }
            System.out.println(apkoldName);
        } catch (Throwable t) {
            t.printStackTrace();
        }
    }
    public static void getIcon() {
        FileInputStream in = null;
        FileOutputStream out = null;
        ZipInputStream zipin = null;
        String apknewName = "icon.png";
        String iconpath = "d:\\" + apknewName;
        File apkFile = new File(apkPath);
        try {
            in = new FileInputStream(apkFile);
            zipin = new ZipInputStream(in);
            ZipEntry entry = null;
            while ((entry = zipin.getNextEntry()) != null) {
                String name = entry.getName().toLowerCase();
                if (name.endsWith("/" + apkoldName)&& name.contains("drawable") && name.contains("res")) {
                    if (apkoldName.lastIndexOf(".") <= 0) {
                        apknewName = "icon.jpg";
                    } else {
                        apknewName = "icon" + apkoldName.substring(apkoldName.lastIndexOf("."));
                    }
                    iconpath = "d:\\" + apknewName;
                    out = new FileOutputStream(new File(iconpath));
                    byte[] buff = new byte[1024];
                    int n = 0;
                    while ((n = zipin.read(buff, 0, buff.length)) != -1) {out.write(buff, 0, n);}
                } else if (name.endsWith("/" + apkoldName)&& name.contains("raw") && name.contains("res")) {
                    if (apkoldName.lastIndexOf(".") <= 0) {
                        apknewName = "icon_.jpg";
                    } else {
                        apknewName = "icon_temp"+ apkoldName.substring(apkoldName.lastIndexOf("."));
                    }
                    iconpath = "d:\\" + apknewName;
                    out = new FileOutputStream(new File(iconpath));
                    byte[] buff = new byte[1024];
                    int n = 0;
                    while ((n = zipin.read(buff, 0, buff.length)) != -1) {out.write(buff, 0, n);}
                }
            }
            out = null;
            zipin.closeEntry();
            entry = null;
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                if (zipin != null) {zipin.close();}
                if (in != null) {in.close();}
            } catch (Exception e) { e.printStackTrace();}
        }
    }
}
