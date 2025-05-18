package Selenium;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Checkbox {
	public static void main(String[] args) 
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://testautomationpractice.blogspot.com/");
		//one check box
		driver.findElement(By.xpath("//input[@id='sunday']")).click();
		//multiple checkbox
		List<WebElement> checkboxes=driver.findElements(By.xpath("//input[@type='checkbox' and @class='form-check-input']"));
		/*for(int i=0;i<checkboxes.size();i++)
		{
			checkboxes.get(i).click();
			
		}*/
		/*for(WebElement checkbox:checkboxes)
		{
			checkbox.click();
			
		}
		*/
		for(int i=4;i<checkboxes.size();i++)
		{
			checkboxes.get(i).click();
			
		}
		
		
		
		
		
	}

}
