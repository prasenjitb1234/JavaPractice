package com.leetcode;

import java.util.Arrays;

//	Leetcode 34

public class FindFirstAndLastElementInSortedArray01_bruteforce {
	// bruteforce method 
	public static void main(String[] args) {

		int[] nums = { 5, 7, 7, 8, 8, 10 };
		int target = 8;

		System.out.println(Arrays.toString(searchRange(nums, target)));
	}

	static int[] searchRange(int[] nums, int target) {

		int arr[] = new int[2];
		arr[0] = -1;
		arr[1] = -1;

		for (int i = 0; i < nums.length; i++) {
			if (nums[i] == target) {
				arr[0] = i;
				while (i < nums.length && nums[i + 1] == target) {
					i++;
					arr[1] = i;
					break;
				}
			}
		}
		return arr;
	}

}
