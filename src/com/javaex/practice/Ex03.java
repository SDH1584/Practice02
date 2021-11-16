package com.javaex.practice;

import java.util.Scanner;

public class Ex03 {
	public static void main(String[]args) {
		int age;
		Scanner sc= new Scanner(System.in);
		System.out.println("나이를 입력해주세요");
		System.out.println("나이 : ");
		age=sc.nextInt();
		
		if(age>20) {
			System.out.println("\"1번그룹\"");
		}else {
			System.out.println("\2번그룹\"");
		}
		System.out.println("입니다");
		
		
		//20 초과 입력시 
//		"1번그룹"입니다 
//		출력
		
		// 20이하 입력시
		//"2번그룹"입니다
		//출력
		sc.close();
	}
}
