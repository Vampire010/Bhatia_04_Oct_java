package Exception_Ex;

public class Example_1 {

	public static void main(String[] args) 
	{
		int a = 10 ;
		int b = 0;
		try
		{
			int c = a/b;
			System.out.println(c);
		}
		catch(Exception e)
		{
			System.out.println( "  java.lang.ArithmeticException ");
		}
		finally
		{
			System.out.println( "  I'm Finally , I will be excted always ");
		}
		
		
		int d = a+b;
		System.out.println(d);
	
	}

}
