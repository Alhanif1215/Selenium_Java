package genericUtility;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

import objectRepo.HomePage;
import objectRepo.LoginPage;

public class BaseClass {

	public SeleniumUtility sUtil = new SeleniumUtility();
	public PropertiesUtility pUtil = new PropertiesUtility();
	public ExcelUtility eUtil = new ExcelUtility();
	public WebDriver driver;

	
	@BeforeSuite
	public void dbConnection()
	{
		System.out.println("DataBase connected");
	}
	
	@BeforeClass
	public void launchBrowser() throws IOException
	{
		ChromeOptions opt = new ChromeOptions(); 
//		opt.addArguments("--headless=new");
//		opt.addArguments("--disabled-gpu");
		opt.addArguments("--incognito");
		driver = new ChromeDriver(opt);
		sUtil.mazimizeWindow(driver);
		sUtil.implicitWait(driver, 10);
		String URL = pUtil.getDataFromPropertiesFile("url");
		sUtil.getApplication(driver, URL);
		System.out.println("Browser launch successfully");
	}
	
	@BeforeMethod
	public void logiinOperation() throws IOException
	{
		LoginPage lop = new LoginPage(driver);
		String UN = pUtil.getDataFromPropertiesFile("username");
		String PWD = pUtil.getDataFromPropertiesFile("password");
		lop.loginToApplication(UN, PWD);
		System.out.println("Login done successfully");
	}
	
	@AfterMethod
	public void logoutOperation()
	{
		HomePage hp = new HomePage(driver);	
		hp.clickOnAccounIcon(driver);
		hp.signOutOperation(driver);
		System.out.println("Logout done successfully");
	}
	
	@AfterClass
	public void closeBrowser()
	{
	   driver.quit();
	   System.out.println("Browser close successfully");
	}
	
	@AfterSuite
	public void disconnectDB()
	{
		System.out.println("DataBase Disconnected");
	}
	
}
