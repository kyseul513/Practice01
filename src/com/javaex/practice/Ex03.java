package com.javaex.practice;

public class Ex03 {

	public static void main(String[] args) {
		int x = 1;
		int y = 1;
		
		int a = ++x *2;			// x는 1이 증가한 값 2. 2와 2를 곱해줌. 따라서 4
		int b = y++ *2;			// y는 증가이전 값인 1. 1과 2를 곱해줌. 따라서 2
		
		System.out.println("a=" + a);			// 4
		System.out.println("b=" + b);			// 2
		System.out.println("x=" + b);			// 3
		System.out.println("y=" + y);			// 2
		
	}
	
}
