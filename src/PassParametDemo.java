
public class PassParametDemo extends ParameterDemoReturn {
	
	public static String getmyullname(String firstname,String lastname){
		
		String fullname = firstname + lastname;
		return fullname;
	}

	public int add(int a, int b){
		int c = a + b;
		return c;
		
	}
	
	public double sub(double x, double y){
		
		double result = y - x;
		return result;
	}
	
	
	
}
