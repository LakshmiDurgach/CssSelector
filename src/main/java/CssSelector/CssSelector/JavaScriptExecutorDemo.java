package CssSelector.CssSelector;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
//import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScriptExecutorDemo {
	public static void main(String args[])
	{
		//here instead of using webDriver use ChromeDriver we don't require the type casting. we directly assign the driver into JavascriptExecutor().
		//WebDriver driver=new ChromeDriver();
		ChromeDriver driver=new ChromeDriver();
		
		
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		
		//driver.findElement(By.xpath("//input[@id='name']")).sendKeys("lakshmi");
		
		//javascriptExecutor is used for click() and sendKeys() methods. whenever we inspect the elements x path is correct but the element is found on that situation Occurs ElementInterceptionException. on those conditions use JavaScriptExecutor().
		WebElement inputbox=driver.findElement(By.xpath("//input[@id='name']"));
		//Here driver is assigned to JavaacriptExecutor using typecasting 
		JavascriptExecutor js=(JavascriptExecutor)driver;
		
		js.executeScript("arguments[0].setAttribute('value','Lucky')",inputbox);
		
		//radio button
		WebElement radiobutton=driver.findElement(By.xpath("//input[@id='female']"));
		js.executeScript("arguments[0].click()",radiobutton);
		
		
		
	}

}
