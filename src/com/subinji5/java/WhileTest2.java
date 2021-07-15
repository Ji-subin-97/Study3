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
		
		
		// 로그인성공, 로그인 안됐거나
		// 로그인이 성공했으면 게임을 시작
		// rpg 게임
		// 최초레벨은 1, 만렙 15
		// 최초gold 0
		// 레벨 5를 달성시 1000gold 지급
		// 레벨 10을 달성시 2000gold 지급
		// 레벨 15을 달성시 3000gold 지급
		
		// 모든 몬스터의 경험치는 동일
		// 1-> 2 : 3
		// 몬스터 1마리 사냥
		// 몬스터 2마리 사냥
		// 몬스터 3마리 사냥
		// 레벨업
		// 2-> 3 : 6
		// 몬스터 1마리 사냥
		// 몬스터 2마리 사냥
		// 몬스터 3마리 사냥
		// 몬스터 4마리 사냥
		// 몬스터 5마리 사냥
		// 몬스터 6마리 사냥
		// 레벨업
		// 3-> 4 : 9
		// 4-> 5 : 12
		// 5-> 6 : 15
		// ....
		// 14-> 15 :
		// 최종 레벨 출력
		// 최종 골드 출력
		
		
		
		
		System.out.println("시스템이 종료되었습니다.");
		
		System.out.println("While Test2 Finish");
	}

}
