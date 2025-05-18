package CssSelector.CssSelector;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class SslHandling {
	public static void main(String args[])
	{
		ChromeOptions options=new ChromeOptions();
		options.setAcceptInsecureCerts(true);    //accepts ssl certification  (by default it will be false  that'y we are passing true)
		

		WebDriver driver=new ChromeDriver(options);
		driver.get("https://expired.badssl.com/");
		System.out.println("title of the page:"+driver.getTitle());
	}
	

}
