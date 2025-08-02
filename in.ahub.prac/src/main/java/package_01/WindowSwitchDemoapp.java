package package_01;

import java.io.File;
import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class WindowSwitchDemoapp {

	public static void main(String[] args) throws Exception {
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.manage().window().maximize();
		driver.get("https://demoapps.qspiders.com/ui?scenario=1");
		driver.findElement(By.xpath("//section[text()='Popups']")).click();
		driver.findElement(By.xpath("//section[text()='Browser Windows']")).click();
		driver.findElement(By.xpath("//a[text()='New Tab']")).click();
		Thread.sleep(1800);
		driver.findElement(By.xpath("//h2[text()='Laptop']/../button")).click();
		String parentId= driver.getWindowHandle();
		Set<String> windowHandles = driver.getWindowHandles();
		Iterator<String> tr=  windowHandles.iterator();
		while(tr.hasNext()) {
			String id=tr.next();
			if(!id.equals(parentId)) {
				driver.switchTo().window(id);
			}
		}
		driver.findElement(By.xpath("//button[text()='Add to Cart']")).click();
		
		TakesScreenshot s=(TakesScreenshot)driver;
		File src= s.getScreenshotAs(OutputType.FILE);
		File des= new File("/media/ahub/9f6e90fe-dd38-4c6f-8e80-5e926fab903e/Screenshot/LaptopPage.png");
		Files.copy(src, des);

		WebElement price = driver.findElement(By.xpath("//p[@class='text-gray-800 font-semibold text-lg mb-3']"));
		String text = price.getText();
		System.out.println("Price of Laptop is - "+text);
		
		driver.close();
		
		Thread.sleep(2300);
		
		driver.quit();
	}
}
