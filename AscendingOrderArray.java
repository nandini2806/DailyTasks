package com.Hello;

public class AscendingOrderArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int aOrder[]= {33,98,78,89,9,87};
		int temp=0;
		for(int i=0;i<aOrder.length;i++) {
			for(int j=0;j<aOrder.length;j++) {
				if(aOrder[i]>aOrder[j]) {
					temp=aOrder[i];
					aOrder[i]=aOrder[j];
					aOrder[j]=temp;
				}
			}
		}
			System.out.println(" Array in Descending Order ");
			for(int i=0;i<aOrder.length;i++) {
				System.out.println(aOrder[i]);	
		}

	}

}
