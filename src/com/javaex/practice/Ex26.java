package com.javaex.practice;

import java.util.Scanner;

public class Ex26 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("월급을 입력하세요: ");
		
		int pay = sc.nextInt();
		
		int maxPay = pay*10*12;
		
		System.out.println("10년 동안 최대 저축액은 "+ maxPay +"원 입니다.");
		
	
		sc.close();
	}

}