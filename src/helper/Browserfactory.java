package helper;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Browserfactory {
	
	static WebDriver driver;
	
	public static WebDriver startBrowser(String browserName, String url)
	{
		if(browserName.equalsIgnoreCase("firefox")){
			System.setProperty("webdriver.gecko.driver", "C:/FFdriver/geckodriver.exe");
			driver = new FirefoxDriver();
		}
		else if (browserName.equalsIgnoreCase("chrome")){
			System.setProperty("webdriver.gecko.driver", "C:/chromeDriver/chromedriver.exe");
			driver = new FirefoxDriver();
		}
		else if(browserName.equalsIgnoreCase("Interner Explorer")){
			System.setProperty("webdriver.gecko.driver", "C:/ieDriver/IEDriverServer.exe");
			driver = new FirefoxDriver();
		}
		
		driver.manage().window().maximize();
		driver.get(url);
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		return driver;
	}

}
