package com.food;

public class HawaiianPizza implements Pizza{

	public void cheese() {
		System.out.println("Regular");
		
	}

	public void toppings() {
		System.out.println("Ham and pineapple");
		
	}

	public void size() {
		System.out.println("Medium");
		
	}

	public boolean shouldExist() {
		return false;
	}

}
