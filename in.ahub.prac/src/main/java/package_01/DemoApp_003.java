package package_01;


import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoApp_003{

	public static void main(String[] args) throws Exception {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoapps.qspiders.com/ui?scenario=1");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//section[text()='Radio Button']")).click();
		Thread.sleep(1500);
		driver.findElement(By.xpath("//a[text()='Disabled']")).click();
		Thread.sleep(1500);
		WebElement ele = driver.findElement(By.xpath("//input[@value='Upi']"));
		Thread.sleep(1500);
		if(ele.isEnabled())
			System.out.println("Is Enabled");
		else System.out.println("Is Disabled");
		
		driver.quit();
	}

}