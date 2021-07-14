package com.subinji5.java;

import java.util.Scanner;

public class WhileTest2 {

	public static void main(String[] args) {
		System.out.println("While Test2 Start");
		
		int id =1234;
		int pw =5678;
		
		Scanner sc = new Scanner(System.in);
		
		//1. 로그인
		//		-id, pw 입력
		//		-로그인 판단 5번 실패하면 다시 로그인 종료 창으로
		//2. 종 료
		boolean check = true;
		
		while(check) {
			System.out.println("원하시는 작업을 선택해주세요. \n1.로그인 2. 종 료");
			int select = sc.nextInt();
			
			switch(select) {
			case 1:
				System.out.println("아이디와 비밀번호를 입력해주세요.");
				for(int i=0; i<5; i++) {
					System.out.println("아이디 :");
					int myid = sc.nextInt();
					System.out.println("비밀번호 :");
					int mypw = sc.nextInt();
					if(myid==id && mypw==pw) {
						System.out.println("로그인성공");
						check = !check;
						break;
					}else if(i>=5){
						System.out.println("5번의 시도가 끝이났습니다. 선택창으로 이동합니다.");
						break;
					}
				}
				break;
			case 2:
				check = !check;
				break;
			default:
				check = !check;
			}
		}	
		
		System.out.println("시스템이 종료되었습니다.");
		
		System.out.println("While Test2 Finish");
	}

}
