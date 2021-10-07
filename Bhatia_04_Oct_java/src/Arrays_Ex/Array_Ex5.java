package Arrays_Ex;

public class Array_Ex5 {

	public static void main(String[] args) 
	{
		int odd_num[] = {3, 5, 7, 9, 11};		
		for(int i = 0 ; i<odd_num.length;i++)
		{
			System.out.print(odd_num[i] + " , ");
		}
		System.out.println();
		System.out.println();

		for(int num:odd_num )
		{
			System.out.print(num + " , ");

		}
	
	}

}
