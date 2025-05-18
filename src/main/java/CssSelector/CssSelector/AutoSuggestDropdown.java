package CssSelector.CssSelector;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoSuggestDropdown {
	public static void main(String args[])
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://www.google.com");
        driver.findElement(By.name("q")).sendKeys("selenium");
        
        //find the x path for all the ten elements
        List<WebElement> list=driver.findElements(By.xpath("//ul[@role='listbox']//li//div[@role='option']"));
        
        System.out.println(list.size());
        
        for(int i=0;i<list.size();i++)
        {
        	System.out.println(list.get(i).getText());   //print all the suggested dropdown elements
        	if(list.get(i).getText().equals("selenium"))  // only print one element 
        	{
        		list.get(i).click();
        		break;
        	}
        }
        
        
        }

}
