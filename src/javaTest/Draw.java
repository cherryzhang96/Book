package javaTest;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: zhangchen
 * Date: 2017/5/17
 * Time: 10:52
 * To change this template use File | Settings | File Templates.
 */
public class Draw {

    /**
     * 根据Math.random()产生一个double型的随机数，判断每个奖品出现的概率
     * @param prizes
     * @return random：奖品列表prizes中的序列（prizes中的第random个就是抽中的奖品）
     */
    public static int getPrizeIndex(List<DrawModel> prizes) {
        DecimalFormat df = new DecimalFormat("######0.00");
        int random = -1;
        try{
            //计算总权重
            double sumWeight = 0;
            for(DrawModel p : prizes){
                sumWeight += p.getPrize_weight();
            }

            //产生随机数
            double randomNumber;
            randomNumber = Math.random();

            //根据随机数在所有奖品分布的区域并确定所抽奖品
            double d1 = 0;
            double d2 = 0;
            for(int i=0;i<prizes.size();i++){
                d2 += Double.parseDouble(String.valueOf(prizes.get(i).getPrize_weight()))/sumWeight;
                if(i==0){
                    d1 = 0;
                }else{
                    d1 +=Double.parseDouble(String.valueOf(prizes.get(i-1).getPrize_weight()))/sumWeight;
                }
                if(randomNumber >= d1 && randomNumber <= d2){
                    random = i;
                    break;
                }
            }
        }catch(Exception e){
            System.out.println("生成抽奖随机数出错，出错原因：" +e.getMessage());
        }
        return random;
    }

    public static void main(String[] agrs) {
        int i = 0;
        int[] result = new int[6];
        List<DrawModel> prizes = new ArrayList<>();

//        获奖种类 奖品	 中奖概率
//        一等奖	5000棒豆	 0.01%
//        二等奖	1000棒豆	 0.05%
//        三等奖	500棒豆	 5.00%
//        四等奖	200棒豆	 10.00%
//        参与奖	100棒豆	 32.00%

        DrawModel p1 = new DrawModel();
        p1.setPrize_name("5000棒豆");
        p1.setPrize_weight(1);//设置奖品的权重
        prizes.add(p1);

        DrawModel p2 = new DrawModel();
        p2.setPrize_name("1000棒豆");
        p2.setPrize_weight(5);
        prizes.add(p2);

        DrawModel p3 = new DrawModel();
        p3.setPrize_name("500棒豆");
        p3.setPrize_weight(500);
        prizes.add(p3);

        DrawModel p4 = new DrawModel();
        p4.setPrize_name("200棒豆");
        p4.setPrize_weight(1000);
        prizes.add(p4);

        DrawModel p5 = new DrawModel();
        p5.setPrize_name("100棒豆");
        p5.setPrize_weight(3200);
        prizes.add(p5);

        DrawModel p6 = new DrawModel();
        p6.setPrize_name("未中奖");
        p6.setPrize_weight(5294);
        prizes.add(p6);

        System.out.println("抽奖开始");
        for (i = 0; i < 1000; i++)// 打印1000个测试概率的准确性
        {
            int selected = getPrizeIndex(prizes);
            System.out.println("第" + i + "次抽中的奖品为：" + prizes.get(selected).getPrize_name());
            result[selected]++;
            System.out.println("--------------------------------");
        }
        System.out.println("抽奖结束");
        System.out.println("每种奖品抽到的数量为：");
        System.out.println("一等奖：" + result[0]);
        System.out.println("二等奖：" + result[1]);
        System.out.println("三等奖：" + result[2]);
        System.out.println("四等奖：" + result[3]);
        System.out.println("参与奖：" + result[4]);
        System.out.println("未中奖：" + result[5]);
    }
}
