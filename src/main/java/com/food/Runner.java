package com.food;

public class Runner {

	public static void main(String[] args) {

		Pizza pepperoni = new PepperoniPizza();
		Pizza hawaii = new HawaiianPizza();
		CaeserSandwich yucky = new CaeserSandwich();

		pepperoni.cheese();
		pepperoni.toppings();
		pepperoni.size();

		System.out.println(("-".repeat(80)));

		System.out.println(hawaii.shouldExist());

		yucky.ingredients();

	}

}
