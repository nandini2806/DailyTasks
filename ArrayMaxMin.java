package com.Hello;
import java.util.Scanner;
public class ArrayMaxMin {
	public static void main(String[] args) {
		int n[]=new int[8];
		Scanner s=new Scanner(System.in);
		System.out.println("Enter 8 numbers");
		for(int i=0;i<n.length;i++) {
			n[i]=s.nextInt();
		}
		int max=n[0];
		for(int i=0;i<n.length;i++) {
			if(n[i]>max)
			 max=n[i];
		}System.out.println(" maximum value in array is "+max);
		int min=n[0];
		for(int i=0;i<n.length;i++) {
			if(n[i]<min)
			 min=n[i];
		}System.out.println(" minimum value in array is "+min);
		
	}
}
