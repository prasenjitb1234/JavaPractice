package com.practice;

public class PrimeNumber {
	public static void main(String[] args) {
		
		int num = 3;
		
		int count = 0;
		
		if(num > 1) {
			// check 
			for(int i=1;i<=num;i++) {
				if(num % i == 0) {
					count++;
				}
			}
			if(count == 2) {
				System.out.println("Prime number ");
			}else {
				System.out.println("Not a prime number");
			}
		}
		else {
			System.out.println("Not a palindrome  number");
		}
		
		
	}
}
