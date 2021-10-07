package Arrays_Ex;

public class Araay_ex2 {

	public static void main(String[] args)
	{
			int odd_num[] = {3, 5, 7, 9, 11};
			System.out.println(odd_num[0]);
			
			for(int i = 0 ; i<odd_num.length;i++)
			{
				System.out.print(odd_num[i] + " , ");
			}
			
			int numbers[] = odd_num;
		
			System.out.println();					
			System.out.println("***********************************");

			for(int i = 0 ; i<numbers.length;i++)
			{
				System.out.print(numbers[i] + " , ");
			}
			System.out.println();

			char alphabets[]= {'a','b','c','d'};
			System.out.println(alphabets[2]);

		
	}

}
