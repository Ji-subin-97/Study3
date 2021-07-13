package com.subinji3.java;

import java.util.Scanner;

public class Test13 {

	public static void main(String[] args) {
		System.out.println("Test13 Start");
		
		//요금조회는 1번
		//상품가입은 2번
		//고장신고는 3번
		//상담원연결 0번
		//잘못 누름 다시 선택
		
		Scanner sc =new Scanner(System.in);
		
		System.out.println("원하시는 번호를 입력해주세요. 요금조회는 1번, 상품가입은 2번, 고장신고는 3번, 상담원연결은 0번입니다.");
		
		int num = sc.nextInt();
		
		switch(num) {
		case 1:
			System.out.println("요금조회입니다.");
			break;
		case 2:
			System.out.println("상품가입입니다.");
			break;
		case 3:
			System.out.println("고장신고입니다.");
			break;
		case 0:
			System.out.println("상담원연결입니다.");
			break;
		default :
			System.out.println("잘못 입력 하셨습니다.");
		}
		
		
		sc.close();
		System.out.println("Test13 Finish");
	}

}
