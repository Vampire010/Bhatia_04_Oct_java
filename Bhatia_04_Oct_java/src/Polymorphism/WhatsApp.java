package Polymorphism;

public class WhatsApp 
{

	public void WhatsApp_Status()
	{
		System.out.println(" Photo As Status");
	}
	
	public void WhatsApp_Status(String video)
	{
		System.out.println(" Video As Status");
	}
	
	public void WhatsApp_Status(String text , int video)
	{
		System.out.println(" Text As Status");
	}
	
	
	public static void main(String[] args)
	{
		WhatsApp wap = new WhatsApp();
		wap.WhatsApp_Status();
		wap.WhatsApp_Status("name");

	}

}
