package com.Hello;

public class FirstLast {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {12,24,36,48,60,72,98,99,100};
		int temp=0;
		//for(int i=0;i<arr.length;i++) 
			temp=arr[0];
			arr[0]=arr[arr.length-1];
			arr[arr.length-1]=temp;
	
	
	for(int i=0;i<arr.length;i++)
		System.out.println(arr[i]);
		
	}		
}
