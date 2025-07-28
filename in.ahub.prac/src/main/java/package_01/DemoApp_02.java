package package_01;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoApp_02{

	public static void main(String[] args) throws Exception {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoapps.qspiders.com/ui?scenario=1");
		Thread.sleep(2500);
		driver.findElement(By.xpath("//section[text()='Check Box']")).click();
		Thread.sleep(1500);
		driver.findElement(By.xpath("//a[text()='Selected']")).click();
		Thread.sleep(1500);
		WebElement email = driver.findElement(By.id("domain_a"));
		Thread.sleep(1500);
		WebElement san = driver.findElement(By.id("mode_ab")); 
		Thread.sleep(1500);
		WebElement pro = driver.findElement(By.id("mode_ef"));
		Thread.sleep(2500);
		if(email.isSelected())
			System.out.println("'Email' check box is selected");
		if(san.isSelected())
			System.out.println("'Sandals' check box is selected");
		if(pro.isSelected())
			System.out.println("'Regarding the same product' check box is selected");
		driver.quit();
	}	
}
	
