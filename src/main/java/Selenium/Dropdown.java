package Selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;


public class Dropdown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		WebElement dropdownele=driver.findElement(By.xpath("//select[@id='country']"));
		Select dropdown=new Select(dropdownele);
		//dropdown.selectByIndex(5);
		dropdown.selectByValue("Japan");
		//dropdown.selectByVisibleText("Japan");
		
		
		

	}

}
