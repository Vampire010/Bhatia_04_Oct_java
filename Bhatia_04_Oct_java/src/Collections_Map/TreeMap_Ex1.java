package Collections_Map;

import java.util.TreeMap;

public class TreeMap_Ex1 {

	public static void main(String[] args) {
		// Creating TreeMap of even numbers
		TreeMap<String, Integer> evenNumbers = new TreeMap<>();
		
		// Using put()
		evenNumbers.put("Two", 2);
		evenNumbers.put("Four", 4);
	
		// Using putIfAbsent()
		evenNumbers.putIfAbsent("Six", 6);
		System.out.println("TreeMap of even numbers: " + evenNumbers);
		
		//Creating TreeMap of numbers
		TreeMap<String, Integer> numbers = new TreeMap<>();
		numbers.put("One", 1);
	
		// Using putAll()
		numbers.putAll(evenNumbers);
		System.out.println("TreeMap of numbers: " + numbers);
		
		// Using the firstKey() method
		String firstKey = numbers.firstKey();
		System.out.println("First Key: " + firstKey);
		// Using the lastKey() method
		String lastKey = numbers.lastKey();
		System.out.println("Last Key: " + lastKey);
		// Using firstEntry() method
		System.out.println("First Entry: " + numbers.firstEntry());

		// Using the lastEntry() method
		System.out.println("Last Entry: " + numbers.lastEntry());
	}

}
