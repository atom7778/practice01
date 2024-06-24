package com.javaex.practice;

import java.util.Scanner;

public class Ex36 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("500원 개수: ");
		int num1 = sc.nextInt();
		int price1 = num1*500;
		sc.nextLine();
				
		System.out.print("100원 개수: ");
		
		int num2 = sc.nextInt();
		int price2 = num2*100;
		sc.nextLine();
		
		System.out.print("50원 개수: ");
		
		int num3 = sc.nextInt();
		int price3 = num3*50;
		sc.nextLine();
		
		System.out.print("10원 개수: ");
		
		int num4 = sc.nextInt();
		int price4 = num4*10;
		sc.nextLine();
		
		int sum = price1+price2+price3+price4;
		
		System.out.println("동전의 총합은 "+sum+"원 입니다.");
		
		sc.close();
		
	}

}