package lintcode.simple;

import org.junit.Test;

/**
 * Created by anjunli on 2021/1/14.
 * https://www.lintcode.com/problem/implement-strstr/description
 * 对于一个给定的 source 字符串和一个 target 字符串，你应该在 source 字符串中找出 target 字符串出现的第一个位置(从0开始)。如果不存在，则返回 -1。
 **/
public class test13 {
    public static void main(String[] args) {
        String source="bcdabcdfdabc";
        String target="abc";
        //java 字符串自带的方法可以直接求出
        System.out.println(source.indexOf(target));

        //自己写方法
        int i = test2(source, target);
        System.out.println(i);
    }
    public static int test2(String source,String target){
        // source和target都应该不为空
        if(source==null||target==null){
            return -1;
        }
        //source的长度大于target的长度
        if(source.length()<target.length()){
            return -1;
        }
        //target可能的起始位置 source.length-target.length
        for(int i=0;i<source.length()-target.length();i++){
            int k=i;
            for(int j=0;j<target.length();j++){
                if(source.charAt(k) == target.charAt(j)){
                    //最后一个字符匹配完成，输出答案
                    if(j == target.length() - 1){
                        return i;
                    }
                    k++;
                }else {
                    break;
                }
            }
        }
        return -1;
    }
}
