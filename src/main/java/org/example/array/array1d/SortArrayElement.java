package org.example.array.array1d;

import java.util.Arrays;
import java.util.Random;

public class SortArrayElement {
    private final static int randomSize = 100;

    public static void main(String[] args) {
        int[] array = generateRandomArray(10);
        System.out.println("Original Array: " + Arrays.toString(array));
        bubbleSort(array);
        System.out.println("Array after Sort: " + Arrays.toString(array));
    }

    private static int[] generateRandomArray(int size) {
        int[] nums = new int[size];

        // Random number generator
        Random rand = new Random();

        for (int i = 0; i < nums.length; i++) {
            nums[i] = rand.nextInt(randomSize); // 0 - 100
        }

        return nums;
    }

    private static void bubbleSort(int[] array) {
        boolean isSwap = false;
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = 0; j < array.length - i - 1; j++) {
                if (array[j] > array[j + 1]) {
                    isSwap = true;
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }

            if (!isSwap) {
                break;
            }
        }
    }
}
