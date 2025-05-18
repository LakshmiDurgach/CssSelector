package CssSelector.CssSelector;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.Color;

public class CheckBackgroundColor {
	public static void main(String args[])
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://omayo.blogspot.com/");
	    driver.manage().window().maximize();
	    String expectedColor="#333333";
	    String rgbColor=driver.findElement(By.xpath("//div[@id='cssmenu']")).getCssValue("background-color");
	    System.out.println(rgbColor);
	    Color color=Color.fromString(rgbColor);
	    String hexActalColor=color.asHex();
	    System.out.println(hexActalColor);
	    //driver.quit();
	    
	    
	    
	}

}
