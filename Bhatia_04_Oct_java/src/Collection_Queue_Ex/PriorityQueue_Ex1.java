package Collection_Queue_Ex;

import java.util.PriorityQueue;

public class PriorityQueue_Ex1
{

	public static void main(String[] args) 
	{
		// Creating a priority queue
		PriorityQueue<Integer> numbers = new PriorityQueue<>();
		
		// Using the add() method
		numbers.add(4);
		numbers.add(2);
		System.out.println("PriorityQueue: " + numbers);
		
		// Using the offer() method
		numbers.offer(1);
		
		System.out.println("Updated PriorityQueue: " + numbers);
		
		// Using the peek() method
		int number = numbers.peek();
		System.out.println("Accessed Element: " + number);
		
		
		// Using the poll() method
		int number1 = numbers.poll();
		System.out.println("Removed Element Using poll(): " + number1);
		System.out.println("Updated PriorityQueue: " + numbers);

	}

}
