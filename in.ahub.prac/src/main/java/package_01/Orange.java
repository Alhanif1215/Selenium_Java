package package_01;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

public class Orange{

	public static void main(String[] args) throws Exception {
		
		String str ="Dashboard";
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@class='orangehrm-login-slot']/div[@class='orangehrm-login-form']/form/div[@class='oxd-form-row'][1]/div/div/following-sibling::div/input")).sendKeys("Admin");
		driver.findElement(By.xpath("//div[@class='orangehrm-login-slot']/div[@class='orangehrm-login-form']/form/div/following-sibling::div[@class='oxd-form-row']/div/div/input")).sendKeys("admin123",Keys.ENTER);
		Thread.sleep(3000);
		WebElement ele = driver.findElement(By.xpath("//div[@class='oxd-topbar-header-title']/span/h6[text()='Dashboard']"));
		
		if(ele.getText().contains(str))
		   System.out.println("Dashboard Page is Displayed");
		else System.out.println("Dashboard Page is  not Displayed");
		
		driver.findElement(By.xpath("//ul[@class='oxd-main-menu']/li[1]/a")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@class='oxd-table-filter-header']/following-sibling::div/form/div[@class='oxd-form-row']/div/div[1]/div/div[2]/input")).sendKeys("Admin");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@class='oxd-table-filter-header']/following-sibling::div/form/div[@class='oxd-form-row']/div/div[3]/div/div[2]/div/div/input")).sendKeys("Ranga  Akunuri");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@class='oxd-table-filter-header']/following-sibling::div/form/div/button[@type='submit']")).submit();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[@class='oxd-userdropdown-tab']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[text()='Logout']")).click();
		Thread.sleep(3000);
		driver.quit();
	}	
}
