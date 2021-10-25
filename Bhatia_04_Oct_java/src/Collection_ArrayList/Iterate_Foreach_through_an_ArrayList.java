package Collection_ArrayList;

import java.util.ArrayList;

public class Iterate_Foreach_through_an_ArrayList {

	public static void main(String[] args)
	{
		ArrayList<String> emp_names = new ArrayList(); 
		emp_names.add("joe");
		emp_names.add("ken");
		emp_names.add("crim");
		emp_names.add("rama");
		emp_names.add("sita");
		System.out.println("Emp Database" + emp_names);

		System.out.println("Emp Database ");
		for(String names:emp_names)
		{
			System.out.print( names + (" , "));

		}
		
	}

}
