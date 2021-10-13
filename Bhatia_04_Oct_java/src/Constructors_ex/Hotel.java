package Constructors_ex;

public class Hotel
{

	final double bill = 100.26;
	
	public Hotel()
	{
			System.out.println("Welcome to Hotel Grand");
	}
	
	public Hotel(String Orders)
	{
			System.out.println(" Giving the Orders");
	}
	
	
	public Hotel(Double Bill , String Payment_status)
	{
		
			System.out.println(" Amount Recived and Payment Success");
	}
	
	
	public static void main(String[] args) 
	{
		Hotel welcm_hotel = new Hotel();

		Hotel ordr_food = new Hotel("Idly");
		
		Hotel Bill_payment = new Hotel(346.00,"Success");

		
	}

}
