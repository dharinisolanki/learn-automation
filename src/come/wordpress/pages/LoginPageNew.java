package come.wordpress.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class LoginPageNew {
	
	WebDriver driver;
	
	public LoginPageNew(WebDriver driver){
		
		this.driver = driver;
		
	}
	
	 @FindBy(id = "user_login")  WebElement username;
	 
	 @FindBy(id = "user_pass") WebElement password;
	 
	 
	 /// using how is a standard approach
	 @FindBy(how = How.ID, using = "wp-submit") WebElement loginButton;
	 
	 @FindBy(how = How.XPATH, using = "//*[@id='nav']/a") WebElement link;
	 
	 public void login_wordpress (String uid, String pass){
		 
		 username.sendKeys(uid);
		 password.sendKeys(pass);
		 loginButton.click();
	 }

}
