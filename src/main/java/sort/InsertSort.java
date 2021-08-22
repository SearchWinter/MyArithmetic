package sort;

/**
 * @ClassName InsertSort
 * @Description 未掌握
 * @Author Li Anjun
 * @Date 2020/6/11  12:53
 **/
public class InsertSort {
    public static void main(String[] args) {
        int[] arr = {10, 23, 1, 1, 3, 5};
        int[] arr1 = InsertSort(arr);
        for (int i = 0; i < arr1.length; i++) {
            System.out.println(arr1[i] + ",");
        }
    }

    public static int[] InsertSort(int[] arr) {
        // 从下标为1的元素开始选择合适的位置插入，因为下标为0的只有一个元素，默认是有序的
        for (int i = 1; i < arr.length; i++) {
            //将arr[i],向前移动
            //j=i; j--的目的就是从未排序的第一个，和已排序的队列依次比较。
            //arr[i]就是要插入的数，他要和前面依次比较
            for (int j = i; j > 0; j--) {
                if (arr[j] < arr[j - 1]) {
                    int tmp = arr[j - 1];
                    arr[j - 1] = arr[j];
                    arr[j] = tmp;
                }
            }
        }
        return arr;
    }
}
