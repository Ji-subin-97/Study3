package com.subinji3.java;

public class Test9 {

	public static void main(String[] args) {
		System.out.println("Test9 Start");
		
		boolean check = true;
		
		System.out.println(check);
		
		check = !check;
		
		if(!check) {
			System.out.println("TEST");
		}
		
		int age = 30;
		
		//조건식 ? true 일 때 실행 : false 일때 실행
		String result = age > 19 ? "성년" : "미성년";
		System.out.println(result);
		
		System.out.println("Test9 Finish");
	}

}
