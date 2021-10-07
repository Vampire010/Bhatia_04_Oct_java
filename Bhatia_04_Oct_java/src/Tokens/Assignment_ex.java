package Tokens;

public class Assignment_ex
{

	public static void main(String[] args) 
	{
		int num1 = 15;
		int num2 = 30;
		
		int a,b,c,d;
		
		int num3 = 9 ;
		int num4 = 12;
		
		
		num1 += num2;
		System.out.println(" Addition of two numbers : " + num1 );// output  45
		
		
		num1 -= num2;
		System.out.println(" Sub of two numbers : " + num1 ); // 15
		
		num1 *= num2;
		System.out.println(" mul of two numbers : " + num1 ); // 450	
		
		num1 /= num2;
		System.out.println(" div of two numbers : " + num1 ); // 15	
		
		num1 %= num2;
		System.out.println(" div of two numbers : " + num1 ); // 15		
	}

}
