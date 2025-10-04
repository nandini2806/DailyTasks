package com.Hello;

import java.util.Scanner;

public class FrequencyStr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter Username");
		Scanner s=new Scanner(System.in);
		String str=s.next();
		int count=0;
		char ch=' ';
		for(int i=0;i<str.length();i++) {
			 ch=str.charAt(i);
			for(int j=0;j<str.length();j++) {
				if(str.charAt(j)==ch) 
					count++;
					
			}
			System.out.println(ch+" appears  "+count+" times ");
			count=0;
		}
		

	}

}
