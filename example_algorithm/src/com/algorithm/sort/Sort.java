import java.util.Arrays;

public class Sort {

    public static void swap(int[] arr, int a, int b) {
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }

    public static void main(String[] args) {
        int arr[] = { 1, 33, 22, 11, 66, 33, 89, 75, 24 };
        System.out.println(Arrays.toString(arr));

        quickSort(arr);
        // selectionSort(arr);
        // insertionSort(arr);

        System.out.println(Arrays.toString(arr));
    }

    /**
     * 冒泡排序
     */
    public static void bubbleSort(int[] arr) {
        int len = arr.length;
        // 循环次数为数组容量
        for (int i = 0; i < len; i++) {
            // 循环len-i次，因为完成一次循环，最大的元素就会被移动至末尾
            for (int j = 0; j < len - i; j++) {
                // 比较当前位置和下一位谁大
                if (j < len - 1 && arr[j] > arr[j + 1]) {
                    // 交互位置
                    swap(arr, j, j + 1);
                }
            }
        }
    }

    /**
     * 快速排序
     */
    private static void quickSort(int[] arrr){
        
    }

    /**
     * 选择排序
     */
    private static void selectionSort(int[] arr) {
        int length = arr.length;
        int minIndex = 0;

        for (int i = 0; i < length; i++) {
            minIndex = i;
            for (int j = i + 1; j < length; j++) {
                if (arr[minIndex] > arr[j]) {
                    minIndex = j;
                }
            }
            swap(arr, i, minIndex);
        }
    }

    /**
     * 插入排序
     */
    private static void insertionSort(int[] arr) {
        int length = arr.length;

        // 下标从1开始，因为0下标已经被当成有序序列
        for (int i = 1; i < length; i++) {
            int current = arr[i];//当前要插入的元素
            int preIndex = i - 1;//未排序序列的index

            // 如果未排序的元素大于当前要插入的元素，继续执行循环
            // 并且preIndex的下标要不小于0
            while (preIndex >= 0 && arr[preIndex] > current) {
                arr[preIndex + 1] = arr[preIndex];// preIndex的元素后移一位
                preIndex--;// 已排序序列下标减一，继续比较
            }

            // 当preIndex下标的元素不大于current时，就插入在preIndex后面
            arr[preIndex + 1] = current;
        }
    }
}