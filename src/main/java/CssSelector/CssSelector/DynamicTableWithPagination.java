package CssSelector.CssSelector;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DynamicTableWithPagination {
	public static void main(String args[])
	{
	WebDriver driver=new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	driver.get("https://demo.opencart.com/admin/index.php");
	driver.manage().window().maximize();
	
	/*WebElement username=driver.findElement(By.xpath("//input[@id='input-username']"));
	username.clear();   //BY default the user name and password is availble that'y first we clear that user name and password and reenter the username and password
	username.sendKeys("demo");
	
	WebElement password=driver.findElement(By.xpath("//input[@id='input-password']"));
	username.clear();
	username.sendKeys("demo");
	
	//Login
	driver.findElement(By.xpath("//button[@type='submit']")).click();
	
	//close window if it is availble
	if(driver.findElement(By.xpath("button[@class='btn-close']")).isDisplayed())
	{
		driver.findElement(By.xpath("button[@class='btn-close']")).click();
		
	}
	
	//click on customers main menu
	driver.findElement(By.xpath("//a[@class='parent collapsed']")).click();
	
	//click on customers sub menu
	driver.findElement(By.xpath("//ul[@id='collapse-5']//a[contains(text(),'Customers']")).click();*/
	
	
	
	
	
	
	
	}

}
