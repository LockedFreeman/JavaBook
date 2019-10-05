package Classwork6;

import org.jetbrains.annotations.NotNull;

public class ArraysUtil {
    int getMaximum(int[] arr) {
        int max = arr[0];
        for (int el : arr) {
            if (max < el) {
                max = el;
            }
        }
        return max;
    }

    int getMinimum(int[] arr) {
        return -1;
    }

    void bubbleSort(@NotNull int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    swap(arr, j, j + 1);
                }
            }
        }
    }

    void bubbleSortReversed(@NotNull int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    swap(arr, j, j + 1);

                }
            }
        }
        System.out.println(arr);
    }

    void insertionSort(@NotNull int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            int j = i;
            while (j > 0 && arr[j] < arr[j - 1]) {
                swap(arr, j - 1, j);
                j--;
            }
        }
        System.out.println(arr);

    }

    void insertionReversed(@NotNull int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            int current = arr[i];
            int j = i - 1;
            while (j >= 0 && arr[i] < current) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = current;
        }
        System.out.println(arr);

    }


    void selectionSort(@NotNull int[] arr) {
        int temp = 0;
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                int minIndex = i;
                if (arr[minIndex] > arr[j]) {
                    minIndex = j;
                }
                swap(arr, i, minIndex);
            }
        }
        System.out.println(arr);

    }

    void selectionReversed(@NotNull int[] arr) {
        int temp = 0;
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                int maxIndex = i;
                if (arr[maxIndex] < arr[j]) {
                    maxIndex = j;
                }
                swap(arr, i, maxIndex);
            }
        }
        System.out.println(arr);
    }


    void print(int[] arr) {
        for (int el : arr) {
            System.out.print(el + " ");
        }
        System.out.println();
    }

    void swap(int[] arr, int i, int j) {
        int tmp = arr[i];
        arr[i] = arr[j];
        arr[j] = tmp;
    }
}

class ArraysUtilDemo {
    public static void main(String[] args) {
        ArraysUtil arraysUtil = new ArraysUtil();
        int[] arr = {2, 5, 6, 4, 7, 89, 3, 1, 3, 5, 62, 4, 52, 3, 23, 5};

        int max = arraysUtil.getMaximum(arr);
        System.out.println(max);

        arraysUtil.bubbleSort(arr);
        arraysUtil.print(arr);
    }
}

