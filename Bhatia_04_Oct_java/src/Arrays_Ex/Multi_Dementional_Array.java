package Arrays_Ex;

public class Multi_Dementional_Array {

	public static void main(String[] args)
	{


        int[][] arr ={ 
        				{ 1,  2,  3 , 4 , 5 },
        				
        				{ 6,  7,  8,  9,  10 },
        				
        				{ 11, 12, 13, 14, 15 }
        				
        			};
       
		System.out.println(arr[0][3]);

		System.out.println(arr.length );

        for(int  i = 0 ; i<3 ; i++)
        {
        	for(int j =0 ;j<5;j++)
        	{
        		System.out.print(arr[i][j] + " , ");
        	}
    		System.out.println();

        }

		
	}

}