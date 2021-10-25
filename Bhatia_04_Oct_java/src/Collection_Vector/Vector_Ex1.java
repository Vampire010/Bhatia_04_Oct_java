package Collection_Vector;

import java.nio.charset.Charset;
import java.util.Iterator;
import java.util.Vector;

public class Vector_Ex1 {

	public static void main(String[] args) {

		Vector<Character> vowels = new Vector();
		vowels.add('a');
		vowels.add('e');
		vowels.add('i');
		vowels.add('o');
		vowels.add('u');


		System.out.println(vowels);


		// Using iterator()
		Iterator<Character> iterate = vowels.iterator();
		System.out.print("Vector: ");
		while(iterate.hasNext()) 
		{
			System.out.print(iterate.next());
			System.out.print(", ");
		}
		System.out.println();
		boolean verify_element = vowels.contains('l');
		System.out.println( "is Character Exist in Vowels " + verify_element);

	}

}
