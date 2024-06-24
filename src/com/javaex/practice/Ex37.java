package com.javaex.practice;


import java.util.Scanner;

public class Ex37 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("전체 연필갯수를 입력해주세요: ");
		int p = sc.nextInt();
		sc.nextLine();		
		
		System.out.print("전체 인원수를 입력해주세요: ");
		int num = sc.nextInt();
		sc.nextLine();	
		
		int oneP = p/num;
		int r = p%num;
		
		
		System.out.println("1인당 연필의 갯수는 "+oneP+" 입니다.");
		System.out.println("연필의 나머지 갯수는 "+r+" 입니다.");
		
		sc.close();
	}

}
			
		
