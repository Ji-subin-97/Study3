package com.subinji3.java;

import java.util.Scanner;

public class Test11 {

	public static void main(String[] args) {
		System.out.println("Test11 Start");
		
		//국어, 영어, 수학 입력
		// 총점 평균 계산
		
		//평균이 90점 이상이면 A를 출력
		//평균이 80점 이상이면 B를 출력
		//평균이 70점 이상이면 C를 출력
		//평균이 60점 이상이면 D를 출력
		//그외 나머지 F를 출력
		
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("국어 점수를 입력해주세요.");
		int kor = sc.nextInt();
		System.out.println("영어 점수를 입력해주세요.");
		int eng = sc.nextInt();
		System.out.println("수학 점수를 입력해주세요.");
		int math = sc.nextInt();
		
		double avg = (kor+ eng + math) / 3.0;
		avg = (int)(avg * 100) / 100.0;
		
		System.out.println("당신의 평균은" + avg + "입니다.");
		
		if(avg>=90) {
			System.out.println("당신의 성적은 'A' 입니다.");
		}else if(avg>=80) {
			System.out.println("당신의 성적은 'B' 입니다.");
		}else if(avg>=70) {
			System.out.println("당신의 성적은 'C' 입니다.");
		}else if(avg>=60) {
			System.out.println("당신의 성적은 'D' 입니다.");
		}else {
			System.out.println("당신의 성적은 'F' 입니다.");
		}
		
		
		sc.close();
		System.out.println("Test11 Finish");
	}

}
