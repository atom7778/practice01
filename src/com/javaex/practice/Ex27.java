package com.javaex.practice;

import java.util.Scanner;

public class Ex27 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("반지름을 입력하세요: ");
		
		int radius = sc.nextInt();
		
		double round = radius*radius *3.14;
		
		System.out.println("원의 넓이는 "+round+" 입니다.");
		
		sc.close();
	}

}