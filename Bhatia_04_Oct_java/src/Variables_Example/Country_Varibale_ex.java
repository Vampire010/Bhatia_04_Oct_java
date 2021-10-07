package Variables_Example;

public class Country_Varibale_ex
{

	String Country_capital = "New Delhi";
	
	public void karnataka()
	{
		String state_Capital = "Bangalore";
		System.out.println("Karnataka - " + state_Capital);
		String Bangalore_city = "IT-Hub";
		System.out.println("Karnataka - " + Bangalore_city);
		System.out.println("India - " + Country_capital);

	}
	
	public void Maharastra()
	{
		String state_Capital = "Mumbai";
		String Mumbai_city = "Financial Capital";
		
		System.out.println("Maharastra - " + Mumbai_city);
		System.out.println("India - " + Country_capital);

	}
	
	public static void main(String[] args)
	{
		//creation of object
		Country_Varibale_ex cntry = new Country_Varibale_ex();
		cntry.karnataka();
		cntry.Maharastra();
	}

	
}
