package com.qa.optionals;

import java.util.Optional;

public class Optionals {

	// This method will sometimes return a value, sometimes not.
	public static Optional<String> returnsOptional() {
		String item;
		
		if(Math.random() >= 0.5) {
		    item = "Hello";
		} else {
		    item = null;
		}
		
		return Optional.ofNullable(item);
	}
	
	public static void main(String[] args) {
		Optional<String> value = returnsOptional();
		
		// If a value is present, returns true, otherwise false.
		System.out.println(value.isPresent());
		
		// If a value is present, returns the value, otherwise returns other.
		System.out.println(value.orElse("Item not found"));
		
		// We can throw built-in or custom exceptions if there's no value present
		System.out.println(value.orElseThrow(() -> new RuntimeException("Item Not Found")));
		
		// If a value is present, returns the value, otherwise throws NoSuchElementException.
		System.out.println(value.get());
	}
	
}
