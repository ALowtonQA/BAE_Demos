package com.qa.streamslambdas;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class LambdasAndStreams {

	public static void main(String[] args) {
		
		List<String> myList = List.of("cat", "dog", "fish");
		
		// forEach w/ Lamba
		myList.forEach(element -> System.out.println(element));

		// forEach w/ some logic
		myList.forEach(element -> {if (element.equals("cat")) {System.out.println(element);}});
		
		// One way to create a stream
		Stream<String> animalStream = Stream.of("cat", "dog", "fish");
		
		// Creating a stream from a list of numbers
		List<Integer> numbers = Arrays.asList(2, 3, 4, 5);
		Stream<Integer> numbersStream = numbers.stream();
		
		// forEach w/ stream
		numbersStream.forEach(number -> System.out.println(number));
		
		// filter (intermediate operation)
		animalStream.filter(animal -> animal.contains("a")).forEach(animal -> System.out.println(animal));
		
		// map (intermediate operation)
		animalStream.map(animal -> animal.toUpperCase()).forEach(animal -> System.out.println(animal));
		
		// collectors (terminal operation)
		List<String> myNewAnimalStream = animalStream.map(animal -> animal.toUpperCase()).collect(Collectors.toList());
		System.out.println(myNewAnimalStream);
		
		// reduce (terminal operation)
		List<Integer> nums = Arrays.asList(1, 2, 3, 4, 5);
		Stream<Integer> numsAsStream = nums.stream();
		
		int multiply = numsAsStream.reduce((num1, num2) -> num1 * num2).get();
		System.out.println(multiply);
	}
}
