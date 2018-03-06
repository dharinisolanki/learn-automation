package listDemo;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListdemo {

	public static void main(String[] args) {
       
		// It shows some error in yellow color. This ArrayList is a raw type means we are not specifying d data type that array list contains. 
		// you can creat an ArrayList of specific type. It will help us to store the value using less memories which is called "Generic" in collection
		// In generic collection, we specify the type in angualar braces. // look at the next file.
		ArrayList obj = new ArrayList();
		obj.add(78);
		obj.add('M');
		obj.add("Selenium WebDriver");
		obj.add(12.67);
		obj.add("Selenium WebDriver");
		
	
		System.out.println(obj);
		System.out.println(obj.get(3));
		
		//int myListSize =  obj.size();
		
//		for(int i = 0; i<myListSize; i++ ){
//			System.out.println(obj.get(i));
//		}
		
		// you can use enhance for loop as well
//		for(Object abc : obj){
//			
//			System.out.println("Values are " + abc);
//		}
		
		
		// you can use iterator as well
		Iterator itr = obj.iterator();
		
		while(itr.hasNext()){
			
			Object  values = itr.next();
			System.out.println("values are " + values);
		}
		
	}

}
