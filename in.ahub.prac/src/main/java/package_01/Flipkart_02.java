package package_01;

import java.util.List;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

public class Flipkart_02{

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
		List<WebElement> price = driver.findElements(By.xpath("//div[@class='KzDlHZ']/../following-sibling::div/"
				+ "/div[@class='Nx9bqj _4b5DiR']"));
		for(int i=0; i<phones.size(); i++) {
			//String name= phones.get(i).getText();
			//String mrp= price.get(i).getText();
			System.out.println(phones.get(i).getText()+" ---> "+price.get(i).getText());
			//Thread.sleep(100);
		}
		driver.quit();
	}
}
