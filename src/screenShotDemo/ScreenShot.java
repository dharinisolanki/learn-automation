package screenShotDemo;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import screenshot_library.Utility;

public class ScreenShot {
	
	WebDriver driver;
	
	
	@Test
	public void capture_screenshot() throws Exception
	{
		System.setProperty("webdriver.gecko.driver", "C:/FFdriver/geckodriver.exe");
	 driver = new FirefoxDriver();
	 driver.manage().window().maximize();
	 driver.get("https://www.facebook.com/");
	 //Utility.captureScreenShot(driver, "Browse Started");
	 
	 driver.findElement(By.xpath(".//*[@id='email']")).sendKeys("somethjing");
	
	 
	 Assert.assertEquals("Faceeeebook - Log In or Sign Up", driver.getTitle(),"Titile does not match");
	 
	 //calling this method each time i want to take a screen shot bbut giving different names to each screen shot files
	 
	 Utility.captureScreenShot(driver, "type username");
	 
	 
	}
	
	@AfterMethod
	
	//ItestResult is an interface in testNg whcih keep all the infor abnout the test case which we execute
	//below "result" variable will keep all the info about the test case that we are running
	public void tearDown(ITestResult result)
	{
		// result.getStatus() will give you pass or fail status of that p[articular test case and compare ITestresult
		if(ITestResult.FAILURE==result.getStatus())
		{
			//result.getName() will fetch you testcase name
			Utility.captureScreenShot(driver, result.getName());
		}
		driver.quit();
		}

}
