package package1;

import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

import org.openqa.selenium.*;
public class DemoApps {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://demoapps.qspiders.com/ui?scenario=1");
		List<WebElement> ele = driver.findElements(By.tagName("input"));
		for(WebElement e:ele) {
			System.out.println(e.getText());
		}
     driver.quit();
     
	}

}
