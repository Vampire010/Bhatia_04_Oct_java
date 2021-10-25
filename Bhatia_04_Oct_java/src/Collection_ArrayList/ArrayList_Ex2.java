package Collection_ArrayList;

import java.util.ArrayList;

public class ArrayList_Ex2
{

	public static void main(String[] args) 
	{
		
		ArrayList<String> emp_names = new ArrayList(); 
		emp_names.add("joe");
		emp_names.add("ken");
		emp_names.add("crim");
		emp_names.add("rama");
		emp_names.add("sita");
		System.out.println("Emp Database" + emp_names);

		//Adding On collection elements to other collection directly
		ArrayList<String> Befinit_emp_names = new ArrayList(emp_names); 
		System.out.println("Befinit_emp_names Database" + Befinit_emp_names);

		//Adding On collection elements to other collection using addALL()
		ArrayList<String> Claimed_emp_names = new ArrayList(); 
		Claimed_emp_names.addAll(Befinit_emp_names);
		System.out.println("Claimed_emp_names Database" + Claimed_emp_names);

		
		
	}

}
