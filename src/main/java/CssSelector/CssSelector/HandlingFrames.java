package CssSelector.CssSelector;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingFrames {
	
	public static void main(String args[]) throws InterruptedException
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://ui.vision/demo/webtest/frames/");
		driver.manage().window().maximize();
		
		//frame1
		WebElement frame1=driver.findElement(By.xpath("//frame[@src='frame_1.html']"));
		
		
		driver.switchTo().frame(frame1); //passed frame as webelement //switch to frame1
		
		//here x path is not working to find the elements in frames you get an exception
		driver.findElement(By.xpath("//input[@name='mytext1']")).sendKeys("welcome");
		
		//go to back page
		driver.switchTo().defaultContent(); //driver conn't go to frame 1 to frmae2..... first exit from frame1 move to original content and then entered into frame2
		
		
		//frame2
		WebElement frame2=driver.findElement(By.xpath("//frame[@src='frame_2.html']"));
		driver.switchTo().frame(frame2);
		
		driver.findElement(By.xpath("//input[@name='mytext2']")).sendKeys("selenium");
		
		
		//go to back page
		driver.switchTo().defaultContent();
		
		
		//frame3
		WebElement frame3=driver.findElement(By.xpath("//frame[@src='frame_3.html']"));
		driver.switchTo().frame(frame3);
		
		driver.findElement(By.xpath("//input[@name='mytext3']")).sendKeys("java");
		
		//inner iframe
		//first we need to go to outer frame first and switch to inner frame and then interact with elements
		//after interact with elements then we need tio go main page use driver.switchTo().defaultContent();
		//if we have only single frame in page on that time index is preferred to use  ex) driver.switchTo().frame(0).... but if we have multiple frames in webpage on that time we dont preffered to index because multiple frames having multiple indexes 
		//if id and name is available on that case we preferred to use driver.switchTo().frame(name) and driver.switchTo().frame(id)
		
		//in inside frame 3 there is only one iframe that'y we are using index here
		driver.switchTo().frame(0);  //switching to frame using index
		
		WebElement rdbutton=driver.findElement(By.xpath("//div[@class='aDTYNe snByac OvPDhc OIC90c']"));
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("argumenets[0].click();", rdbutton);
		
		
		
		
		
		
	}

}
