package com.javaex.practice;

public class Ex07 {

		public static void main(String[] args) {
			
			int i = 10;
			int n = ++i%2;
					
			System.out.println(i);		//i=11 n에서 i에 1이 더해짐. 따라서 11
			System.out.println(n);		//n=1 1이 더해진 n값 11을 2로 나누면 나머지는 1.
		}
}
