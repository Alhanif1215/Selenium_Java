package package_01;

import java.util.List;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoApp_1{

	public static void main(String[] args) throws Exception {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoapps.qspiders.com/ui?scenario=1");
		Thread.sleep(2500);
		WebElement ele = driver.findElement(By.xpath("//h1[text()='Register']"));
		Thread.sleep(1500);
		if(ele.isDisplayed())
			System.out.println("Registration Page is Displayed");
		Thread.sleep(1500);
		
		List<WebElement> elem = driver.findElements(By.xpath("//input[contains(@placeholder,'Enter')]"));
		for(WebElement i:elem) {
			Thread.sleep(1500);
			System.out.println(i.getAttribute("placeholder"));
			Thread.sleep(1500);
		}
		driver.quit();
	}
}
