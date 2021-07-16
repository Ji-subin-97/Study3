package com.subinji6.java;

import java.util.Scanner;

public class Array_8 {

	public static void main(String[] args) {
		int [] ids = {1234, 4567, 4356, 1258};
		int [] pws = {6789, 5437, 1235, 9874};
		
		//1. 로그인
		//2. 회원가입
		//4. 종 료
		
		
		Scanner sc = new Scanner(System.in);   // 스캐너
		
		
		boolean flag = true;  // 로그인 여부 및 종료 시
		
		while(flag) {
			System.out.println("===============");
			System.out.println("1. 로그인   2. 회원가입   3.종료");
			System.out.println("원하시는 작업을 선택해주십시오.");
			int selectMod = sc.nextInt();
			System.out.println("===============");

			if(selectMod==1) {
				System.out.print("아이디를 입력해주세요 =>");
				int myId = sc.nextInt();
				System.out.println("");
				System.out.print("비밀번호를 입력해주세요 =>");
				int myPw = sc.nextInt();
				System.out.println("");
				
				for(int i=0; i<ids.length;i++) {
					if(myId==ids[i]) {
						if(myPw==pws[i] && pws[i]==ids[i]) {
						for(int j=0; j<pws.length;j++) {
								System.out.println("로그인에 성공하셨습니다. 메인화면으로 돌아갑니다.");
								break;
						}
					}else {
						System.out.println("아이디 및 비밀번호가 일치하지 않습니다. 다시시도해주세요.");
						break;
					}
					break;
				}
			}
				
			}else if(selectMod==2) {
				System.out.println("회원가입 화면입니다.");
				System.out.print("아이디를 입력해주세요 =>");
				int newId = sc.nextInt();
				System.out.println("");
				System.out.print("비밀번호를 입력해주세요 =>");
				int newPw = sc.nextInt();
				System.out.println("");
				
				int [] idAr = new int[ids.length+1];
				int [] pwAr = new int[pws.length+1];
				
				for(int i=0;i<ids.length;i++) {
					for(int p=0;p<pws.length;p++) {
						if(newId != ids[i] && newPw != pws[i]) {
							for(int j=0;j<ids.length;j++) {
								idAr[j] = ids[j];
							}
								idAr[ids.length] = newId;
								ids = idAr;
							for(int j=0;j<pws.length;j++) {
								pwAr[j] = pws[j];
							}
								pwAr[pws.length] = newPw;
								pws = pwAr;
							break;
						}else {
							System.out.println("이미 존재하는 아이디입니다.");
							break;
						}
					}
					break;
				}
			}else
				flag = false;	// 종료버튼누름	
		}	
		
		sc.close();
		System.out.println("작업이 종료되었습니다.");
	}

}
