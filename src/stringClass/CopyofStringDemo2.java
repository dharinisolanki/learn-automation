package stringClass;

public class CopyofStringDemo2 {

	public static void main(String[] args) {
      
		 String  actual = "Welcome to selenium webdriver world";
		 String expected = "Welcome to selenium world";
		 String ignoreCase = "welcome to selenium webdriver world";
		 
		 boolean result= actual.equals(expected);
		 System.out.println("comparison is " + result);
		 
		 boolean result2 = actual.equalsIgnoreCase(ignoreCase);
		 System.out.println("comparision is " + result2);
		 
		 
	}

}
