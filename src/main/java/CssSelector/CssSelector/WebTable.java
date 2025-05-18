package CssSelector.CssSelector;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTable {
	public static void main(String args[])
	{
	WebDriver driver=new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	
	driver.get("https://testautomationpractice.blogspot.com/");
	driver.manage().window().maximize();
	
	//1)find number of rows in table
	 int rows=driver.findElements(By.xpath("//table[@name='BookTable']//tr")).size();
	 System.out.println("Number of rows:" +rows);   //7
	 
	 //2)find number of columns in table
	 int columns=driver.findElements(By.xpath("//table[@name='BookTable']//th")).size();
	 System.out.println("Number of rows:" +columns);    //4
	 
	 //3)read data from specific row and column( ex. 5th row and 1 st column)
	  String bookname=driver.findElement(By.xpath("//table[@name='BookTable']//tr[5]/td[1]")).getText();
	  System.out.println("Bookname:" +bookname);
	  
	  //4)read all data from rows and columns .... outer for loop is used for rows and inner loop is used for columns
	  //if you pass parameters dynamically on that case use +attributename+   ex:"+i+"
	  /*for(int i=2;i<rows;i++)
	  {
		  for(int j=1;j<=columns;j++)
		  {
			  String value=driver.findElement(By.xpath("//table[@name='BookTable']//tr["+i+"]/td["+j+"]")).getText();
			  System.out.println(value+"\t");
			  
		  }
		  System.out.println();
	  } */
	  
	  
	  //5) print book names whose author is mukesh
	  for(int i=2;i<=rows;i++)
	  {
		  String authorname=driver.findElement(By.xpath("//table[@name='BookTable']//tr["+i+"]/td[2]")).getText();
		  if(authorname.equals("mukesh"))
		  {
			  String bookName=driver.findElement(By.xpath("//table[@name='BookTable']//tr["+i+"]/td[1]")).getText();
			  System.out.println(bookname+"/t"+authorname);
		  }
		  
		  
	  }
	  
	  
	 
	 

	}

}
