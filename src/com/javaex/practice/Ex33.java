package com.javaex.practice;

import java.util.Scanner;

public class Ex33 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("반지름: ");
		
		double r = sc.nextDouble();
		
		sc.nextLine();
		
		double v = 4.0/3.0*3.14*Math.pow(r,3);
		
		System.out.println("구의 부피는: "+ v+" 입니다.");
		
		sc.close();
	}

}