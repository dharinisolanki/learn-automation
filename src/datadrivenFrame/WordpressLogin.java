package datadrivenFrame;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class WordpressLogin {
	WebDriver driver;
	
	@Test(dataProvider = "WordPressData")
	public void loginToWordpress(String username, String password) throws InterruptedException{
		
		System.setProperty("webdriver.gecko.driver", "C:/FFdriver/geckodriver.exe");
		driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("http://demosite.center/wordpress/wp-login.php");
		
		
		driver.findElement(By.id("user_login")).sendKeys(username);
		driver.findElement(By.id("user_pass")).sendKeys(password);
		driver.findElement(By.id("wp-submit")).click();
		
		Thread.sleep(3000);
		//System.out.println("Page title is "+ driver.getTitle());
		Assert.assertTrue(driver.getTitle().contains("Dashboard"), "in-valid credential");
		
		
		
		
	}
	

	@DataProvider(name ="WordPressData")
	public Object[][] passdata(){
		
		Object[][] data = new Object[3][2];
		
		data[0][0] = "admin1";
		data[0][1] = "demo1";
		
		data[1][0] = "admin";
		data[1][1] = "demo123";
		
		data[2][0] = "admin0";
		data[2][1] = "demo12";
 		return data;
		
	}
	

	@AfterMethod
	public void teardown(){
	driver.quit();
	} 
}
