package com.javaex.practice;

public class Ex06 {
		
	public static void main(String[] args) {

		int i = 10;
		int n = i++%2;
		
		System.out.println(i);		//i=11. int n에서 i++이 적용되어 10+1인 11 출력.
		System.out.println(n);		//n=0. i에 1을 더하기 전 값인 10을 2로 나누면 나머지는 0
		
	}

}
