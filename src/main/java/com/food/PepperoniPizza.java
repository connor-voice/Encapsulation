package com.food;

public class PepperoniPizza implements Pizza {

	public void cheese() {
		System.out.println("Extra Cheese");
		
	}

	public void toppings() {
		System.out.println("Pepperoni");
		
	}

	public void size() {
		System.out.println("LARGE");
	
	}

	public boolean shouldExist() {
		return true;
	}
}
