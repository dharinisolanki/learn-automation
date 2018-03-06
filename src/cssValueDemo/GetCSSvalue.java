package cssValueDemo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class GetCSSvalue {

	static WebDriver driver;
	
	@Test
	public static void getTitle() throws InterruptedException {
		//---> not including this line as of now and see what error it gives
		System.setProperty("webdriver.gecko.driver", "C:/FFdriver/geckodriver.exe");
		driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		driver.manage().timeouts().implicitlyWait(2000, TimeUnit.SECONDS);
		
		
		String  pageTitle = driver.getTitle();
		System.out.println("Page titloe is " + pageTitle);
		String cssvalue = driver.findElement(By.xpath(".//*[@id='tsf']/div[2]/div[3]/center/input[1]")).getCssValue("font-size");
		System.out.println(cssvalue);
		
		
		Thread.sleep(3000);
		driver.close();

	}

}

