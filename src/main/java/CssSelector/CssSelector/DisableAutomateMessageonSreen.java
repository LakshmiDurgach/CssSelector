package CssSelector.CssSelector;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class DisableAutomateMessageonSreen {
	public static void main(String args[])
	{
	ChromeOptions options=new ChromeOptions();
	options.setExperimentalOption("excludeSwitches", new String[] {"enable-automation"});  //setting of headless mode of execution
	
	WebDriver driver=new ChromeDriver(options);
	
	driver.get("https://testautomationpractice.blogspot.com/");
	System.out.println(driver.getTitle());
}

}
