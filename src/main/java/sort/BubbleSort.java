package sort;

import java.lang.reflect.Array;

/**
 * @ClassName BubbleSort
 * @Description 冒泡排序
 * @Author Li Anjun
 * @Date 2020/6/11  11:07
 **/
public class BubbleSort {
    public static void main(String[] args) {
        int[] arr={10,23,1,1,3,5};
        int[] arr1 = sort(arr);
        for(int i=0;i<arr1.length;i++){
            System.out.println(arr1[i]+",");
        }
    }

    public static int[] sort(int[] arr1){
        //循环次数
        // i是从1开始的，不然内部循环，数组会越界
        for(int i=1;i<arr1.length;i++){
            //从未排序的数组中，找到其中最大的数
            //length-i就是还未排序的数组
            for(int j=0;j<arr1.length-i;j++){
                if (arr1[j]>arr1[j+1]){
                    int tmp=arr1[j];
                    arr1[j]=arr1[j+1];
                    arr1[j+1]=tmp;
                }
            }
        }
        return arr1;
    }
}
