package CssSelector.CssSelector;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WaitCommands {
	public static void main(String args[]) throws InterruptedException
	{
		//implicit and explicit wait/fluent wait
		
		WebDriver driver=new ChromeDriver();
		
		
		//implicit wait
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		//Explicit wait
		WebDriverWait mywait=new WebDriverWait(driver,Duration.ofSeconds(10));
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		
		driver.manage().window().maximize();
		
		//driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys("Admin");
		//driver.findElement(By.xpath("//input[@name='username']")).sendKeys("Admin");
		
		//using explicit wait
		WebElement txtusername=mywait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@placeholder='Username']")));
		txtusername.sendKeys("lucky");
		
		
		
		
	}

}
