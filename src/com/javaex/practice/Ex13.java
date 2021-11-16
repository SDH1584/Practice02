package com.javaex.practice;

import java.util.Scanner;

public class Ex13 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("숫자를을 입력해주세요");
		System.out.print("숫자: ");
		int num=sc.nextInt();
		double fx1=num*num*num-(9*num)+2;
		double fx2=7*num+2;
		if(num<=0) {
			System.out.println(fx1);
		}
		else {
			System.out.println(fx2);
		}
	}
}
