package CssSelector.CssSelector;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class SlidersDemo {
	public static void main(String args[]) throws InterruptedException
	{
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.jqueryscript.net/demo/Price-Range-Slider-jQuery-UI/");
	//driver.manage().window().maximize();
	
	Actions act=new Actions(driver);
	
	
	//minimum slider 
	//this is a horizontal slider that's we are increasing  or decresing x value
	//if you are increase or decrease vertical slider on that case we are using Y axis 
	 WebElement min_slider=driver.findElement(By.xpath("//div[@class='price-range-block']//span[1]"));
	 //getLocation()------> it will returns the both x and y  axis values
	System.out.println("location of min slider before moving:" +min_slider.getLocation()); //(59,250)=(x,y)
	
	//if you need to increase x or y axis then use dragAndDropBy()... it will accept three parameters
	//1 webElement 2. X axis 3.Y axis
	act.dragAndDropBy(min_slider, 200, 232).perform();
	System.out.println("location of min slider after moving:" +min_slider.getLocation());   //(159,250)
	
	//max slider
	 WebElement max_slider=driver.findElement(By.xpath("//span[2]"));
	 System.out.println("location of max slider before moving:" +max_slider.getLocation());
	 act.dragAndDropBy(max_slider, -100, 232).perform();
	System.out.println("location of min slider after moving:" +max_slider.getLocation());
	 
	 
	 
	
	
	
	}
	

}
