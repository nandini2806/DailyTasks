package com.PracticeDaily;

import java.util.Scanner;

public class OddByWhile{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number: ");
		int num=sc.nextInt();
		while(num>0) {
			if(num%2==1) {
				System.out.println("Number is odd ");
				
				}
			else {
	         System.out.println("Number is even ");
			}
		 break;
		
		}
	}

}
