package CssSelector.CssSelector;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDown {
	public static void main(String args[]) throws InterruptedException
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		 WebElement drpdownele=driver.findElement(By.xpath("//select[@id='country']"));
		 Select drpdown=new Select(drpdownele);
		 
		 //select option from the dropdown
		 //drpdown.selectByVisibleText("France");
		 
		 //drpdown.selectByValue("japan");
		 
		 //drpdown.selectByIndex(5);
		 
		 //capture the  all elements from the dropdown
		 List<WebElement> options=drpdown.getOptions();
		 System.out.println("Number of options in the group:"+options.size()); //10
		 
		 //printing the options
		 /*for(int i=0;i<options.size();i++)
		 {
			 System.out.println(options.get(i).getText());
		 }*/
		 
		 //getOptions()---- returns all the options from the dropdown as a webelement
		 
		 //enhances for loop
		 for(WebElement op:options)
		 {
			 System.out.println(op.getText());
			 
		 }
		 
		}
}
