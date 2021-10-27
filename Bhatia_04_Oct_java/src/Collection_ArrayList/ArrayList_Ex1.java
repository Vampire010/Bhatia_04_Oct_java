package Collection_ArrayList;

import java.util.ArrayList;

public class ArrayList_Ex1 
{

	public static void main(String[] args) 
	{
		//Creating an ArrayList
		ArrayList<Integer> nums= new ArrayList<>();
		
		//Adding the elements to ArrayList
		nums.add(10);
		nums.add(11);
		nums.add(12);
		nums.add(13);
		nums.add(14);
		nums.add(14);

		//Getting the Individual Elements
		System.out.println(nums.get(2));
		
		//Insert the value in specified position
		nums.add(1,16);
		System.out.println("After Insertion: -" + nums);
		
		//Update the Element in Collection
		nums.set(1,17);
		System.out.println("After Updation: -" + nums);

		//Remove the Elements
		int removed_Num = nums.remove(1);
		System.out.println("Removed Num: -" + removed_Num);
		
		//Get Entire Elements Prasent in Collection
		System.out.println("After Removed: -" + nums);
		
		//Collection size
		System.out.println("Total Number of Elements Stored in nums is : "+ nums.size());
		
	}

}
