package come.wordpress.TeseCases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import come.wordpress.pages.LoginPageNew;
import helper.Browserfactory;

public class VerifyValidLogin {
	

	public void chkValidUser(){
		
		//this will launch the browser and specific url
		WebDriver driver = Browserfactory.startBrowser("Firefox", "http://demosite.center/wordpress/wp-login.php");
		
		
		//Created page object using page factory
		LoginPageNew loginPage = PageFactory.initElements(driver, LoginPageNew.class);
		
		//call the method
		loginPage.login_wordpress("admin", "demo123");
		
	}
	
	
}
