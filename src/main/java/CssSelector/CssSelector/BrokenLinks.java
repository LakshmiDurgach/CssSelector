package CssSelector.CssSelector;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrokenLinks {
	public static void main(String args[])
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.deadlinkcity.com/");
		
		//first we capture all links---- all links contains <a> tag
		 List<WebElement> links=driver.findElements(By.tagName("a"));
		 System.out.println("total number of links:"+links.size());
		 
		 for(WebElement linkElement:links)
		 {
			 String hrefvalue=linkElement.getAttribute("href");
		 
		 if(hrefvalue==null || hrefvalue.isEmpty())
		 {
			 System.out.println("href attribute is null or empty. so not possible to check ");
			 continue;
		 }
		 
		 //hit url to the server
		 
		 //URL linkURL=new URL(hrefvalue);
		// HttpUr8
		 
			 
		 }
		
	}

}
