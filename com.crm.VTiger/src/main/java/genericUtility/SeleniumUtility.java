package genericUtility;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

/**
 * THis is the Utility class having the functionality from Selenium library 
 */
public class SeleniumUtility {

	/**
	 * This is generic method to open web application
	 * @param driver
	 * @param url
	 */
	public void getApplication(WebDriver driver, String url)
	{
		driver.get(url);
	}

	/**
	 * This is generic method to maximize the window
	 * @param driver
	 */
	public void mazimizeWindow(WebDriver driver)
	{
		driver.manage().window().maximize();
	}
	
	/**
	 * This is generic method to provide implicit wait
	 * @param driver
	 * @param maxTime
	 */
	public void implicitWait(WebDriver driver, int maxTime)
	{
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(maxTime));
	}
	
	
	/** ------------ Handling Drop-Down -------------------**/
	/**
	 * This is generic method to select an option in a drop-down by using index
	 * @param element
	 * @param index
	 */
	public void selectOptionByIndex(WebElement element, int index)
	{
		Select s = new Select(element);
		s.selectByIndex(index);
	}
	
	/**
	 * This is generic method to select an option in a drop-down by using value attribute
	 * @param element
	 * @param value
	 */
	public void selectOptionByValue(WebElement element, String value)
	{
		Select s = new Select(element);
		s.selectByValue(value);
	}
	
	/**
	 * This is generic method to select an option in a drop-down by using visible text
	 * @param element
	 * @param visibleText
	 */
	public void selectOptionByVisibleText(WebElement element, String visibleText)
	{
		Select s = new Select(element);
		s.selectByVisibleText(visibleText);
	}
	
	
	
	/** ---------------- Handling Alert ------------------------**/

	/**
	 * This is generic method to accept an alert
	 * @param driver
	 */
	public void acceptAlert(WebDriver driver)
	{
		driver.switchTo().alert().accept();
	}
	
	
	/**
	 * This is generic method to cancel an alert
	 * @param driver
	 */
	public void cancelAlert(WebDriver driver)
	{
		driver.switchTo().alert().dismiss();
	}
	
	/** ----------------- Mouse Actions -------------------------**/

	/**
	 * This is generic method to perform mouse hovering action
	 * @param driver
	 * @param element
	 */
	public void mouseHoveringAction(WebDriver driver, WebElement element)
	{
		Actions a = new Actions(driver);
		a.moveToElement(element).perform();
	}
	
	/**
	 * This is generic method to perform right click operation
	 * @param driver
	 * @param element
	 */
	public void rightClickOperation(WebDriver driver, WebElement element)
	{
		Actions a = new Actions(driver);
		a.contextClick(element).perform();
	}
	
	/**
	 * This is generic method to perform mouse hovering action
	 * @param driver
	 * @param element
	 */
	public void dragAndDropOperation(WebDriver driver, WebElement element1, WebElement element2)
	{
		Actions a = new Actions(driver);
		a.dragAndDrop(element1, element2).perform();
	}
	
	/** -------------- Explicit Wait ---------------------**/

	/**
	 * This is generic method to wait explicitly for a WebElement to be visible 
	 * @param driver
	 * @param maxTime
	 * @param locator
	 */
	public void waitForElementToBeVisible(WebDriver driver, int maxTime, By locator)
	{
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(maxTime));
		wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
	}
	
	/** ------------ Window scrolling using JavaScript -------------------**/

	public void scrollingWindow(WebDriver driver, int x, int y)
	{
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("window.scrollTo("+x+","+y+");");
	}
	
	public void pressDownNEnterx2() throws AWTException, InterruptedException
	{
		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(1000);
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);

	}
}
