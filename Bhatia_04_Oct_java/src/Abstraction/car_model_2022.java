package Abstraction;

public class car_model_2022 extends Car_Model_2021
{
	@Override
	public void automatic_door_System() 
	{
		
		System.out.println("automatic_door_System Fetures are implemented");

	}

	@Override
	public void navigation_system() 
	{
		System.out.println("navigation_system Fetures are implemented");
	}
	
	
	
	public static void main(String[] args) 
	{
		car_model_2022 car = new car_model_2022();
		car.ABS();
		car.AC();
		car.automatic_door_System();
		car.navigation_system();
	}



}
