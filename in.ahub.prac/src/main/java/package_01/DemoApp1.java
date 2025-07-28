package package_01;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoApp1{

	public static void main(String[] args) throws InterruptedException  {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoapps.qspiders.com/ui?scenario=1");
		Thread.sleep(2000);
		WebElement ele = driver.findElement(By.xpath("//h1[text()='Register']/.."));				
		String reg=ele.getCssValue("front");
		System.out.println(reg);
		System.out.println(ele.getCssValue("bg-color"));
		driver.quit();
	
	}
}
