package sort;

/**
 * Created by anjunli on 2021/8/22.
 * 反转排序：对数组两边的元素进行替换，所以只需要循环数组长度的一遍即可；例如长度为7的数组，循环次数为3
 **/
public class ReverseSort {
    public static void main(String[] args) {
        int[] arr={10,23,1,1,3,5};
        int[] arr1 = reverseSort(arr);
        for(int i=0;i<arr1.length;i++){
            System.out.println(arr1[i]+",");
        }    }

    public static int[] reverseSort(int[] array){
        int mid = (int)Math.floor(array.length / 2);
        for (int i = 0; i < mid ; i++) {
            int temp = array[array.length - 1 - i];
            array[array.length - 1 - i] = array[i];
            array[i] = temp;
        }
        return array;
    }
}
