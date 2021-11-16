package com.javaex.practice;

import java.util.Scanner;

public class Ex12 {

		public static void main(String[] args) {
			Scanner sc=new Scanner(System.in);
			System.out.println("출력되는 내용을 입력하세요");
			System.out.print("기호 : ");
			String calc=sc.nextLine();
			System.out.print("숫자1 : ");
			int num1=sc.nextInt();
			System.out.print("숫자2 : ");
			int num2=sc.nextInt();
			
			double plus=num1+num2;
			double minus=num1-num2;
			double multiple=num1*num2;
			double divide=num1/num2;

				
			
			switch (calc) {
				case "+" :{
					System.out.println(plus);
					break;}
				case "-":{
					System.out.println(minus);
					break;}
				case "*":{
					System.out.println(multiple);
					break;}
				case"/":
				{ if(num2==0) { 
					System.out.print("0으로 나눌 수 없습니다."); 
					sc.close(); 
					return; } 
				else System.out.println(divide); }

					
					}
		
	
		sc.close();														
		}
		}	
		
		

