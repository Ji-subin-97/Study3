package com.subinji4.java;

import java.util.Scanner;

public class ForTest6 {

	public static void main(String[] args) {
		System.out.println("ForTest6 Start");
		
		
		Scanner sc = new Scanner(System.in);
		
		
		int id = 1234;
		//회원가입시 입력한 ID
		int pw = 5678;
		//회원가입시 입력한 PW
		
		//최대 5번 기회
		// 1. 최대 5번 로그인 시도
		
//		System.out.println("아이디를 입력해주세요.");
//		for(int i=0;i<5;i++) {
//			int checkID = sc.nextInt();
//			if(checkID==id) {
//				System.out.println("아이디입력성공. 비밀번호를 입력해주세요.");
//				for(int j=0;j<5;j++) {
//					int checkPassword = sc.nextInt();
//					if(checkPassword==pw) {
//						System.out.println("로그인 성공");
//						System.out.println("홈페이지 방문을 환영합니다.");
//						break;
//					}
//					else if(checkPassword!=pw) {
//						if(j>=4) {
//							System.out.println("비밀번호 5회 오류입니다. 시스템을 종료합니다.");
//							break;
//						}
//						System.out.println("비밀번호가 일치하지 않습니다. 다시입력해주세요 남은횟수:" + (4-j));
//					}
//				}
//				break;
//			}
//			else if(checkID!=id) {
//				System.out.println("해당하는 아이디가 존재하지 않습니다. 다시입력해주세요.");
//			}
//		}
		
		int corNum = 0;
		
		for(int i=0;i<5;i++) {
			System.out.println("아이디를 입력해주세요.");
			int checkID = sc.nextInt();
			System.out.println("비밀번호를 입력해주세요.");
			int checkPassword = sc.nextInt();
			
			if(checkID==id && checkPassword==pw) {
				
				corNum = 1; // 성공 인수
				break;
			}
			System.out.println((i+1)+"번째 실패입니다.");
			
		}
			
			if(corNum==1) {
			System.out.println("로그인 성공");
			}else
			System.out.println("로그인 실패 은행에 방문");
			
		sc.close();
		System.out.println("ForTest6 Finish");
	}

}
