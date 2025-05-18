package CssSelector.CssSelector;

import java.io.File;
import java.time.Duration;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CaptureScreenshot {
	public static void main(String args[])
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://demo.nopcommerce.com/");
	    driver.manage().window().maximize();
	    
	    //1)full page screenshot
	    
	    //System.getProperty---->returns the current project location
	    /*TakesScreenshot ts=(TakesScreenshot)driver;    //------->type casting.... instead of using webDriver use ChromeDriver on that case typecasting is not required... 
	    File sourcefile=ts.getScreenshotAs(OutputType.FILE);
	    File targetfile=new File(System.getProperty("user.dir")+"\\screenshots\\fullpage.png");
	    
	    sourcefile.renameTo(targetfile); */   //copy source file to target file
	    
	    //2)capture screenshot of specific section...... featured box
	     /*WebElement featerdProducts=driver.findElement(By.xpath("//div[@class='product-grid home-page-product-grid']"));
	     File sourcefile=featerdProducts.getScreenshotAs(OutputType.FILE);
	     File targetfile=new File(System.getProperty("user.dir")+"\\screenshots\\featerdProducts.png");
	     sourcefile.renameTo(targetfile);   */      //copy source file to target file
	    
	    //3)capture the screenshot of webelement
	     WebElement logo=driver.findElement(By.xpath("//img[@alt='nopCommerce demo store']"));
	     
	     File sourcefile=logo.getScreenshotAs(OutputType.FILE);
	     File targetfile=new File(System.getProperty("user.dir")+"\\screenshots\\logo.png");
	     sourcefile.renameTo(targetfile);              //copy source file to target file1
	     
	     
	    
	     
	    
	    
	}
	

}
