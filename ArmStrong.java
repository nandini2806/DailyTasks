package com.Hello;

import java.util.Scanner;

public class ArmStrong {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int num=sc.nextInt();
		int originalNum=num;
		int result=0;
		
		while(num>0) {
			int digit=num%10;
			result=result+(digit*digit*digit);
			num/=10;
		}
		if(num==originalNum) 
			System.out.println("Number is Armstrong");
		else
			System.out.println("Number is not Armstrong");	
		}
	}


