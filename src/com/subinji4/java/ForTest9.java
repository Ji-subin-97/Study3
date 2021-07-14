package com.subinji4.java;

import java.util.Scanner;

public class ForTest9 {

	public static void main(String[] args) {
		System.out.println("ForTest10 Start");
		
		//FPS
		// 탄창 3개 
		// 한 탄창에 총알이 30발
		// 1. 단발? 점사?
		// 1 - 탕
		
		System.out.println("단발 및 점사를 선택해주세요.");
		
		Scanner sc = new Scanner(System.in);
		
		int mag;    // 탄창 3개
		int oneMag;	// 탄창 하나에 30발
		
//		if(selectMod==1) {
//			System.out.println("단발모드를 선택하셨습니다.");
//			for(mag=3;mag>0;mag--) {
//				for(oneMag=30;oneMag>0;oneMag-=1) {
//					shotNum = ++shotNum;
//					System.out.println("탕" + shotNum);
//				}
//			}
//			System.out.println("총알을 모두 소진하였습니다.");
//		}else if(selectMod==2) {
//			System.out.println("점사모드를 선택하셨습니다.");
//			for(mag=3;mag>0;mag--) {
//				for(oneMag=30;oneMag>0;oneMag-=3) {
//					System.out.println("타타탕");
//				}
//			}
//			System.out.println("총알을 모두 소진하였습니다.");
//		}
		
		
		for(int tan=0; tan<3; tan++) {
				System.out.println("1.단발   2.점사");
				int selectMod = sc.nextInt();
				String sound="탕"; 
				int shotNum=1;
				
				
				
				if(selectMod != 1) {
					sound="타타탕";
					shotNum=3;
				}
				
				for(int i=0;i<30;i=i+shotNum) {
					System.out.println(sound);
				}
		}
		
		sc.close();
		System.out.println("ForTest10 Finish");
	}

}
