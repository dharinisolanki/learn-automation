package stringClass;

public class StringDemo3 {

	public static void main(String[] args) {
		String  actual = "Welcome to selenium webdriver world";
		String expected = "selenium";
		 
		boolean s1 =  actual.contains(expected);
        System.out.println("status is " + s1);
	}

}
