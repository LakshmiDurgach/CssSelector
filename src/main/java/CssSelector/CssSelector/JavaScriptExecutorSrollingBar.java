package CssSelector.CssSelector;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScriptExecutorSrollingBar {
	public static void main(String args[])
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.nopcommerce.com/");
	    driver.manage().window().maximize();
	    
	    JavascriptExecutor js=(JavascriptExecutor)driver;
	    
	    //1) scroll down page by pixel number
	    //js.executeScript("window.scrollBy(0,300)","");
	    //System.out.println(js.executeScript("return window.pageYOffset;"));
	    
	    //2)scroll the page till element is visible
	    //WebElement ele=driver.findElement(By.xpath("//strong[normalize-space()='Community poll']"));
	    //js.executeScript("arguments[0].scrollIntoView();", ele);
	    //System.out.println(js.executeScript("return window.pageYOffset;"));
	    
	    
	    //3)scroll the page till end of the page
	    js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
	    System.out.println(js.executeScript("return window.pageYOffset;"));
	    
	    
	    
	    
	    
	}
	
	

}
