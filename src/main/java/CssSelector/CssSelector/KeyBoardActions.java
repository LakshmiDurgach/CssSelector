package CssSelector.CssSelector;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class KeyBoardActions {
	public static void main(String args[]) throws InterruptedException
	{
	WebDriver driver=new ChromeDriver();
	driver.get("https://text-compare.com/");
	
	driver.findElement(By.xpath("//textarea[@id='inputText1']")).sendKeys("welcome");
	Actions act=new Actions(driver);
	
	//ctrl+A-------> (select the text)------> press the ctrl key by holding it  then press A... after pressing A then release the ctrl key
	// here keyDown is for pressing the key and keyUp is the releasing the key
	act.keyDown(Keys.CONTROL).sendKeys("A").keyUp(Keys.CONTROL).perform();
	
	//ctrl+C
	act.keyDown(Keys.CONTROL).sendKeys("C").keyUp(Keys.CONTROL).perform();
	
	//TAB -Shift to 2nd box
	act.keyDown(Keys.TAB).keyUp(Keys.TAB).perform();
	
	//ctrl+V  paste the text
	act.keyDown(Keys.CONTROL).sendKeys("V").keyUp(Keys.CONTROL).perform();
	
	
	
	
	}
	

}

