package package_01;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoApp{

	public static void main(String[] args) throws Exception {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoapps.qspiders.com/ui?scenario=1");
		Thread.sleep(1500);
		driver.findElement(By.xpath("//section[text()='Button']")).click();
		Thread.sleep(1500);
		driver.findElement(By.xpath("//button[text()='Yes']")).click();
		Thread.sleep(1500);
		WebElement ele = driver.findElement(By.xpath("//span[contains(text(),'You selected')]"));
		if(ele.isDisplayed())
			System.out.println("Message is Displayed");
		else 
			System.out.println("Message not displayed");
		}

}
