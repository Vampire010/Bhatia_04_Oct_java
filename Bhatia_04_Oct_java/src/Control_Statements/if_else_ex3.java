package Control_Statements;

import java.util.Scanner;

public class if_else_ex3 {

	public static void main(String[] args)
	{
		String First_name = "Girish";
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the UserName To Search: ");
		String user_name = input.next();
		
		
		if(First_name.equals(user_name))
		{
			
			System.out.println(" User Found in database");
		}
		
		else
		{
			System.out.println(" User not Found in database");

		}
		
		
	}

}
