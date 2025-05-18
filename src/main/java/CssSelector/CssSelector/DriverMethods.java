package CssSelector.CssSelector;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DriverMethods {
	public static void main(String args[]) throws InterruptedException
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		Thread.sleep(10000);
		
		//returns  title of the page
		System.out.println(driver.getTitle());
		//returns currenturl of the page
		System.out.println(driver.getCurrentUrl());
		//returns page source 
		System.out.println(driver.getPageSource());
		//returns id of the browser window
		
		String windowid = driver.getWindowHandle();
		System.out.println("window id:"+windowid);
		
		
		//returns id's of the multiple  browser window
		driver.findElement(By.linkText("OrangeHRM, Inc")).click();
		Set<String> windowids =driver.getWindowHandles();
		System.out.println("window ids:"+windowids);    //window ids:[072FC27928F522275D9B9C82F99514EE, 243D4FB5CD02C57EB3540E65714BCCF1]
		
		// here why we are using collection?
		//driver.getWindowHandles() returns a number of ids that'y we are using collections 
		// here why we are using set collection?
		//ids can't have duplicate values and set doesn't allow duplicate values that'y we are using Set 
		
		
		
		
	}

}
