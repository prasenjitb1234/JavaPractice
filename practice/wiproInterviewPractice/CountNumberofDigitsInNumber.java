package com.practice.wiproInterviewPractice;

public class CountNumberofDigitsInNumber {
	public static void main(String[] args) {
		
		
		int num = 123456;
		int count = 0;
		
		while(num > 0) {
			num = num / 10;
			count++;
		}
		
		System.out.println("number of digits  : "+count);
	}
}
