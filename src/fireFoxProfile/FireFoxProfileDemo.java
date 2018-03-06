package fireFoxProfile;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.internal.ProfilesIni;


// it is a new code accordingto the changes that has been made in selenium library. this code will not match to mukesh s code for this reason

public class FireFoxProfileDemo {
	
 
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
       
		
		//Use Profileini clas to load all the firefox profiles
		ProfilesIni init = new ProfilesIni();
		
		
		//getProfile will be used to get the specific profile
		FirefoxProfile profile=init.getProfile("default");
		 
		
		System.setProperty("webdriver.gecko.driver", "C:/FFdriver/geckodriver.exe");
		
		//Firefoxoption is a class, usibng this class object you can set a paricular profile using setProfile method.
		FirefoxOptions opt = new FirefoxOptions();
		opt.setProfile(profile);
		
		//pass the session/profile to firefoxDriver
		driver=new FirefoxDriver(opt);
		
		driver.get("http://learn-automation.com/default-firefox-profile-in-selenium/");
		
		Thread.sleep(2000);
		
		driver.quit();

	}
}
