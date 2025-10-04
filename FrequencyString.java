package com.Hello;

public class FrequencyString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="banana";
		int countChar=0;
		String[] arr=s.split("");
		char ch=' ';
		for(int i=0;i<arr.length;i++) {
			if(ch>='a'&&ch<='z')
			countChar++;
		}
		System.out.println("Total Number Of Characters In String "+arr+" Is " +countChar);
	}

}
