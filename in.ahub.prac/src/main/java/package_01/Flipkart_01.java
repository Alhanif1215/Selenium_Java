package package_01;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

public class Flipkart_01{

	public static void main(String[] args) throws Exception {
		
	
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@class='Pke_EE']")).sendKeys("iPhone 16", Keys.ENTER);
		WebElement ele = driver.findElement(By.xpath("//span[contains(text(),'Showing')]"));
		if(ele.isDisplayed())
			System.out.println("Product list page is displayed");
		else System.out.println("Product list page is not displayed");
		WebElement phone = driver.findElement(By.xpath("//div[text()='Apple iPhone 16 (Black, 128 GB)']"));
		WebElement price = driver.findElement(By.xpath("//div[text()='Apple iPhone 16 (Black, 128 GB)']/"
				+ "../following-sibling::div/div/div/"
				+ "    div[@class='Nx9bqj _4b5DiR']"));
		//div[text()='Apple iPhone 16 (Black, 128 GB)']/../following-sibling::div//div[@class='Nx9bqj _4b5DiR']
		System.out.println("\n"+phone.getText()+"  ------>  "+price.getText());
		driver.quit();
	}

}
