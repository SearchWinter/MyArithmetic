package lintcode.simple;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * @Description
 * 给你一个整数n. 从 1 到 n 按照下面的规则打印每个数：
 *
 * 如果这个数被3整除，打印fizz.
 * 如果这个数被5整除，打印buzz.
 * 如果这个数能同时被3和5整除，打印fizz buzz.
 * 如果这个数既不能被 3 整除也不能被 5 整除，打印数字本身。
 * @Date 2020/10/2  19:54
 **/
public class test9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int i = scanner.nextInt();

        /**方法一：简单思路*/
        for (int j = 1; j <=i ; j++) {
            if (j%3==0){
                System.out.println("fizz");
            }else if (j%5==0){
                System.out.println("buzz");
            }else if(j%3==0&j%5==0){
                System.out.println("fizz buzz,");
            }else {
                System.out.println(j);
            }
        }

        /** 方法二：使用三元运算符搞定   两个条件排列组合*/
        int i1 = scanner.nextInt();
        ArrayList<Object> list = new ArrayList<>();
        for (int j = 1; j <=i1 ; j++) {
            list.add(j%3==0 ?(j%5==0?"fizz buzz":"fizz"):(j%5==0?"buzz":j));
        }
        System.out.println(list);
    }
}
