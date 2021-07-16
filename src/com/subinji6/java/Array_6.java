package com.subinji6.java;

public class Array_6 {

	public static void main(String[] args) {
		int [] ar = {3,5,1,7,4};
		
		//정렬
		//1. 높은 것 에서부터 낮은 순으로 : 내림차순 desc
		//2. 낮은것에서 부터 높은 순으로 : 오름차순 asc
		
		for(int idex=0;idex<ar.length-1;idex++) {
			for(int i=idex+1; i<ar.length; i++) {
				if(ar[idex]<ar[i]) {
					int tmp = ar[i];
					ar[i]=ar[idex];
					ar[idex]=tmp;
				}
			}
		}
		
		
		
		for(int i=0;i<ar.length;i++) {
			System.out.println(ar[i]);
		}

	}

}
