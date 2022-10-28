package demo;

import java.util.Scanner;

public class zhongguojie {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();
        //定义数量
        int count = 0;
        int sum = 0;

        //遍历
        for (int i = 1; i <input ; i++) {
            if (i % 7 == 0) {
                count++;
                sum += 1;
            }
        }

    }
}
