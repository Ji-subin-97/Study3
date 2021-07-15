package com.subinji5.java;

import java.util.Scanner;

public class WhileTest3 {

	public static void main(String[] args) {
				// 임의의 로그인 정보 입력
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
				
				int id = 1234;
				int pw = 5678;
				boolean idCheck = true;
				boolean gameStart = false;
				
				Scanner sc = new Scanner(System.in);
				
				//로그인하기
				while(idCheck) {
					System.out.println("아이디를 입력해주세요.");
					int myId = sc.nextInt();
					System.out.println("비밀번호를 입력해주세요.");
					int myPw = sc.nextInt();
					if(myId==id && myPw==pw) {
						System.out.println("로그인 성공");
						gameStart = true;
						idCheck = !idCheck;
					}
					else {
						System.out.println("로그인에 실패하였습니다.");
					}
				}
				
				// 필요한 변수들
				int level;
				int mygold = 0;
				int gold = 1000;
				System.out.println(gameStart);
				
				// 로그인성공시 게임시작
				if(gameStart==true) {
					for(level = 1; level<=15 ; level++) {
						System.out.println("1을 입력하면 몬스터를 사냥합니다.");
						int atkBtn = sc.nextInt();
							
						if(atkBtn==1) { // 공격누르면
							for(int mon=0; mon<3*level ; mon++) {
								System.out.println("몬스터" +  (mon+1) + "마리 사냥중");
							}
							System.out.println("축하합니다 레벨업하셨습니다!현재 레벨은 " + level + "입니다.");
						}
						else {
							System.out.println("1번을 눌러주세요");
						}
						if((level%5)==0) {
							System.out.println(level + "레벨을 달성하여" + gold + "골드를 지급");
							mygold += gold;
							gold += 1000;
							System.out.println("현 골드" + mygold + "골드");
						}
					}
					System.out.println("15렙을 달성 하셨습니다. 종료합니다. 총 골드 :" + mygold);
				}
				
				sc.close();
	}

}
