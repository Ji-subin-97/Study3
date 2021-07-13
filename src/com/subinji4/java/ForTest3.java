package com.subinji4.java;

import java.util.Scanner;

public class ForTest3 {

	public static void main(String[] args) {
		System.out.println("ForTest Start");
		
		
		Scanner sc = new Scanner(System.in);
		
		int mySec = sc.nextInt();   
		//내가 입력한 종료시간
		// 단 60 상수는 변경 불가능
		
		//
		
		for(int sec=0 ; sec <60 ; sec++) {
			System.out.println(sec + "초");
			if(sec==mySec) {
				sec = 60;
			}
		}
		
		
		sc.close();
		System.out.println("ForTest Finish");
	}

}
