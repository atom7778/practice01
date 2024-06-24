package com.javaex.practice;

import java.util.Scanner;

public class Ex28 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		final double d = 1230.95;
		
		System.out.print("환전할 원화를 입력하세요: ");
		int w = sc.nextInt();
		
		double c = w /d;
		
		System.out.println("받으실 달러는 "+c+" 입니다.");
		
		sc.close();
	}
	
}