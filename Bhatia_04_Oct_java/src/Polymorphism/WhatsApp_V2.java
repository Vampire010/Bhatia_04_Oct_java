package Polymorphism;

public class WhatsApp_V2 extends WhatsApp
{
	@Override
	public void WhatsApp_Status()
	{
		System.out.println(" Photo As Status in WhatsApp_V2");
	}

	public static void main(String[] args)
	{
		WhatsApp_V2 v2 = new WhatsApp_V2();
		v2.WhatsApp_Status();
	}

}
