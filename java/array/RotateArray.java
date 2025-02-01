package com.java.array;

import java.util.Arrays;

public class RotateArray {
    public static void main(String[] args) {
        int nums[] = {1, 2, 3, 4, 5, 6, 7};
        int k = 3;

        // Calling rotate method
        rotate(nums, k);

        // Print rotated array
        System.out.println("Rotated Array: " + Arrays.toString(nums));
    }

    // Make rotate method static to call from main()
    public static void rotate(int nums[], int k) {
        int n = nums.length;
        k = k % n; // Handle cases where k > n

        reverseNums(nums, 0, n - 1);
        reverseNums(nums, 0, k - 1);
        reverseNums(nums, k, n - 1);
    }

    // Reverse helper function
    public static void reverseNums(int[] nums, int start, int end) {
        while (start < end) {
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }
    }
}
