package com.Hello;

import java.util.Scanner;

public class Frequency {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] num=new int[10];
		Scanner s=new Scanner(System.in);
		System.out.println("Enter 10 numbers");
		for(int i=0;i<num.length;i++)
		 num[i]=s.nextInt();
		int count=0;
		for(int i=0;i<num.length;i++) {
			// int count=1;
			for(int j=0;j<num.length;j++) 	{
				if(i!=j&&num[i]==num[j]) {
					count++;
					break;
				}
			//if(count==1) {
			
		}
		}	System.out.println("The element of array occurs:"+count+"frequency");
			
		

	}
		
	}


