package untrustedCertificate;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

public class FireaFoxDemo {
	WebDriver driver;
	
	@SuppressWarnings("deprecation")
	@Test
	public void handleCerificate(){
		System.setProperty("webdriver.gecko.driver", "C:/FFdriver/geckodriver.exe");
		//driver = new FirefoxDriver();
		
		//it is a class coming from selenium
		DesiredCapabilities cap = new DesiredCapabilities();
		//CapabilityType is an interface provided by selenium
		cap.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);
		//not sure why it is getting deprecated
		driver = new FirefoxDriver(cap);
		
		driver.get("https://www.cacert.org/");
	}

}
