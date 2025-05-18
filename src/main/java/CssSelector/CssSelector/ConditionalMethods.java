package CssSelector.CssSelector;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ConditionalMethods {
	public static void main(String args[])
	{
	WebDriver driver=new ChromeDriver();
	driver.get("https://demo.nopcommerce.com/register");
	driver.manage().window().maximize();
	//isDisplayed
	WebElement logo=driver.findElement(By.xpath("//img[@alt='nopCommerce demo store']"));
	System.out.println("Display statusof logo:"+logo.isDisplayed());
	//isDisplayed  is used all type of elements
	boolean status=driver.findElement(By.xpath("//img[@alt='nopCommerce demo store']")).isDisplayed();
	System.out.println("status is :"+status);
	
	//isEnabled is used for input boxes drop down radio boxes  and check boxes 
	 boolean status1=driver.findElement(By.xpath("//*[@id='FirstName']")).isEnabled(); 
	 System.out.println("status is :"+status1);
	 
	 //isSelected we can check the element is selected or not
	 //before select radio button
	  WebElement male=driver.findElement(By.xpath("//input[@id='gender-male']"));
	  System.out.println(male.isSelected());
	  
	  //after select radio button
	  male.click();
	  System.out.println(male.isSelected());
	  
	  //check boxes
	   boolean newsletterstatus=driver.findElement(By.xpath("//*[@id='Newsletter']")).isSelected();
	   System.out.println(newsletterstatus);
	   
	   //browser methods
	   //close and quit
	   //close---- close single  browser window 
	   // if two windows are opened you can use the the driver.close() method  it closes the first window second window still opened
	   //quit()-----close multiple or all  browser windows
	   driver.close();
	   driver.quit();
	   
	  
	  
	  
	  
	 
	 
	
	
	}
}
	


