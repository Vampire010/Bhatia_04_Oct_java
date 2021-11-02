package Collections_Map;

import java.util.LinkedHashMap;

public class LinkedHashMap_Ex1 {

	public static void main(String[] args) {
		// Creating a LinkedHashMap of even numbers
		LinkedHashMap<String, Integer> evenNumbers = new LinkedHashMap<>();
		evenNumbers.put("Four", 4);
		evenNumbers.put("Two", 2);
		System.out.println("LinkedHashMap1: " + evenNumbers);
	
		// Creating a LinkedHashMap from other LinkedHashMap
		LinkedHashMap<String, Integer> numbers = new LinkedHashMap<>(evenNumbers);
		numbers.put("Three", 3);
		System.out.println("LinkedHashMap2: " + numbers);
		
		// Using putIfAbsent()
		evenNumbers.putIfAbsent("Six", 6);
		System.out.println("Updated LinkedHashMap(): " + evenNumbers);
	
		//Creating LinkedHashMap of numbers
		LinkedHashMap<String, Integer> numbers1 = new LinkedHashMap<>();
		numbers.put("One", 1);
		
		// Using putAll()
		numbers1.putAll(evenNumbers);
		System.out.println("New LinkedHashMap: " + numbers1);
		
		// Using getOrDefault()
		int value2 = numbers.getOrDefault("Six", 6);
		System.out.println("Returned Number: " + value2);
	}

}
