package com.javaex.practice;

public class Ex25 {
	
	public static void main(String[] args) {
		
		int a = 13;
		
		System.out.println((a>13) && (a>=13)); // false
		System.out.println((a>13) || (a>=13)); // true
		System.out.println((a/3 == 4) && (a%3 == 2)); // false 1개 틀림
		System.out.println((a/3 == 4) || (a%3 == 2)); // true 1개만 틀림
		System.out.println((a/3 == 4) && (a%3 == 2)||(a/3 == 4)); //

		
	}

}