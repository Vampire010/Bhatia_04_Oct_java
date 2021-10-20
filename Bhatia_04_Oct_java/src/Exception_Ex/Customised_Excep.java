package Exception_Ex;

public class Customised_Excep {

	public static void my_exception() throws Exception
	{
		throw new Exception(" Person Not Found Exception");
	}
	
	
	public static void main(String[] args) throws Exception {
		my_exception();
	}

}
