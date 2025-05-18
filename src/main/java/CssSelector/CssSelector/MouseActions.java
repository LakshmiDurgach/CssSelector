package CssSelector.CssSelector;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseActions {
	public static void main(String args[])
	{
	WebDriver driver=new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	driver.get("https://demo.opencart.com/");
	driver.manage().window().maximize();
	//WebElement desktops=driver.findElement(By.xpath("//a[normalize-space()='Desktops']"));
	WebElement desktops=driver.findElement(By.xpath("//a[@class='nav-link dropdown-toggle']"));
	
	WebElement mac= driver.findElement(By.xpath("//a[normalize-space()='Mac (1)']"));
	
	Actions act=new Actions(driver);
	
	//Mouse Hover ACtion
	act.moveToElement(desktops).moveToElement(mac).build().perform();
	
	
	}
	

}
