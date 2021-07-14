package com.subinji4.java;

import java.util.Scanner;

public class ForTest5 {

	public static void main(String[] args) {
		System.out.println("ForTest5 Start");
		
		//과목수 입력
		Scanner sc = new Scanner(System.in);
		System.out.println("과목수를 입력해주세요.");
		int classNum = sc.nextInt();
		int totalScore = 0; // 총점
		double avg; // 평균
		
		//과목수 만큼 점수 입력
		for(int i=0;i<classNum;i++) {
			System.out.println((i+1) + "번째 점수를 입력해주세요");
			int classScore = sc.nextInt();
			totalScore = totalScore + classScore;
			System.out.println( classScore + "입니다.");   // 자신이 입력한 과목의 점수 확인
		}
		
		avg = totalScore / classNum;   // 평균 값 계산
	
		//총점 평균 계산 후 출력
		System.out.println("당신의 평균은" + avg + "입니다.");
		
		
		sc.close();
		System.out.println("ForTest5 Start");
	}

}
