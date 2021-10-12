package Inheritance;

public class Child extends Parent
{

	public void child_needs()
	{
		//non static method dont need create object to access in non static method
		Pamper_us();
		protect_us();
		Support_Needs();
	}
	
	
	public static void main(String[] args) 
	{
		//creation object
		Child chld = new Child();
		
		chld.Pamper_us();
		chld.protect_us();
		chld.Support_Needs();
		
		//static method dont need create object
		happiness();
	
	}

}
