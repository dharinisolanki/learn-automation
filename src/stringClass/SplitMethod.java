package stringClass;

public class SplitMethod {

	public static void main(String[] args) {

		String fullname = "selenium-QTP-HP-Grid";
		// we are asking to spit the string whenever - comes adn store it in
		// string array
		String[] toolName = fullname.split("-");

		for (int i = 0; i < toolName.length; i++) {

			System.out.println("value for " + i + " is " + toolName[i]);
			if (toolName[i].equalsIgnoreCase("selenium")) {

				System.out.println("test pass");
				break;

			}
		}

	}

}
