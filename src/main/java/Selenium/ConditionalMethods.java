package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ConditionalMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.nopcommerce.com/register");
		WebElement logo=driver.findElement(By.xpath("//img[@alt='nopCommerce demo store']"));
		System.out.println("Ststus of the logo is:"+logo.isDisplayed());
		WebElement status=driver.findElement(By.xpath("//input[@type='text']"));
		System.out.println("Ststus of the input box  is:"+status.isEnabled());
		WebElement radio=driver.findElement(By.xpath("//input[@id='gender-male']"));
		
		System.out.println("Ststus of the radio box  is:"+radio.isSelected());
		
		
		

	}

}
