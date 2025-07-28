package package1;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XPath1 {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://flipkart.com");
		driver.findElement(By.xpath("//input[@name='q']")).sendKeys("iPhone 16",Keys.ENTER);
		driver.findElement(By.xpath("//div[text()='Apple iPhone 16 (Teal, 128 GB)']")).click();
		
		driver.close();

	}

}
