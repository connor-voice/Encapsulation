package com.animals;

public class Runner {
	
	public static void main(String[] args) {
		
		Dog doggo = new Dog();
		Cat catto = new Cat();
		Parrot birdo = new Parrot();
		
		
		doggo.makeNoise();
		catto.makeNoise();
		
		doggo.doThing();
		catto.doThing();
		birdo.doThing();
	}

}
