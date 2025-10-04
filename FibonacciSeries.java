package com.Hello;

import java.util.Scanner;

public class FibonacciSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stu
		int a=0,b=1;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number of terms ");
		int n=sc.nextInt();
		
		System.out.println("Fibonacci series: "+a+" "+b);
		for(int i=2;i<n;i++) {
			int next=a+b;
			System.out.print(" "+next);
			a=b;
			b=next;
		}
		

	}

}
