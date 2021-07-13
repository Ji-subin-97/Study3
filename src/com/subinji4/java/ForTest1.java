package com.subinji4.java;

import java.util.Scanner;

public class ForTest1 {

	public static void main(String[] args) {
		System.out.println("ForTest1 Start");
		
//		Scanner sc = new Scanner(System.in);
//		int count = sc.nextInt();
//		
//		for(int i = 0 ; i<count ; i++) {
//			System.out.println("Hello World " + (i+1));
//		}
		
		
		for(int i = 0 ; i<20 ; i=i+2) {
			System.out.println(i);
		}
		
		System.out.println("5+2 = 34" + 3 + 4);
		System.out.println("5+2 = 34" + (3 + 4));
//		sc.close();
		System.out.println("ForTest1 Finish");
	}

}
