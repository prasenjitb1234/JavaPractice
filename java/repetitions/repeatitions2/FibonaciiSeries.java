package com.java.repetitions.repeatitions2;

public class FibonaciiSeries {
	public static void main(String[] args) {
		
		
		// wap to print fibonacii 
		
		
		int n1 = 0;
		int n2 = 1;
		int sum = 0;
		
		System.out.println(n1+" "+n2);
		
		for(int i=2;i<=10;i++) {
			sum = n1 + n2;
			
			System.out.println(" "+sum);
			n1 = n2;
			n2 = sum;
		}
		
		
	}
}
