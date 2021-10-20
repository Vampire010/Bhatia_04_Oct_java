package Exception_Ex;

public class Multiple_Exception 
{

	public static void main(String[] args) 
	{
		
		try
		{
			int num[] = new int[3];
			System.out.println(num[2]);
			int div = 10/0;
		}
		catch(ArrayIndexOutOfBoundsException Arexp)
		{
			System.out.println("ArrayIndexOutOfBoundsException");
		}
		catch(ArithmeticException Arexp)
		{
			System.out.println("ArithmeticException");
		}
		
		
		
	}

}
