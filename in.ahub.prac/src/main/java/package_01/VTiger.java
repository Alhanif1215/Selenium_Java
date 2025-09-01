package package_01;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class VTiger {

	public static void main(String[] args) {
		
		
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("http://localhost/");
		driver.findElement(By.id("username")).sendKeys("admin");
		driver.findElement(By.id("password")).sendKeys("admin@ahub");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		driver.findElement(By.xpath("//span[@class='app-icon fa fa-bars']")).click();
		WebElement marketing = driver.findElement(By.xpath("//span[text()=' MARKETING']"));
		Actions a = new Actions(driver);
		a.moveToElement(marketing).perform();
		driver.findElement(By.xpath("//a[@title='Leads']")).click();
		
	}
}
