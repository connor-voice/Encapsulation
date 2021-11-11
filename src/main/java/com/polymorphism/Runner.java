package com.polymorphism;

public class Runner {
	
	public static void main(String[] args) {
		
		Game overwatch = new Overwatch(); 
		
		((Overwatch) overwatch).doMotto();
	}

}
