package package1;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClassNamePrac {

	public static void main(String[] args) throws Exception {
		
		String str="iPhone 16";
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com");
		WebElement sear = driver.findElement(By.className("Pke_EE"));
		sear.sendKeys("iPhone 16");
		sear.submit();
		//driver.findElement(By.className("Pke_EE")).sendKeys("iPhone 16"+Keys.ENTER);
		//driver.findElement(By.className("Pke_EE")).sendKeys("iPhone 16",Keys.ENTER);

    String actualTitle = driver.getTitle();
    
	if(actualTitle.toLowerCase().contains(str.toLowerCase())) {
		System.out.println(actualTitle+" :Product list page is displayed");
	}else System.out.println("Product list page not Displayed");
	
	driver.quit();
}
}
