package com.subinji3.java;

import java.util.Scanner;

public class Test1 {

	public static void main(String[] args) {
		
		System.out.println("Test1 Start");
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("국어 점수를 입력해주세요.");
		int kor = sc.nextInt();
		System.out.println("영어 점수를 입력해주세요.");
		int eng = sc.nextInt();
		System.out.println("수학 점수를 입력해주세요.");
		int math = sc.nextInt();
		
		double avg = (kor + eng + math) / 3.0;
		
		if(avg>=60) {
			if(kor>=40 && eng>=40 && math>=40) {
				System.out.println("합격입니다.");
			}else {
				System.out.println("불합격입니다.");
			}
		}else {
			System.out.println("불합격입니다.");
		}
		
		
		
		sc.close();
		System.out.println("Test1 Finish");
	}

}
