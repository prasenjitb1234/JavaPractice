package com.ExceptionHandling.mechanisms;

import java.io.FileInputStream;

public class Test {
	public static void main(String[] args) {

		/*
		 * try { FileInputStream fis = new FileInputStream("d:/abc.txt"); } catch
		 * (Exception e) {
		 * 
		 * System.out.println(e); }
		 * 
		 * System.out.println(" \n Hello,  this is after catch block");
		 * 
		 */
		
//			------------------------
		
		/*
		 * try { Class.forName("com.mysql.jdbc.Driver"); } catch (Exception e) {
		 * 
		 * System.out.println(e); }
		 * System.out.println(" \n Hello this is after catch block ");
		 * 
		 * 
		 */

		try {

			int a = 100;
			int b = 0;
			int c = a / b;
			System.out.println(c);
		} catch (ArithmeticException e) {
			System.out.println(e);
		}
		System.out.println("Hello , this is after exception handling");

	}
}
