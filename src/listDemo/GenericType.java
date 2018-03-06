package listDemo;

import java.util.ArrayList;

public class GenericType {

	public static void main(String[] args) {
		
		//generic type of array list sinmce we are specifying which type of arraylist we are goingto specify. in this example we are going to uase string.
		//using a generic is a good practice since it will occupy only specific amount of memory according to the data type.
		// if you do not specify a specific, it will consider each value as an object and that can occupy huge amount of memories if you have many data and that can create a 
		// problem later on
		ArrayList<String> obj = new ArrayList<String>();
		
		obj.add("Dharini");
		obj.add("Hiren");
		obj.add("HP");
		
		System.out.println(obj);
		
		
		
	}

}
