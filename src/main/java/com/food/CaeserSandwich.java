package com.food;

public class CaeserSandwich implements Bread, Salad {

	public void gross() {
		System.out.println("absolutely disgusting");
		
	}

	public void ingredients() {
		System.out.println("leaves, more gross stuff, and good, WASTED, bread");
		
	}

	public void dressing() {
		System.out.println("Caeser");
		
	}

	public void flour() {
		System.out.println("Plain White flour");
		
	}

	public int grams() {
		return 300;
	}

	public void shape() {
		System.out.println("Rectangle");
		
	}
	
	

}
