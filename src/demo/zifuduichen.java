package demo;

import java.util.Scanner;

public class zifuduichen {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("输入");
        String next = input.next();


        boolean isEquas = true;
        for (int i = 0; i < next.length() / 2; i++) {
            if (next.substring(i, i + 1).equals(next.substring(next.length() - 1 - i, i))) {
                continue;
            } else {

                isEquas = false;
                break;
            }



        }
        if (isEquas) {
            System.out.println("相等");
        } else {
            System.out.println("不相等");
        }
    }
}
