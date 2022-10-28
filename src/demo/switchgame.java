package demo;

/**
 * 任务二：实现 Switch Game  关键算法(25  分)
 * 有 n 盏灯， 编号 1~n (0<n<100)。第 1 个人把所有灯打开，
 * 第 2 个人按下所有编号为 2 的倍数的开关(这些灯将被关掉) ，
 * 第 3 个人 按下所有编号为 3 的倍数的开关(其中关掉的灯将被打开， 开着的灯 将被关闭) ，
 * 依次类推。输入灯数和人数， 输出开着的灯的编号。比如
 * 输入： 10 2 输出最后亮灯的编号： 1,3,5,7,9
 * 注意：使用循环语句实现。
 */
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class switchgame {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("灯数");
        int dengcount = input.nextInt();
        System.out.println("人数");
        int userCount = input.nextInt();

        //把灯放入Arraylist
        //因为要用编号，所以要用泛型
        List<Integer> List = new ArrayList();
        for (int i = 0; i < dengcount; i++) {
            //默认打开所有灯
            List.add(1);
        }
        //一个人从2开始打开所有的灯
        for (int i = 2; i <userCount ; i++) {
            //遍历灯
            for (int j = 0; j < dengcount; j++) {
                //如果灯的编号模2等于0，则表示匹配，切换状态
                if (j % i == 0) {
                    Integer integer = List.get(j-1);
                    //改变灯灯的状态
                    List.set(j, integer * -1);
                }
            }
        }
        String result = "";
        for (int i = 1; i < dengcount; i++) {
            if (List.get((i - 1)) == 1) {
                result = result + i + ",";
            }
        }
            System.out.println(result);
            //判断当前字母的最后以为是不是","
            if (result.lastIndexOf(",") == result.length() - 1) {
                //如果当前字母最后一位是逗号则去掉
                result = result.substring(0, result.length() - 1);
             }
            System.out.println("result = " + result);
        }

}
