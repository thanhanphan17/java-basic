package org.example.array1d;

import java.util.Arrays;

public class DeleteArrayElement {

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        arr = deleteElementAtIndex(arr, 0);
        System.out.println(Arrays.toString(arr));
    }

    private static int[] deleteElementAtIndex(int[] array, int index) {
        for (int i = index; i < array.length - 1; i++) {
            array[i] = array[i + 1];
        }
        array[array.length - 1] = 0;

        return Arrays.copyOf(array, array.length - 1);
    }
}
