package CssSelector.CssSelector;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;



public class selectors {
	public static void main(String args[])
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.nopcommerce.com/");
		
		//to maximize the window
		driver.manage().window().maximize();
		
		//tag and id 
		//driver.findElement(By.cssSelector("input#small-searchterms")).sendKeys("T-shirts");
		//tag is optional
		//driver.findElement(By.cssSelector("#small-searchterms")).sendKeys("T-shirts");
		
		//tag and class.... here tag name is optional
		//driver.findElement(By.cssSelector(".search-box-text")).sendKeys("bags");
		
		//tag and attribute   tag[attribute="value"]
		//driver.findElement(By.cssSelector("input[placeholder='Search store']")).sendKeys("T shirts");
		
		//tag class and attribute
		//if elements are containing same tag and class on that situation use tag class and attribute if the elements are containing  same class and tag name on that situation may get group of items if you need to get only single element on that case we are using tag class and atttribute 
		driver.findElement(By.cssSelector(".search-box-text[name='q']")).sendKeys("T shirts");
		
		
		
		
	}

}
