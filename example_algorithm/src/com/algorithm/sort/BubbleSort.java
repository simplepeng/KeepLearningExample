package com.algorithm.sort;

import java.util.Arrays;

/**
 * 冒泡排序
 * 时间复杂度 O(n²)
 */
public class BubbleSort {

    public static void main(String[] args) {
        int[] arr = {4, 1, 87, 33, 66, 45};
        System.out.println(Arrays.toString(arr));
        bubbleSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void bubbleSort(int[] arr) {
        int len = arr.length;
        //
        for (int i = 0; i < len; i++) {
            //
            for (int j = 0; j < len - i; j++) {
                //比较当前位置和下一位谁大
                if (j < len - 1 && arr[j] > arr[j + 1]) {
                    //交互位置
                    int tmp = arr[j + 1];
                    arr[j + 1] = arr[j];
                    arr[j] = tmp;
                }
            }
        }
    }


}
