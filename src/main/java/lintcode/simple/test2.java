package lintcode.simple;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

/**
 * @ClassName test2
 * @Description 设计一个算法，计算出n阶乘中尾部零的个数
 * @Author Li Anjun
 * @Date 2020/6/11  16:06
 **/
public class test2 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int num=scanner.nextInt();

        int sum=Factorial(num);
        System.out.println(sum);
        System.out.println(num+"阶乘尾部0的个数为："+zero(sum));

    }
    //计算一个整数的阶乘
    public static int Factorial(int a){
        int factor=1;
        for(int i=1;i<=a;i++){
            factor=factor*i;
        }
        return factor;
    }
    //可以将每个数拆分成其素因子的乘积，可以发现，0是由2*5产生的，
    // 而5的数量一定小于2的数量，因此5的个数决定了结尾0的个数。
    //只要计算n的阶乘中，5这个素因子出现多少次即可。
    //求出尾部的0
    public static int zero(int a){
        int sum=0;
        while (a!=0){
            sum+=a/5;
            a=a/5;
        }
        return sum;
    }
}
