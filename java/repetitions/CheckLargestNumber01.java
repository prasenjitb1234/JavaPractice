package com.java.repetitions;

import java.util.Scanner;

public class CheckLargestNumber01 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter 3 numbers : ");
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();

		if (a > b && a > c) {
			System.out.println(a + " is the largest.");
		} else if (b > a && b > c) {
			System.out.println(b + " is the largest.");
		} else if (c > a && c > b) {
			System.out.println(c + " is the largest.");
		} else {
			System.out.println("Two or more numbers are equal and the largest.");
		}

	}
}
