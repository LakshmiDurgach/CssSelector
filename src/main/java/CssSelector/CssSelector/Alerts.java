package CssSelector.CssSelector;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Alerts {
	public static void main(String args[]) throws InterruptedException
	{
	//WebDriver driver=new ChromeDriver();
	//driver.get("https://the-internet.herokuapp.com/javascript_alerts");
	//driver.manage().window().maximize();
	
	//1)noraml alert with ok button
	//driver.findElement(By.xpath("//button[normalize-space()='Click for JS Alert']")).click();
	
	//close the alert
	//driver.switchTo().alert().accept();
	
	
	//close the alert window and print the text
//	Alert myalert=driver.switchTo().alert();
//	System.out.println(myalert.getText());
//	myalert.accept();
	
	//2)confirmation alert with ok and cancel button
//	driver.findElement(By.xpath("//button[normalize-space()='Click for JS Confirm']")).click();
//	Thread.sleep(5000);
//	
//	//driver.switchTo().alert().accept(); //close the alert using ok button
//	driver.switchTo().alert().dismiss(); //close the alert using cancel button
	
	
	//3)prompt alert
//	driver.findElement(By.xpath("//button[normalize-space()='Click for JS Prompt']")).click();
//	Thread.sleep(5000);
//	
//	 Alert myalert=driver.switchTo().alert();
//	 myalert.sendKeys("Welcome");
//	 myalert.accept();
	
	
	
	//4)  Handle alert without using switchTo() command    ans) using explicit wait----->most important
		/*WebDriver driver=new ChromeDriver();
		WebDriverWait mywait=new WebDriverWait(driver,Duration.ofSeconds(10)); //explicit wait
		
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//button[normalize-space()='Click for JS Alert']")).click();
		Thread.sleep(5000);
		
		Alert myalert=mywait.until(ExpectedConditions.alertIsPresent()); //capture the alert using explicit wait
		
		System.out.println(myalert.getText());
		myalert.accept();*/
		
		//if alert is not available alertNotFound Excepption will get
		
		//how to handle authenticated popup/Alert
		
		WebDriver driver=new ChromeDriver();
		//authenticated popup
		//driver.get("http://the-internet.herokuapp.com/basic_auth");
		
		//Handle authentincated popup by passing username and password in link
		driver.get("http://admin:admin@the-internet.herokuapp.com/basic_auth");
		
		
		
		
		
		
		
		
		
	
	
	 
	
	
	
	
	}
	
	
	

}
