package autoITWindowsAuthentication;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class AutoITWindowsAuthenticationDemo {

	static WebDriver driver;
	public static void main(String[] args) throws IOException {
	
		System.setProperty("webdriver.gecko.driver", "C:/FFdriver/geckodriver.exe");
		driver = new FirefoxDriver();

		driver.manage().window().maximize();
		//use this l
		//Runtime.getRuntime().exec("C:\\Users\\hiren\\Desktop\\AutoITScript\\AutoIdDemo.exe");
		driver.get(" https://www.engprod-charter.net/");
		Runtime.getRuntime().exec("C:\\Users\\hiren\\Desktop\\AutoITScript\\AutoIdDemo.exe");

	}

}
