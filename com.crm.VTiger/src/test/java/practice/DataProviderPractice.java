package practice;

import java.time.Duration;
import java.util.HashMap;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderPractice {

	@Test(dataProvider = "data")
	public void demo(HashMap<String, String> m)
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get(m.get("url"));
		driver.findElement(By.id("username")).sendKeys(m.get("username"));
		driver.findElement(By.id("password")).sendKeys(m.get("password"));
		driver.findElement(By.xpath("//button[@type='submit']")).click();
	}
	
	@DataProvider(name = "data")
	public Object[][] getData(){
		HashMap<String, String> m1 = new HashMap<String, String>();
		m1.put("username", "admin");
		m1.put("password", "admin@ahub");
		m1.put("url", "http://localhost/");
		
		HashMap<String, String> m2 = new HashMap<String, String>();
		m2.put("username", "admin123");
		m2.put("password", "admin123");
		m2.put("url", "http://localhost:8080/");
		
		Object[][] obj = {{m1},{m2}};
		return obj;
	}
}
