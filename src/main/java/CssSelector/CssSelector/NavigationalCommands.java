package CssSelector.CssSelector;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.sun.tools.javac.util.List;

public class NavigationalCommands {
	public static void main(String args[]) throws MalformedURLException
	{
			WebDriver driver=new ChromeDriver();
			
			//driver.navigate to is work as similar to driver.get() method
			//driver.get("https://demo.nopcommerce.com/");
			
			//In navigate().to() method accepts the url as 2 formats 1)String and 2) url format
			//driver.navigate().to("https://demo.nopcommerce.com/");
			
			//URL myurl=new URL("https://demo.nopcommerce.com/");
			//driver.navigate().to(myurl);
			
			//driver.navigate().to("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
//			driver.navigate().back();
//			System.out.println(driver.getCurrentUrl());
			
//			driver.navigate().forward();
//			System.out.println(driver.getCurrentUrl());
//			
//			driver.navigate().refresh();
			
			
			//difference between getWindowHandle and getWindowHandles()
			//switch one browser window to another browser window
			//driver.navigate().to("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
			driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
			driver.manage().window().maximize();
			
			driver.findElement(By.linkText("OrangeHRM, Inc")).click();
			
			Set<String> windowIDs=driver.getWindowHandles();
			//why we are converting set into list connection
			//By using set collection we can't extract individual items
			//set collection doesn't have a get method to get the individual items that'y we are converting set into list collection
			
			ArrayList<String> windowList=new ArrayList(windowIDs);
			String parentId=windowList.get(0);
			String childId=windowList.get(1);
			
			//switch to child window
			System.out.println(driver.getTitle());
			
		
			
			
			
			
	}

}
