package com.javaex.practice;

import java.util.Scanner;

public class Ex20 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
			System.out.print("500원 개수: ");
			int fh = sc.nextInt();
			System.out.print("100원 개수: ");
			int oh = sc.nextInt();
			System.out.print("50원 개수: ");
			int fif = sc.nextInt();
			System.out.print("10원 개수: ");
			int ten = sc.nextInt();
			
			int total = 500*fh+100*oh+50*fif+10*ten;
			
			System.out.println("동전의 총합은 " + total + " 원 입니다.");
			
		sc.close();
		
	}
}
