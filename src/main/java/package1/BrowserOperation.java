package package1;


import java.time.Duration;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BrowserOperation {

	public static void main(String[] args) throws Exception {
		
		WebDriverManager.chromedriver().setup();
			WebDriver driver= new ChromeDriver();
			driver.get("https://www.facebook.com");
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
			driver.manage().window().maximize();
			Thread.sleep(2000);
			driver.manage().window().minimize();
			Thread.sleep(2000);
			driver.manage().window().maximize();
			Thread.sleep(2000);
			driver.manage().window().setSize(new Dimension(400,600));
			Thread.sleep(2000);
			driver.manage().window().setPosition(new Point(200,300));
			
	}

}
