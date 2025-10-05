package com.Hello;

import java.util.Scanner;

public class Calculator {
	
	public static int opCount=0;
		
	public static int add(int a,int b) {
		opCount++;
		return a+b;
	}
	
	public static int multiply(int a,int b) {
		opCount++;
		return a*b;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Scanner s=new Scanner(System.in);
	System.out.println("Enter first number ");
	int num1=s.nextInt();
	System.out.println("Enter second number ");
	int num2=s.nextInt();
	
	int sum=Calculator.add(num1, num2);
	int mul=Calculator.multiply(num1, num2);
	
	
	System.out.println("The Sum of a and b is "+sum);
	System.out.println("The Multiplication of a and b is "+mul);
	System.out.println("The Sum of a and b is "+Calculator.add(12, 9));
	
	System.out.println("The total operations are performed "+Calculator.opCount);
	}
}
