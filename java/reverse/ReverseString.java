package com.java.reverse;

import java.util.Scanner;

public class ReverseString {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		
		String str = "Hello";
		
		String rev = "";
		
		int len = str.length();
		
		for(int i=len-1;i>=0;i--) {
			rev = rev + str.charAt(i);
		}
		System.out.println("Reversed String is: "+rev);
		
		
		
	}
}
