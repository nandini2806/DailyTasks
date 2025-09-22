package com.Hello;

public class ArrayException {
 public static void main(String[] args) {
	int arr[]= {12,13,45,56,78,90};
	try {
	System.out.println(arr[7]);
	}catch(Exception e) {
		System.out.println("Size of array is 6,So please access appropriate value ");
	}finally {
		System.out.println("End!");
	}
	
}
}
