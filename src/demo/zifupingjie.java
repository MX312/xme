package demo;

import java.util.Arrays;

public class zifupingjie {
    public static void main(String[] args) {
        //定义字符串数组，声明式定义直接内容，不需要长度
        String[] a = {"Hello","Hello","Hello","Hello","Hello"};
        String[] b = {"Jack", "Tom", "Lee", "John", "Alisa"};
        String[] c = new String[a.length];
        for (int i = 0; i < a.length; i++) {
            c[i] = a[i] + b[i];
        }
        System.out.print("{");
        for (int i = 0; i<c.length;i++ ) {

            if (i == c.length-1) {
                System.out.print("\""+c[i]+"\""+"}");
            }else{
                System.out.print("\""+c[i]+"\""+",");
            }

        }

    }
}
