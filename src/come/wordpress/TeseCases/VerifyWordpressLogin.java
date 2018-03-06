package come.wordpress.TeseCases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import come.wordpress.pages.LoginPage;

public class VerifyWordpressLogin {
	
	
	@Test
	public void verifyValidlogin(){
		
		
		System.setProperty("webdriver.gecko.driver", "C:/FFdriver/geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("http://demosite.center/wordpress/wp-login.php");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		LoginPage login =  new LoginPage(driver);
		
		login.typeUsernameAndpassword("admin", "demo123");
		
		
		driver.quit();
		
	}

}
