package package_01;

import java.util.List;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

public class Flipkart_iPhone16 {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com");
		driver.findElement(By.xpath("//input[@class='Pke_EE']")).sendKeys("iPhone 16",Keys.ENTER);
		WebElement ele = driver.findElement(By.xpath("//span[contains(text(),'Showing')]"));
		if(ele.isDisplayed())
			System.out.println("Product ListPage is Displayed");
		else 
			System.out.println("Product not displayed");
		List<WebElement> list = driver.findElements(By.xpath("//div[contains(text(),'Apple iPhone 16')]"));
		for(WebElement i:list)
			System.out.println(i.getText());
		driver.quit();
	}

}
