package com.subinji6.java;

import java.util.Scanner;

public class Array_2 {

	public static void main(String[] args) {
		
//		
//		System.out.println("배열의 크기를 입력하세요.");
//		
//		Scanner sc = new Scanner(System.in);
//		int arraySize = sc.nextInt();
//		
//		int [] nums = new int[arraySize];
//		for(int i=0;i<nums.length;i++) {
//			System.out.println(i+1+"번호를 입력하세요.");
//			nums[i] = sc.nextInt();
//		}
//		// index 0으로 시작, 1씩
//		
//		for(int i=0;i<nums.length;i++) {
//			System.out.println(nums[i]);
//		}
		
		int total = 0;
		double avg = 0;
		
		System.out.println("과목수를 입력해주세요.");
		Scanner sc = new Scanner(System.in);
		int count =sc.nextInt();                  
		
		int [] numClass = new int[count];
		
		for(int i=0;i<numClass.length;i++) {
			System.out.println(i+1+" 번째 과목점수를 입력해주세요.");
			numClass[i] = sc.nextInt();
		}
		
		for(int i=0;i<numClass.length;i++) {
			total = total + numClass[i];
		}
		
		avg = total / numClass.length;
		
		System.out.println("총점은 "+total+"평균은 "+avg);
		
		sc.close();
	}

}
