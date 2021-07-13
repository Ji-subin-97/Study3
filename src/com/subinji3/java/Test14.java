package com.subinji3.java;

import java.util.Scanner;

public class Test14 {

	public static void main(String[] args) {
		System.out.println("Test14 Start");
		
		Scanner sc = new Scanner(System.in);
		int avg = sc.nextInt();
		int avg_Case = avg/10;
		String rank = "";
		
		switch(avg_Case) {
		case 10, 9:
			rank = "A";
			break;
		case 8:
			rank = "B";
			break;
		case 7:
			rank = "C";
			break;
		case 6:
			rank = "D";
			break;
		default:
			rank = "F";
		}
		
		System.out.println(rank);
		
		sc.close();
		System.out.println("Test14 Finish");
	}

}
