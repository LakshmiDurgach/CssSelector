package CssSelector.CssSelector;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseDragAndDrop {
	public static void main(String args[]) throws InterruptedException
	{
	WebDriver driver=new ChromeDriver();
	driver.get("http://dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");
	driver.manage().window().maximize();
	
	//Drag and drop...... rome element moves to italy
	Actions act=new Actions(driver);
	
	//find the source and target elements romeo and italy
	WebElement rome=driver.findElement(By.xpath("//div[@id='box6']"));
	WebElement italy=driver.findElement(By.xpath("//div[@id='box106']"));
	
	act.dragAndDrop(rome,  italy).perform();
	}
	

}
