
public class ParameterDemoVoid {
	public static void main(String[] args) {
		ParameterDemoVoid  obj1= new ParameterDemoVoid();
		obj1.add(45, 50);
		obj1.sub(12.5, 50.5);
		
	}
	
		
		public void add(int a, int b){
			int c = a + b;
			System.out.println("result is " + c);
			
		}
		
		public void sub(double x, double y){
			
			double result = y - x;
			System.out.println("substration reslut is " + result);
		}
}
