package come.wordpress.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class LoginPage {
	
	
	WebDriver driver;
	
	//This calss will store all the locators
	
	By username = By.id("user_login");
	By password = By.xpath(".//*[@id='user_pass']");
	By loginButton = By.name("wp-submit");

	
	public LoginPage(WebDriver driver){
		
		this.driver = driver;
		
	}
	
	public void typeUsernameAndpassword( String userid, String pass){
		
		driver.findElement(username).sendKeys(userid);
		driver.findElement(password).sendKeys(pass);
		driver.findElement(loginButton).click();
	}
	
	
	
	
	
	
}

