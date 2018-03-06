package screenshot_library;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;

public class Utility {

	public static void captureScreenShot(WebDriver driver, String screenshotName) {
		try {

			// It is predefinded interface in sleenium webdriver and we cant
			// create an object of an interface
			// Since it is an interface and we cant create an object of an
			// interface we need to typecast WebDriver instance to
			// takescreenshot.
			TakesScreenshot screenshot = (TakesScreenshot) driver;

			// below command will create an image file in the memory
			File src = screenshot.getScreenshotAs(OutputType.FILE);

			
			//instead of hardcoding a file name we can pass string parameter and decide which name we want to give to oput screenshot file
			//it comes very handy when we have to take multiple screens shot in our one single script.
			//if we hardcode the screenshot file name lets say "facebook.png" , it will get overridden by new screen shot files each time
			FileUtils.copyFile(src, new File("./ScreenShots/" + screenshotName + ".png"));

			System.out.println("Screenshot taken");
		} catch (Exception e) {
			System.out.println("Exception while taking screenshot" + e.getMessage());
		}

	}
	
	
}
