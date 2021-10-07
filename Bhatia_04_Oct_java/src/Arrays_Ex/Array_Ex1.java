package Arrays_Ex;

public class Array_Ex1 
{

	public static void main(String[] args)
	{
			String S1_name = "joe";
			String S2_name = "smith";
			String S3_name = "ken";
			String S4_name = "rick";
			String S5_name = "Stew";


			String Student_names[] = {  "joe", "smith", "ken","rick","stew"  };

			System.out.println(Student_names[0]);
			
			//Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: Index 5 out of bounds for length 5
			//System.out.println(Student_names[5]);
			System.out.println(Student_names.length);

			for(int i = 0 ; i<Student_names.length;i++)
			{
				System.out.print(Student_names[i] + " , ");
			}
			
			/* Itr
		     	i =0  , 0<5 , 0+1=1 
                i =1  , 1<5 , 1+1 =2
                i =2   ,2<5 , 2+1 =3
                i =3 ,  3<5 , 3+1=4
                i=4 ,   4<5 , 4+1 =5
                i =5, 5<5 , 
                */
                
	}

}
