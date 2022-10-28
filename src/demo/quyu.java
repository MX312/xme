package demo;

import java.util.Scanner;
/**
 * 任务三：实现 2^x mod n = 1  关键算法(25  分)
 * 给你一个数字 n，找到满足 2^x mod n = 1 的最小值 x，
 * 如果 x 存在，则输出“2 ^x mod n = 1”，
 * 否则输出“2 ^? mod n = 1”，您 需要用真实的 x 和 n 的值来替代字符串中的变量。
 * 例如输入 5，输出 答案为 2^4 mod 5 = 1。
 */
public class quyu {
    public static void main(String[] args) {
        // 接收用户输入:
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入整数n:");
        int n = scanner.nextInt();

        //开始遍历,来寻找最小的x,使用for循环做一个无限循环
        int x=1;

        //定义一个每次遍历的结果,来保存每次乘以2时的值,其实就是2的几次方2^x
        int result=1;
        for (; ; x++) {
//            result=result*2; 传统写法,如果result和int类型不一致,有可能会报错
            result*=2;  //简略写法,包含了隐式转化,这样的代码安全性比较高
            if (result % n==1) {
                System.out.println("2 ^"+x+" mod "+n+" = 1");
                break;
            }
            if (x == n) {
                System.out.println("2 ^? mod "+n+" = 1");
            }

        }
    }
}
