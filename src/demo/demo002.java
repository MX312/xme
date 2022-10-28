package demo;
import java.util.Scanner;

public class demo002 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
//定义n个人
        System.out.print("有几个评委呢？");
        int n = scanner.nextInt();
//定义rate数组存储评委评分
        int[] rate = new int[n];
//调用scanner函数录入评分
        for (int i = 0; i < n;i++){
            System.out.print("第 " + (i+1) + " 个评委的评分是：");
            rate[i] = scanner.nextInt();
        }
//for循环输出数组rate
        for (int i = 0; i < n;i++){
            System.out.print(rate[i]);
            if(i < n - 1){
                System.out.print(",");
            }
        }

        System.out.println();
//排序
        int min = rate[0];
        int max = rate[0];
        int sum = 0;

        for (int i = 0; i < n;i++){
            if(rate[i] < min){
                min = rate[i];
            }

            if(rate[i] > max){
                max = rate[i];
            }

            sum += rate[i];
        }

        sum = sum - (min + max);

        float avg = sum / (float)(n - 2);

        System.out.println("平均分:" + avg);
    }
}
