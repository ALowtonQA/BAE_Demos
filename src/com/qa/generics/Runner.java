package com.qa.generics;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Runner {

	public static void main(String[] args) {
		List<String> listOfString;

		GenericExample<String> genericWithString = new GenericExample<String>();
		
		System.out.println(genericWithString.returnObject("Message"));
		
		GenericExample<Shape> genericWithShape = new GenericExample<Shape>();
		
		Shape newShape = new Shape();
		
		System.out.println(genericWithShape.returnObject(newShape));
	}
}
