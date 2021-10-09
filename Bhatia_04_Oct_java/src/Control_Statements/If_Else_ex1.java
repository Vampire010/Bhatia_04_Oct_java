package Control_Statements;

public class If_Else_ex1
{

	public static void main(String[] args) 
	{

		int i = 20;
		int j = 20;
		
		if(i>j)
		{
			System.out.println(i + " is Grater than " + j);
		}
		
		else if(i==j)
		{
			System.out.println(i + " is equal to " + j);
		}
		
		
		else if(i<j)
		{
			System.out.println(i + " is equal to " + j);
		}
		
		else
		{
			System.out.println("Invalid Number");
		}
		
	}

}
