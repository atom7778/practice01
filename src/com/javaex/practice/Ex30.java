package com.javaex.practice;

import java.util.Scanner;

public class Ex30 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		final double km = 1.609;
		
		System.out.print("마일을 입력하세요: ");
		double m = sc.nextDouble();
		
		System.out.println(m+"마일은 "+m*km+"킬로미터 입니다.");
		
		sc.close();
	}

}