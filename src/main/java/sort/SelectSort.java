package sort;

/**
 * Created by anjunli on 2021/8/22.
 * 直接选择排序:找出最大/小元素的下标，将它和最后一个元素交换位置
 **/
public class SelectSort {
    public static void main(String[] args) {
        int[] array = {10, 23212, 323, 32};
        int[] ints = selectSort(array);
        for (int i=0;i<ints.length;i++){
            System.out.println(ints[i]);
        }
    }
    public static int[] selectSort(int[] array){
        for (int i = 1; i <array.length ; i++) {
            //保存下标
            int index = 0;
            //找出待排序中的最大元素的下标
            /** 关键在于待排序的数组，最后一个元素的下标 */
            for (int j =1; j <=array.length-i ; j++) {
                if(array[index]<array[j]){
                    index=j;
                }
            }
            //最后一个元素的下标始终是 length-i
            int temp = array[array.length - i];
            array[array.length - i] = array[index];
            array[index] = temp;
        }
        return array;
    }
}
