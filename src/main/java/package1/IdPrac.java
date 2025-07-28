package package1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class IdPrac {

	public static void main(String[] args) throws Exception {
		WebDriver driver=new ChromeDriver();
		Runnable[] ac = new Runnable[] {
		()-> driver.manage().window().maximize(),
		()-> driver.get("https://demoapps.qspiders.com/ui?scenario=1"),
		()-> driver.findElement(By.id("name")).sendKeys("Hanif"),
		()-> driver.findElement(By.id("email")).sendKeys("hanif@gmail.com"),
		()-> driver.findElement(By.id("password")).sendKeys("Password@123"),
		()-> driver.findElement(By.xpath("//button[@type='submit']")).click()

		};
		
		for(Runnable act:ac) {
			act.run();
			Thread.sleep(1500);
		}

		
		driver.quit();

	}

}
