package com.subinji6.java;

import java.util.Scanner;

public class Array_7 {

	public static void main(String[] args) {
		// 한 학생당 국어, 영어, 수학
		// 한 학생의 정보는 : 이름, 번호, 국어 점수, 수학 점수, 영어, 점수, 총점, 평균 N명
		String []names = {"iu", "choa", "suji"};
		
		int [] nums = {5, 29, 2};
		
		
		System.out.println("쌍용교육센터 학생명단 및 점수");
		System.out.println("======================================================");
		System.out.println("1. 학생 정보 추가입력");
		System.out.println("2. 학생 정보 삭제하기");
		System.out.println("이름    / 번호    / 국어    / 영어    / 수학    / 총점  / 평균");
		
		for(int idx=0; idx<nums.length-1; idx++) {
			for(int i=idx+1; i<nums.length; i++) {
				int tmp = 0;
				String name_tmp = "";
				
				if(nums[idx]>nums[i]) {
					tmp = nums[idx];
					nums[idx] = nums[i];
					nums[i] = tmp;				//숫자 정렬
					
					name_tmp = names[idx];
					names[idx] = names[i];
					names[i] = name_tmp;		//이름 정렬
				}
			}
		}
		
		for(int i=0;i<nums.length;i++) {
			System.out.println("======================================================");
			System.out.print(names[i] + " ");
			System.out.print(nums[i] + " \n");
			System.out.println("======================================================");
		}
		
	}

}