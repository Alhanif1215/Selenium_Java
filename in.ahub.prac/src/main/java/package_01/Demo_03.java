package package_01;


import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo_03{

	public static void main(String[] args) throws Exception {
		
		String str = "Enter your Name";
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoapps.qspiders.com/ui?scenario=1");
		Thread.sleep(1500);
		driver.findElement(By.xpath("//li[text()='With ToolTip']")).click();
		
		Thread.sleep(1500);
		WebElement name = driver.findElement(By.id("name"));
		String nameval=name.getAttribute("title");
		if(nameval.contains(str))
		System.out.println("Tool tips is Displayed: " + nameval);
		else System.out.println("Tool tips is not Displayed");
		
		Thread.sleep(1500);
		WebElement email = driver.findElement(By.id("email"));
		String emailval=email.getAttribute("title");
		System.out.println("Tool tips is Displayed: " + emailval);
		
		Thread.sleep(1500);
		WebElement password = driver.findElement(By.id("password"));
		String passwordval=password.getAttribute("title");
		System.out.println("Tool tips is Displayed: " + passwordval);
		driver.quit();
		
	}

}
