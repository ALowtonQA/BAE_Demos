package com.qa.enums;

public class Runner {

	public static void main(String[] args) {
		
		System.out.println("Earth's mass is: " + Planet.EARTH.getMass());
		System.out.println("Earth's radius is: " + Planet.EARTH.getRadius());
		System.out.println("Earth's surface gravity is: " + Planet.EARTH.surfaceGravity());
		
		double mass = 85;
		System.out.println("A mass of " + mass + " has a weight of " + Planet.EARTH.surfaceWeight(mass) + " on Earth");
		
		double earthWeight = 175d;
		double anotherMass = earthWeight/Planet.EARTH.surfaceGravity();
		
		for (Planet p : Planet.values()) {
			System.out.printf("your weight on %s is %f%n", p, p.surfaceWeight(anotherMass));
		}
		
	}
	
}
