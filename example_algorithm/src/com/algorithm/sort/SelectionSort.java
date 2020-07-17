import java.util.Arrays;

public class SelectionSort {

    public static void main(String[] args) {
        int arr[] = { 1, 33, 22, 11, 66, 33,89, 75, 24 };
        System.out.println(Arrays.toString(arr));
        selectionSort(arr);
        System.out.println(Arrays.toString(arr));
    }

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
            Utils.swap(arr, i, minIndex);
        }

    }

}