package Control_Statements;

import java.util.Scanner;

public class if_Else_ex2 {

	public static void main(String[] args)
	{
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the Percentage: ");
		double percent = input.nextDouble();
		double max_per = 100;
		double min_per = 0;

		
		if(percent>=min_per & percent<=max_per)
		{
			
			if(percent>=85)
			{
				System.out.println("Your Percentage is " + percent + "  And Your Grade is:  A");

			}
			else if(percent>=60)
			{
				System.out.println("Your Percentage is " + percent + "  And Your Grade is:  B");
			}
			
			else if(percent>=50)
			{
				System.out.println("Your Percentage is " + percent + "  And Your Grade is:  c");
			}
			
			else if(percent>=35)
			{
				System.out.println("Your Percentage is " + percent + "  And Your Grade is:  D");
			}
			else
			{	
				System.out.println(" Try Again");
			}
		}
		
		else
		{
			System.out.println(" Eneter Values between 0 to 100 ");
		}
			
	}

}
