package org.example.array1d;

import java.util.Arrays;
import java.util.Random;

public class CopyArray {
    private final static int arraySize = 10;
    private final static int randomSize = 100;

    public static void main(String[] args) {
        int[] nums = generateRandomArray(arraySize);

        System.out.println("Original Array: " + Arrays.toString(nums));
        System.out.println("Copied Array use System: " + Arrays.toString(copyArrayUseSystem(nums)));
        System.out.println("Copied Array use util.Array: " + Arrays.toString(copyArrayUseArrays(nums)));
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

    private static int[] copyArrayUseSystem(int[] nums) {
        int[] result = new int[nums.length];

        /*
        for (int i = 0; i < nums.length; i++) {
            result[i] = nums[i];
        }
        */

        // use built-in functions
        System.arraycopy(nums, 0, result, 0, nums.length);   // (from, to, number of elements)

        return result;
    }

    private static int[] copyArrayUseArrays(int[] nums) {
        return Arrays.copyOf(nums, nums.length);
    }
}
