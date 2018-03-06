package brokenLink;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BrokenLinkdemo {

	static WebDriver driver;

	public static void main(String[] args) throws IOException {

		System.setProperty("webdriver.gecko.driver", "C:/FFdriver/geckodriver.exe");
		driver = new FirefoxDriver();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(2000, TimeUnit.SECONDS);
		List<WebElement> linksOnPage = driver.findElements(By.tagName("a"));
		System.out.println("Total links are " + linksOnPage.size());

		for (int i = 0; i < linksOnPage.size(); i++) {
			WebElement element = linksOnPage.get(i);

			String url = element.getAttribute("href");
			
			verifyActiveLink(url);

		}

	}

	public static void verifyActiveLink(String linkUrl) throws IOException {

		try {
			URL url = new URL(linkUrl);
			HttpURLConnection connection = (HttpURLConnection) url.openConnection();
			connection.setConnectTimeout(3000);
			connection.connect();

			if (connection.getResponseCode() == 200) {
				System.out.println(linkUrl + " - " + connection.getResponseMessage());
			}
			if (connection.getResponseCode() == HttpURLConnection.HTTP_NOT_FOUND) {
				System.out.println(linkUrl + " - " + connection.getResponseMessage());
			}

		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}










