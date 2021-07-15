package com.subinji6.java;

import java.util.Scanner;

public class Array_1 {

	public static void main(String[] args) {
		int [] numArray = new int[5];
		
		numArray[0] = 10;
		numArray[1] = 20;
		numArray[2] = 30;
		
		System.out.println(numArray[0]);
		System.out.println(numArray[1]);
		System.out.println(numArray[2]);
		
		
		System.out.println("배열의크기" + numArray.length);
		System.out.println(numArray);
		
		// 3.123, 2.3, 4.123, 5.0 배열 선언하고 데이터를 대입
		
		double [] doubleArray = new double[4];
		
		doubleArray[0] = 3.12;
		doubleArray[1] = 2.3;
		doubleArray[2] = 4.123;
	
		
		System.out.println(doubleArray[0]);
		System.out.println(doubleArray[1]);
		System.out.println(doubleArray[2]);
		System.out.println(doubleArray[3]);
		
		
		// 문자열을 담을 배열 3칸짜리 생성
		String [] stringArray = new String[3];
		System.out.println(stringArray[0]);
		System.out.println(stringArray[1]);
		System.out.println(stringArray[2]);
		
		// 스캐너를 담을 배열 2칸 짜리 생성
		// 모두 출력
		Scanner [] sc = new Scanner[2];
		System.out.println(sc[0]);
		System.out.println(sc[1]);
	}

}
