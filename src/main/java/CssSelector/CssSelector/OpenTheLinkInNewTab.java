package CssSelector.CssSelector;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class OpenTheLinkInNewTab {
	public static void main(String args[]) throws InterruptedException
	{
	WebDriver driver=new ChromeDriver();
	driver.get("https://demo.nopcommerce.com/");
	WebElement regLink=driver.findElement(By.xpath("//a[normalize-space()='Register']"));
	//regLink.click();  // it display registretion page in same same instead of displaying register page in same page we need to open separate tab/page
	
	Actions act=new Actions(driver);  
	act.keyDown(Keys.CONTROL).click(regLink).keyDown(Keys.CONTROL).perform();   //click mathod is available in 2 classes 1)Webelement class 2)Actions class
	//The webelement click() method doesn't accept any parameters and Actions class click method accept paramters
	
	
	// here registration page open's in new page but driver is still focus on main page/first page only... now driver is switch to registration page by using the switch command
	//switching to registration page
	//Set<String> ids=driver.getWindowHandles();
	//here set is not allowed index then convert set into list collection
	List<String> ids=new ArrayList(driver.getWindowHandles());
	
	driver.switchTo().window(ids.get(1)); //switch to registration page
	
	driver.findElement(By.xpath("//input[@id='FirstName']")).sendKeys("lucky");
	
	}
	
	
	

}
