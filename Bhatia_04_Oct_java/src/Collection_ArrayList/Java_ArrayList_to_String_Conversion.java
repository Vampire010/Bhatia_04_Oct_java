package Collection_ArrayList;

import java.util.ArrayList;

public class Java_ArrayList_to_String_Conversion {

	public static void main(String[] args) {
		ArrayList<String> languages = new ArrayList<>();
		// add elements in the ArrayList
		languages.add("Java");
		languages.add("Python");
		languages.add("Kotlin");
		System.out.println("ArrayList: " + languages);
		
		// convert ArrayList into a String
		String str = languages.toString();
		System.out.println("String: " + str);
	}

}
