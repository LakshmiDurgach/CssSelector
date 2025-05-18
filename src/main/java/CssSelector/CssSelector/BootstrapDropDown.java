package CssSelector.CssSelector;

import org.openqa.selenium.By;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.WebDriver;

public class BootstrapDropDown {
	public static void main(String args[])
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://www.jquery-az.com/boots/demo.php?ex=63.0_2");
		driver.manage().window().maximize();
		
		//1) select single option
		driver.findElement(By.xpath("//button[contains(@class,'multiselect')]")).click();
		driver.findElement(By.xpath("//input[@value='Java']")).click();
		
		//2)capture all the options and find out size
		List<WebElement> options=driver.findElements(By.xpath("//ul[contains(@class,'multiselect')]//label"));
		System.out.println("Number of options:"+options.size());
		
		//3) printing options from dropdown
		/*for(WebElement op:options) 
		{
			System.out.println(op.getText());
			
		}*/
		
		//4)select multiple options
		for(WebElement op:options)
			{
			
			if(op.getText().equals("java") || op.getText().equals("Python") || op.getText().equals("mysql"));
			{
				op.click();
			}
			}
	}
}
		
		
		
		
		
		
		
		
		
		
		
	


