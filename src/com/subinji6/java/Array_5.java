package com.subinji6.java;

import java.util.Scanner;

public class Array_5 {

	public static void main(String[] args) {
		
		//1. 정보 출력
		//2. 정보 추가
		//3. 정보 삭제
		//4 .종 료
		
		Scanner sc = new Scanner(System.in);
		
		boolean flag = true;
		
		//정보
		int [] info = new int[5]; //정보
		
		
		while(flag) {
			System.out.println("원하시는 작업을 선택해주세요. (최대 정보 "+ info.length +"개)");
			System.out.println("1. 정보 출력\n2. 정보 추가\n3. 정보 삭제\n4. 검색해서 삭제\n5. 종 료");
			
			int select = sc.nextInt();
			
			if(select==1) {
				for(int i=0;i<info.length;i++) {
					if(info[i]==0) {
						break;
					}
					System.out.println((i+1)+"번째 입력값  : " + info[i]);
				}
			}
			else if(select==2) {
				
				System.out.println("숫자 정보를 입력해주세요.");
				int info_item = sc.nextInt();
				if(info[info.length-1]!=0) {
					System.out.println("총 정보량 :" + info.length);
					
					int [] ar2 = new int[info.length+1];
					for(int i=0;i<info.length;i++) {
						ar2[i]=info[i];
						
					}
					ar2[info.length] = info_item;
					
					info = ar2;
					continue;
				}
				for(int i=0;i<info.length;i++) {
					if(info[i]!=0) {
						continue;
					}
					info[i] = info_item;
					break;
				}
			}else if(select==3) {
				System.out.println("정보를 삭제하시겠습니까? (맨 앞의 정보가 삭제됩니다.) 1누르면 삭제. 2누르면 나가기");
				int delSelect = sc.nextInt();
				if(delSelect==1) {
					info[0] = 0;
					for(int i=0;i<info.length-1;i++) {
						info[i]= info[i+1];
					}
					info[info.length-1] = 0;
				}else {
					continue;
				}
			}
			else if(select==4) {
				System.out.println("삭제할 데이터의 순번을 입력해주세요.");
				int selectIndex = sc.nextInt();
				for(int i=selectIndex-1;i<info.length-1;i++) {
					info[i]=info[i+1];
				}
				info[info.length-1] = 0;	
			}
			else {
				flag = false;
			}
		}
		
		sc.close();
		System.out.println("시스템을 종료합니다.");

	}

}
