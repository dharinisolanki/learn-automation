package javScriptcodes;

import org.openqa.selenium.JavascriptException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class AlternativeForSendKeyUsingJavaScript {
	static WebDriver driver;
	private static JavascriptExecutor js;

	public static void main(String[] args) {

		// common interview que: how to type in slenium without using sendKeys
		// method
		js = (JavascriptExecutor)driver;
		System.setProperty("webdriver.gecko.driver", "C:/FFdriver/geckodriver.exe");
		driver = new FirefoxDriver();

		driver.manage().window().maximize();

		driver.get("https://www.google.com/");
		js.executeScript("return document.getElementById('tsf').value='nikki';");

	}

}
