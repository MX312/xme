package demo;

import java.util.Scanner;

public class kaoshi {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.next();

        //定义元音数组
        char[] yuanyin={'a','e','i','o','u'};
        //收集元音字母数量
        int[] yuancount = new int[5];
        //遍历数组，进行比较
        for (int i = 0; i < input.length() ; i++) {
            //将
            char sh = input.charAt(i);
            for (int j = 0; j <yuanyin.length ; j++) {
                if (sh == yuanyin[j]) {
                    break;
                }
            }

        }
        //输出
        for (int i = 0; i <yuanyin.length ; i++) {
            System.out.println(yuanyin[i]+":"+yuancount[i]);
        }
    }


}






