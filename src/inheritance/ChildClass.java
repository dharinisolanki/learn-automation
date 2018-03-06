package inheritance;

import org.apache.poi.util.SystemOutLogger;

public class ChildClass extends BaseClass {

	public static void main(String[] args) {
		ChildClass bc = new ChildClass();

		
		bc.mult();
		bc.division();
		bc.add();
		bc.sub();

	}

	public void mult() {

		System.out.println("Hey I am in child class and multiplication is 250 ");
	}

	public void division() {

		System.out.println("Hey I am in child class and division is 50 ");
	}

}
