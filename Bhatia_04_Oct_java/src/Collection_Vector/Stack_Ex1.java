package Collection_Vector;

import java.util.Stack;

public class Stack_Ex1 {

	public static void main(String[] args) 
	{

		Stack<Integer> evn_num = new Stack();
		
		//add elements to stack - push()
		evn_num.push(2);
		evn_num.push(4);
		evn_num.push(10);
		evn_num.push(8);
		evn_num.push(12);
		evn_num.push(6);
		System.out.println(evn_num);
		
		// Access element from the top
		Integer element = evn_num.peek();
		System.out.println("Element at top: " + element);
		
		//remove elements from stack - pop()
		Integer removed_ele = evn_num.pop();
		System.out.println("removed element " + removed_ele);
		
		
		// Search an element
		int position = evn_num.search(12);
		System.out.println("Position of 12: " + position);
		
		Stack<Integer> odd_num = new Stack();

		// Check if stack is empty
		boolean result = odd_num.empty();
		System.out.println("Is the stack empty? " + result);
		
	}

}
