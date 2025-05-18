package Selenium;

import org.openqa.selenium.WebDriver;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.ArrayList;
import java.util.Set;


public class NavigationalMethods {

	public static void main(String[] args) throws MalformedURLException {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		//driver.get("https://demo.nopcommerce.com/");
		//driver.navigate().to("https://demo.nopcommerce.com/");
		
//		URL myurl=new URL("https://demo.nopcommerce.com/");
//		driver.navigate().to(myurl);
//		
//		driver.navigate().to("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
//		driver.navigate().back();
		//driver.navigate().forward();
		//driver.navigate().refresh();
		
		//Handle multiple windows
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		driver.findElement(By.linkText("OrangeHRM, Inc")).click();
		Set<String>windowids=driver.getWindowHandles();
		ArrayList<String> window=new ArrayList(windowids);
		String parentid=window.get(0);
		String childid=window.get(1);
		System.out.println(driver.getTitle());
		
		
		
		
		
		

	}

}
