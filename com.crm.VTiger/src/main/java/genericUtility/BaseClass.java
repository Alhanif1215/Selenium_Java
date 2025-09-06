package genericUtility;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;

import io.github.bonigarcia.wdm.WebDriverManager;
import objectRepo.HomePage;
import objectRepo.LoginPage;

public class BaseClass {

	public SeleniumUtility sUtil = new SeleniumUtility();
	public PropertiesUtility pUtil = new PropertiesUtility();
	public ExcelUtility eUtil = new ExcelUtility();
	public WebDriver driver;
	public static WebDriver sDriver;

	@BeforeSuite(alwaysRun = true)
	public void dbConnection() {
		System.out.println("DataBase connected");
	}

	@Parameters("browser")
	@BeforeClass(alwaysRun = true)
	public void launchBrowser(@Optional("chrome") String browser) throws IOException {
//		ChromeOptions opt = new ChromeOptions(); 
//		opt.addArguments("--headless=new");
//		opt.addArguments("--disabled-gpu");
//		opt.addArguments("--incognito");

		WebDriverManager.chromedriver().setup();
		
		if (browser.equals("chrome"))
			driver = new ChromeDriver();
		else if (browser.equals("firefox")) {
			System.setProperty("webdriver.gecko.driver", "/snap/bin/geckodriver");
			driver = new FirefoxDriver();
		}
		else if (browser.equals("edge"))
			driver = new EdgeDriver();
		else
			driver = new ChromeDriver();
		sDriver = driver;
		
		sUtil.mazimizeWindow(driver);
		sUtil.implicitWait(driver, 10);
		String URL = pUtil.getDataFromPropertiesFile("url");
		sUtil.getApplication(driver, URL);
		System.out.println("Browser launch successfully");
	}

	@BeforeMethod(alwaysRun = true)
	public void logiinOperation() throws IOException {
		LoginPage lop = new LoginPage(driver);
		String UN = pUtil.getDataFromPropertiesFile("username");
		String PWD = pUtil.getDataFromPropertiesFile("password");
		lop.loginToApplication(UN, PWD);
		System.out.println("Login done successfully");
	}

	@AfterMethod(alwaysRun = true)
	public void logoutOperation() {
		HomePage hp = new HomePage(driver);
		hp.clickOnAccounIcon(driver);
		hp.signOutOperation(driver);
		System.out.println("Logout done successfully");
	}

	@AfterClass(alwaysRun = true)
	public void closeBrowser() {
		driver.quit();
		System.out.println("Browser close successfully");
	}

	@AfterSuite(alwaysRun = true)
	public void disconnectDB() {
		System.out.println("DataBase Disconnected");
	}

}
