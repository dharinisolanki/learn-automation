package bootStrapDropdown;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BootStrapDropdownDemo {

	
	static WebDriver driver;
	public static void main(String[] args) {
      
		
		System.setProperty("webdriver.gecko.driver", "C:/FFdriver/geckodriver.exe");
		driver = new FirefoxDriver();
		driver.get("https://www.jquery-az.com/boots/demo.php?ex=63.0_2");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(2000, TimeUnit.SECONDS);
		
		
		driver.findElement(By.xpath("//button[contains(@class,'multiselect')]")).click();
		List<WebElement> allTheDropDown= driver.findElements(By.xpath("//ul[contains(@class,'multiselect-container')]//li//a//label"));
		System.out.println("the size is" + allTheDropDown.size());
		
		//1. selecting a prticular option
		
//		for(int i = 0; i<allTheDropDown.size();i++)
//		{
//			String dropdownoptionsText = allTheDropDown.get(i).getText();
//			System.out.println(dropdownoptionsText);
//			if(dropdownoptionsText.contains("MySQL")){
//				//OR if(allTheDropDown.get(i).getText().contains("MySQL"){
//				allTheDropDown.get(i).click();
//				break;
//			}
//		}
		
		//2.selecting all the option excpt what is been checked
		for(int i = 0; i<allTheDropDown.size();i++)
		{
		String dropdownoptionsText = allTheDropDown.get(i).getText();
		allTheDropDown.get(i).click();
			
		}

		//if any options are seleted the do not select it  
		for(int i =0; i<allTheDropDown.size(); i++){
			
			String dropdownoptionsText1 = allTheDropDown.get(i).getText();
			
			boolean isSelected = allTheDropDown.get(i).isSelected();
				if(isSelected = true){
					
					
			}
		}
		
	}

}
