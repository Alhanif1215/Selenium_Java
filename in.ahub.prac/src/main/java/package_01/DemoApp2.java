package package_01;
import java.util.List;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoApp2{

	public static void main(String[] args) throws InterruptedException  {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoapps.qspiders.com/ui?scenario=1");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//section[text()='Check Box']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[text()='Selected']")).click();
		Thread.sleep(1000);
		List<WebElement> ele = driver.findElements(By.xpath("//input[@type='checkbox']"));
		for(int i=0; i< ele.size(); i++) {
			if(ele.get(i).isSelected()) {
				System.out.println();
				Thread.sleep(1000);
			}
			else 
			{
				ele.get(i).click();
				Thread.sleep(1000);
			}
		}
		
	}

}
