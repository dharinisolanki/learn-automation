package stringClass;

public class StringDemo1 {

	public static void main(String[] args) {

		String name = "selenium webdriver";
		boolean status = name.startsWith("selenium");
		System.out.println("status is "+ status);
		 
		 String  name1 = " welcome to selenium webdriver world";
		 boolean newStatus =  name1.endsWith("world");
		 System.out.println("new status is " + newStatus);
	}

}
