package com.practice.June_25.Problems;

public class MaxMinElementInArray {
	public static void main(String[] args) {
		
		int arr[] = {1,2,3,4,5,6,7,8,9,10};
		
		int max = arr[0];
		
		for(int i=0;i<arr.length;i++) {
			if(arr[i] > max) {
				max = arr[i];
			}
		}
		
		int min = arr[0];
		
		for(int i=0;i<arr.length;i++) {
			if(arr[i] < min) {
				min = arr[i];
			}
		}
		
		System.out.println("Max Element is : "+max);
		System.out.println("Min Element is : "+min);
		
	}
}
