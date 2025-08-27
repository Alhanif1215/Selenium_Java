package objectRepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import genericUtility.SeleniumUtility;

public class HomePage {

	
	@FindBy(xpath = "")
	private WebElement leadsMenu;
	
	@FindBy(xpath = "")
	private WebElement contactMenu;
	
	@FindBy(xpath = "")
	private WebElement accountsIcon;
	
	@FindBy(xpath = "")
	private WebElement signOutOption;
	
	
	public HomePage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
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
	
	public void signOutOperation(WebDriver driver)
	{
		SeleniumUtility sUtil = new SeleniumUtility();
		sUtil.mouseHoveringAction(driver, getAccountsIcon());
		getSignOutOption().click();
	}
}
