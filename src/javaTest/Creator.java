package javaTest;

import java.io.*;
import java.math.BigDecimal;
import java.text.DateFormat;
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
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

        Integer jobFlag = -127;
        Integer salesFlag = -127;
        System.out.println(jobFlag==salesFlag);
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
