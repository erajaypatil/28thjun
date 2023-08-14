package TestClass;

import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;
import java.util.concurrent.TimeUnit;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BrokenLinks {

	public static void main(String[] args) throws Exception {


		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		
		driver.get("http://www.deadlinkcity.com/");
		
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		List<WebElement> links = driver.findElements(By.tagName("a"));
		
		System.out.println("Total links present on the page is" +links.size());
		
		int brokenlinks=0;
		for(WebElement elements:links)
		{
			//System.out.println(elements.getText());
			String url=elements.getAttribute("href");
			
			if(url==null || url.isEmpty())
			{
				
				System.out.println("url is empty");
				continue;
			}
			
			URL link=new URL(url);
			
			try {
			HttpURLConnection httpconn=(HttpURLConnection)link.openConnection();
			
			httpconn.connect();
			
			if(httpconn.getResponseCode()>=400)
			{
				System.out.println(httpconn.getResponseCode()+url +" is"+" broken link");
				brokenlinks++;
			}
			else
			{
				System.out.println(httpconn.getResponseCode()+url+" is" +" valid link");
			}
			}
			catch(Exception e){
				
			}
			
			System.out.println("BNumber of broken links:" +brokenlinks);
			driver.quit();
			
		}
	
	
		
		

	}
}


