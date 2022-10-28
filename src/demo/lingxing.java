package demo;

import java.util.Scanner;

public class lingxing {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();

        for (int i = 1; i <input+1 ; i++) {
            System.out.print("/");
            for (int j = input; j >i ; j--) {
                System.out.print("/");
            }
            for (int j = 0; j <2*i-1 ; j++) {
                System.out.print("*");
            }

            System.out.println();

        }
        for (int i = 0; i <input ; i++) {
            System.out.print("1");
            for (int j = 0; j <i+1 ; j++) {
                System.out.print("2");
            }
            for (int k = input-1; k >2*i-1 ; k--) {
                System.out.print("*");
            }
            System.out.println();
        }



    }
}
