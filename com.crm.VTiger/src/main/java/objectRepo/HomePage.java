package objectRepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import genericUtility.SeleniumUtility;

public class HomePage {

	@FindBy(xpath = "//span[@class='app-icon fa fa-bars']")
	private WebElement hamburgerMenu;
	
	@FindBy(xpath = "//span[text()=' MARKETING']")
	private WebElement marketingMenu;
	
	@FindBy(xpath = "//a[@title='Leads']")
	private WebElement leadsMenu;
	
	@FindBy(xpath = "(//i[@class='vicon-contacts'])[2]")
	private WebElement contactMenu;
	
	@FindBy(xpath = "//span[@title='Hanif Makakmayum(admin)']")
	private WebElement accountsIcon;
	
	@FindBy(xpath = "//a[@id='menubar_item_right_LBL_SIGN_OUT']")
	private WebElement signOutOption;
	
	
	public HomePage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}


	public WebElement getHamburgerMenu() {
		return hamburgerMenu;
	}
	
	public WebElement getMarketingMenu() {
		return marketingMenu;
	}

	
	public WebElement getLeadsMenu() {
		return leadsMenu;
	}


	public WebElement getContactMenu() {
		return contactMenu;
	}


	public WebElement getAccountsIcon() {
		return accountsIcon;
	}


	public WebElement getSignOutOption() {
		return signOutOption;
	}
	
	/**
	 * This is a business library to click on Hamburger Menu
	 */
	public void clickOnHamburgerMenu()
	{
		getHamburgerMenu().click();
	}
	
	/**
	 * This is a business library to hover on Marketing Menu
	 */
	public void mouseHoverOnMarketingMenu(WebDriver driver)
	{
		SeleniumUtility sUtil = new SeleniumUtility();
		sUtil.mouseHoveringAction(driver, getMarketingMenu());
	}
	
	
	/**
	 * This is a business library to click on Leads menu
	 */
	public void clickOnLeadsMenu()
	{
		getLeadsMenu().click();
	}
	
	/**
	 * This is a business library to click on contact menu
	 */
	public void clickOnContactMenu()
	{
		getContactMenu().click();
	}
	
	public void clickOnAccounIcon(WebDriver driver)
	{
		getAccountsIcon().click();
	}
	
	public void signOutOperation(WebDriver driver)
	{
		getSignOutOption().click();
	}
}
