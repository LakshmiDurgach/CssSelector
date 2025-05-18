package CssSelector.CssSelector;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class RunTestsInIncognito {
	public static void main(String args[])
	{
	ChromeOptions options=new ChromeOptions();
	options.addArguments("--incognito");
	
	
	WebDriver driver=new ChromeDriver(options);
	
	driver.get("https://testautomationpractice.blogspot.com/");
	System.out.println(driver.getTitle());
}

}


