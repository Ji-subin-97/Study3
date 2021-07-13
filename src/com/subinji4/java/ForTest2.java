package com.subinji4.java;

public class ForTest2 {

	public static void main(String[] args) {
		
		System.out.println("ForTest2 Start");
		
		int num = 0;
		
		++num;
		System.out.println(num);
		
		num++;
		System.out.println(num);
		
		int check1 = ++num;
		System.out.println("Num " + num);
		System.out.println("check1: "+ check1);
		
		check1 = num++;
		System.out.println("Num " + num);
		System.out.println("check1: "+ check1);
		
		System.out.println(++num);
		System.out.println(num++);
		
		System.out.println("ForTest2 Finish");
	}

}
