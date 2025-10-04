package com.Hello;

import java.util.Scanner;

public class First {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number[]=new int[5];
		Scanner s=new Scanner(System.in);
		System.out.println("Enter 5 numbers");
		for(int i=0;i<number.length;i++)
			number[i]=s.nextInt();
		System.out.println("first element"+number[0]);
		System.out.println("last element"+number[number.length-1]);
		

	}

}
