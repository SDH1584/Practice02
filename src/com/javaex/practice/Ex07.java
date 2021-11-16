package com.javaex.practice;

import java.util.Scanner;

public class Ex07 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("큰수 2개를 입력해주세요");
		System.out.print("첫번째숫자 : ");
		int num1=sc.nextInt();
		System.out.print("두번째숫자 : ");
		int num2=sc.nextInt();
		
		if(num1>num2) {
			System.out.println("몫 : "+num1/num2);
			System.out.println("나머지"+ num1%num2);
		}
		else {
			System.out.println("몫 : "+num2/num1);
			System.out.println("나머지"+ num2%num1);
			
		}
		sc.close();
	}

	}


