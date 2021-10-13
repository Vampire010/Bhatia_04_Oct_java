package Interfaces;

public class House_Construction implements House_BluePrint
{

	@Override
	public void BedRooms() {
		System.out.println("4 Bedrooms Constructed");
	}

	@Override
	public void hall() {
		System.out.println("Hall Constructed");

	}

	@Override
	public void kitchen() {
		System.out.println("kitchen Constructed");
	}

	@Override
	public void Dinning_Hall() {
		System.out.println("Dinning_Hall Constructed");
	}

	@Override
	public void Pooja_room() {
		System.out.println("Pooja_room Constructed");
	}

	@Override
	public void Store_room() {
		System.out.println("Store_room Constructed");
	}

	@Override
	public void Common_WashRooms() 
	{
		System.out.println("Common_WashRooms Constructed");

	}
	
	public static void main(String[] args) 
	{
		House_Construction hs = new House_Construction();
		hs.hall();
		hs.kitchen();
		hs.Common_WashRooms();
		hs.BedRooms();
		hs.Pooja_room();
		hs.Dinning_Hall();
		hs.Store_room();
		
	}

}
