package org.example.array1d;

import java.util.Arrays;

public class InsertArrayElement {

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        arr = insertElementAtIndex(arr, 0, 7);
        System.out.println(Arrays.toString(arr));
    }

    public static int[] insertElementAtIndex(int[] nums, int val, int index) {
        if (index < 0 || index > nums.length) {
            return nums;
        }

        int[] result = new int[nums.length + 1];
        System.arraycopy(nums, 0, result, 0, index);
        result[index] = val;

        System.arraycopy(nums, index, result, index + 1, nums.length - index);
        return result;
    }

}
