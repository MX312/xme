package demo;

import java.util.Scanner;

public class tiji {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //第一步,接收输入半径值的数量

        System.out.println("请输入球的数量");
        int count = scanner.nextInt();

        //第二步,接收具体的每组球的半径
        double[] qiuArray = new double[count];
        for (int i = 0; i < count; i++) {
            double v = scanner.nextDouble();
            qiuArray[i] = v;
        }

        //第三步,计算球的体积
        double[] qiuTiJiArray = new double[count];
        for (int i = 0; i < count; i++) {
            double r = qiuArray[i];
            qiuTiJiArray[i] = 4.0 / 3.0 * 3.1415927 * Math.pow(r, 3);
            //System.out.println("球的体积是"+qiuTiJiArray[i]);
            //打印保留小数,printf是格式化输出
            System.out.printf("球的体积:%.3f", qiuTiJiArray[i]);
        }
    }
}