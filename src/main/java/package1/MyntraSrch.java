package package1;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.*;
public class MyntraSrch {

	public static void main(String[] args) {
		String exp="watch";
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.myntra.com");
		driver.findElement(By.className("desktop-searchBar")).sendKeys("watch");
		driver.findElement(By.className("desktop-submit")).click();
		String act=driver.getTitle();
		
		if(act.toLowerCase().contains(exp.toLowerCase())) {
			System.out.println("Product list page displayed");
		}else System.out.println("Not Displayed");
     driver.quit();
     
	}

}
