package com.practice.June_25.Problems;

public class CountCharactersInString {
	public static void main(String[] args) {
		
		String str = "I got a job";
		
		int count = 0;
		
		for(int i=0;i<str.length();i++) {
			if(str.charAt(i) != ' ') {
				count++;
			}
		}
		System.out.println(count);
	}
}
