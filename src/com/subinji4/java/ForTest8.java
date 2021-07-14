package com.subinji4.java;

import java.util.Scanner;

public class ForTest8 {

	public static void main(String[] args) {
		System.out.println("ForTest8 Start");
		// 분초 출력
		// 0분 0초
		// 0분 1초
		// 0분 2초
		// 분, 초를 입력 1, 10;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("몇분으로 할지 입력해주세요.");
		int min = sc.nextInt();
		System.out.println("몇초로 할지 입력해주세요.");
		int sec = sc.nextInt();
		
		
		for(int i=0; i<=min; i++) {   // i = 분, j = 초
				for(int j=0; j<60; j++) {
					if(i==min && j==sec) {

						System.out.println(i + "분" + j +"초");
						System.out.println("종료");
						break;
					}
					System.out.println(i + "분" + j +"초");
				}
		}
		
		
		
		
		
		
		sc.close();
		System.out.println("ForTest8 Finish");
	}

}
