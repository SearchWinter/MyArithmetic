package search;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

/**
 * @Description 二分查找
 * @Author anjunli
 * @Date 2020/11/28  22:55
 **/
public class BinarySearch {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(3, 23, 44, 55, 66, 77, 88, 99);

        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        System.out.println(search1(list, num));

        int start = 0;
        int end = list.size() - 1;
        System.out.println(search2(list, num, start, end));

    }

    public static int search1(List<Integer> list, int num) {

        if (list == null || list.size() == 0 || list.get(0) > num || list.get(list.size() - 1) < num) {
            return -1;
        }

        int start = 0;
        int end = list.size() - 1;
        int mid = (start + end) / 2;

        for (int i = 0; i < list.size(); i++) {

            int midValue = list.get(mid);

            if (num == midValue) {
                return mid;
            }

            if (num > midValue) {
                start = mid + 1;
                mid = (start + end) / 2;
            }

            if (num < midValue) {
                end = mid - 1;
                mid = (start + end) / 2;
            }
        }
        return -1;
    }

    //使用递归的二分查找
    public static int search2(List<Integer> list, int num, int start, int end) {
        //list要有效，用起始和结束的值，来判断目标值是否在list里面
        if (list == null || list.size() == 0 || list.get(0) > num || list.get(list.size() - 1) < num) {
            return -1;
        }

        int mid = (start + end) / 2;

        int midValue = list.get(mid);
        if (num == midValue) {
            return mid;
        } else if (num > midValue) {
            start = mid + 1;
            return search2(list, num, start, end);
        } else {
            end = mid - 1;
            return search2(list, num, start, end);
        }
    }

    @Test
    public void test() {
        int mid = (1 + 2) / 2;
        System.out.println(mid);
    }
}
