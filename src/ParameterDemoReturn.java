
public class ParameterDemoReturn  {

	public static void main(String[] args) {
		PassParametDemo  obj1= new PassParametDemo();
		int sum = obj1.add(45, 50);
		System.out.println(sum);
		double substraction = obj1.sub(12.5, 50.5);
		System.out.println(substraction);
		
		
		String fn = PassParametDemo.getmyullname("Dharini", "Parmar");
		System.out.println(fn);
		
	}
}
	
		
		
	

