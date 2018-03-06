package brokenLink;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BrokenLinkwithMoreScenarios {

	static WebDriver driver;
	
	
	public static void main(String[] args) throws MalformedURLException, IOException, InterruptedException {
		
		
		System.setProperty("webdriver.gecko.driver", "C:/FFdriver/geckodriver.exe");
		driver = new FirefoxDriver();
		driver.get("https://www.freecrm.com/index.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(2000, TimeUnit.SECONDS);
		
		
		
//		driver.findElement(By.id(".//*[@id='loginForm']/div/input[1]")).sendKeys("dhariniparmar");
//		Thread.sleep(2000);
//		driver.findElement(By.xpath(".//*[@id='loginForm']/div/input[2]")).sendKeys("jaigopal");
//		driver.findElement(By.xpath(".//*[@id='loginForm']/div/div/input")).click();
//		

		//1. get the list of all the links and images

		//--> you are saving all the links in "linklist"
		List<WebElement> linkList = driver.findElements(By.tagName("a"));
		//---> you are adding all the images in the "linklist" as well
		linkList.addAll(driver.findElements(By.tagName("img")));
		//---> so toatal size of links and images will get printed here
		System.out.println("Size of full links and Images---->"+ linkList.size());

		//---> i want to store only active links in this list which are def working fine. 
		List<WebElement> activelinks = new ArrayList<WebElement>();

		//2. iterate linklist:exclude all the links/images which has no href attribute--> sometime business doesnt want to click on link and have the unnecessary extra page OR
		//sometime links are created on page but clicking on link and having another page after clicking it--> that code remains for the future work.

		for(int i = 0; i<linkList.size(); i++){
		System.out.println((linkList.get(i).getAttribute("href")));
		if(linkList.get(i).getAttribute("href") != null && (!linkList.get(i).getAttribute("href").contains("javaScripts"))){
			activelinks.add(linkList.get(i));
		}
		}


		//get the size of active links list:
	   System.out.println("size of active links and images" + "--->"+ activelinks.size());


		//3. check href url, with httpconnetion api:
		//200-- ok
		//404-- page noy found
		//500-- interal error
		//400-- bad req.

		for(int j = 0; j<activelinks.size(); j++){
			HttpURLConnection connection = (HttpURLConnection)new URL(activelinks.get(j).getAttribute("href")).openConnection();
			connection.connect();

			String response = connection.getResponseMessage();
			connection.disconnect();
			System.out.println(activelinks.get(j).getAttribute("href")+"---->"+response);

		}
		

	}
	}


