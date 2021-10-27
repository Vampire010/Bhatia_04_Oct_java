package Collection_SortedSet;

import java.util.Iterator;
import java.util.TreeSet;

public class NavigableSet {

	public static void main(String[] args) 
	{TreeSet<Integer> numbers = new TreeSet<>();
	numbers.add(1);
	numbers.add(2);
	numbers.add(3);
	numbers.add(4);
	numbers.add(5);
	numbers.add(6);
	numbers.add(7);
	System.out.println("TreeSet: " + numbers);
	
	System.out.println("descendingSet: " + numbers.descendingSet());
	
	// Calling iterator() method
	Iterator<Integer> iterate = numbers.descendingIterator();
	System.out.print("TreeSet using descendingIterator: ");
	// Accessing elements
	while(iterate.hasNext()) 
	{
			System.out.print(iterate.next());
			System.out.print(", ");
	}
	}

}
