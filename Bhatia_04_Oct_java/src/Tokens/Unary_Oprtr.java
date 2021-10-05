package Tokens;

public class Unary_Oprtr {

	public static void main(String[] args) 
	{

		int num1 = 15 ;
		int num2 = 30;
		
		int num3 = 9 ;
		int num4 = 12;
		
		
		//Pre increment and decrement

		int pre_increment_num1 = ++num1;
		int Pre_decrement_num2 = --num2;

		boolean status = true;
		
		System.out.println("pre increment_num1 : " + pre_increment_num1 );
		System.out.println(" pre decrement_num2 : " + Pre_decrement_num2 );
		
		
		//Post increment  and decrement
		
		int post_increment_num3 = num3++;
		
		int Post_decrement_num4 = num4--;
	
		System.out.println("increment_num3 : " + post_increment_num3 );
		System.out.println(" decrement_num4 : " + Post_decrement_num4 );
		
		System.out.println("Post increment_num3 : " + num3 );
		System.out.println("Post decrement_num4 : " + num4 );

		//how to invert the boolean value using invert ' ! ' 
		System.out.println("Status is : " + !status );
		
		
		//Make Negative value to positive value using ' - '
		int num5 = -48;
		System.out.println(" Negative : " + num5 );
		System.out.println("Make positive : " + -num5 );



	}

}
