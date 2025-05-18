package CssSelector.CssSelector;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DatePickersCalender {
	public static void main(String args[])
	{
	WebDriver driver=new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	driver.get("https://jqueryui.com/datepicker/");
	driver.manage().window().maximize();
	
	//switch to frame
	// in the webpage only contain one frame that'y we are using index here 
	driver.switchTo().frame(0);
	
	//method1: using sendKeys()
	//driver.findElement(By.xpath("//input[@id='datepicker']")).sendKeys("09/12/2024");   //mm/yy//yyyy
	
	//method2: using date picker 
	//everything in webpage is a string
	
	//note: in webpage we handle multiple dates on that case we are creating one method and placing the month and year selecting  code inside the method  after calling the method when ever you want.
	//static void selectMonthAndYear(webDriver driver,String month,String year)
	//static void selectDate(webDriver driver,String date)
	
	String year="2025";
	String month="May";
	String date="20";
	
	driver.findElement(By.xpath("//input[@id='datepicker']")).click();  //opens the date picker
	
	//select month& year
	while(true)
	{
		String currentMonth=driver.findElement(By.xpath("//span[@class='ui-datepicker-month']")).getText();  //actual month
		String currentYear=driver.findElement(By.xpath("//span[@class='ui-datepicker-year']")).getText();   //actual year
		
		if(currentMonth.equals(month) && currentYear.equals(year))   //if current month and expected month is same then break the loop
		{
			break;   //here if the cureent month and expected month is same on that situation  than break the loop otherwise click the next month button 
		}
		driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-circle-triangle-e']")).click();  //next month click button
		//driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-circle-triangle-w']")).click();   // previous month click button
	}
	
	//select the date
	
	 List<WebElement>allDates=driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']//tbody//tr/td//a"));
	 
	 for(WebElement dt:allDates)
	 {
		 if(dt.getText().equals(date))
		 {
			 dt.click();
			 break;
		 }
	 }
	 
	 
	}
}
	
	
	
	
	
	
	
	



	
	



