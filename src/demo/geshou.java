package demo;

import java.util.Scanner;

public class geshou {
    public static void main(String[] args) {
        //输入
        Scanner scanner = new Scanner(System.in);
        System.out.println("输入评委数量");
        int count = scanner.nextInt();
        System.out.println("评委数量为" + count);

        //定义数组，长度为评委数量
        int[] scoreArry = new int[count];


        //接收每个评委分数
        for (int i = 0; i<count ; i++){
            int score = scanner.nextInt();
            scoreArry[i] = score;
//            System.out.println("score = " + score);

        }
        int sum = 0;
        for (int i = 1; i < count - 1; i++) {

        }


        //排序
        for (int i = 0; i<count-1; i++){
            for (int j = 0; j < count -i- 1; j++) {
                if (scoreArry[j] > scoreArry[j + 1]) {
                    int temp = scoreArry[j];
                    scoreArry[j] = scoreArry[j + 1];
                    scoreArry[j+1]=temp;
                }

            }

        }
    }
}
