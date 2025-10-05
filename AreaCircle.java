package com.Hello;

public class AreaCircle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int r=20;
		float area=3.14f*r*r ;
		System.out.println("Area of Circle is "+area);
		if(area>100) {
			System.out.println("Big Circle");
		}
		else {
			System.out.println("Small Circle");
		}
	}

}
