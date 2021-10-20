package Exception_Ex;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Throws_Example {

	
	public static void findFile() throws FileNotFoundException, InterruptedException 
	{
		// code that may produce IOException
		File newFile=new File("test.txt");
		FileInputStream stream=new FileInputStream(newFile);
		Thread.sleep(3000);
	}
	
	public static void main(String[] args) throws FileNotFoundException, InterruptedException
	{
		findFile();
	}

}
