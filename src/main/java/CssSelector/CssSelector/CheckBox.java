package CssSelector.CssSelector;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckBox {
	public static void main(String args[])
	{
	WebDriver driver=new ChromeDriver();
	
	driver.get("https://testautomationpractice.blogspot.com/"); 
	driver.manage().window().maximize();
	
	//1.select one check box
	//driver.findElement(By.xpath("//*[@id='sunday']")).click();
	
	//2.Select all the check boxes 
	List<WebElement> checkboxes=driver.findElements(By.xpath("//input[@class='form-check-input' and @type='checkbox']"));
	
	/*for(int i=0;i<checkboxes.size();i++)
	{
		checkboxes.get(i).click();
	}*/
	
	//enhanced for loop
	/*for(WebElement checkbox:checkboxes)
	{
		checkbox.click();
	}*/
	
	//3) i want to select last 3 checkboxes
	
	/*for(int i=4;i<checkboxes.size();i++) {
		checkboxes.get(i).click();
		
	}*/
	
	//4)first 3 checkbxes
	/*for(int i=0;i<3;i++)
	{
		checkboxes.get(i).click();
	}*/
	
	//5)unselect checkboxes if they are selected
	for(int i=0;i<checkboxes.size();i++)
	{
		if(checkboxes.get(i).isSelected())
		{
		checkboxes.get(i).click();
		}
	}
	
	
	

	}
	
	
	
	

}
