package package_01;

import java.util.List;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

public class Flipkart_03{

	public static void main(String[] args) throws Exception {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		//Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@class='Pke_EE']")).sendKeys("iPhone 16", Keys.ENTER);
		driver.findElement(By.xpath("//div[text()='Price -- High to Low']")).click();
		//Thread.sleep(2000);
		((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		//Thread.sleep(2500);
		List<WebElement> phones = driver.findElements(By.xpath("//div[@class='KzDlHZ']"));
		//Thread.sleep(700);
		List<WebElement> price = driver.findElements(By.xpath("//div[@class='KzDlHZ']/../following-sibling::div/"
				+ "/div[@class='Nx9bqj _4b5DiR']"));
		//Thread.sleep(700);
		List<WebElement> mrps = driver.findElements(By.xpath("//div[@class='yRaY8j ZYYwLA']"));
		//Thread.sleep(700);
		List<WebElement> per = driver.findElements(By.xpath("//div[@class='yRaY8j ZYYwLA']/../div/span"));
		for(int i=0; i<phones.size(); i++) {
			String name= phones.get(i).getText();
			//Thread.sleep(600);
			String sl= price.get(i).getText();
			//Thread.sleep(600);
			String mrp=mrps.get(i).getText();
			//Thread.sleep(600);
			String off=per.get(i).getText();
			
			System.out.print("\n \u001B[33m \u001B[1m"+name+"\u001B[0m");
			Thread.sleep(70);
			System.out.print(" |--> MRP:\u001B[95m"+mrp+"\u001B[0m");
			Thread.sleep(70);
			System.out.print(" |--> \u001B[36m"+off+"\u001B[0m");
			Thread.sleep(70);
			System.out.println(" |--> \u001B[32m Discounted Price: \u001B[4m\u001B[1m"+sl+"\u001B[0m");
			Thread.sleep(300);
		}
		driver.quit();
	}
}
