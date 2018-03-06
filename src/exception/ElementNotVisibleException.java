package exception;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class ElementNotVisibleException {
	WebDriver driver;

	@Test
	public void hiddenElement() throws Exception {
		System.setProperty("webdriver.gecko.driver", "C:/FFdriver/geckodriver.exe");
		driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("http://seleniumpractise.blogspot.com/2016/08/how-to-automate-radio-button-in.html");
		
		
		//if you serach for "male" radio button, you will see two input fields. one of them are hidden.
		//since it shows two inputs for onew elements we will have to use "findelements" to get list of elements
		
		List <WebElement> ele = driver.findElements(By.id("male"));
		int count = ele.size();
		System.out.println("size of the elements are " + count);
		
		for(int i =0; i< count; i++)
		{
			int x = ele.get(i).getLocation().getX();
			if(x !=0){
				ele.get(i).click();
				break;
			}
		}
			

	}
}
// you will create a code in the framework library to use it again.