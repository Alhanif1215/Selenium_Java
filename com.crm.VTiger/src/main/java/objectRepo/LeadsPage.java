package objectRepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LeadsPage {

	@FindBy(xpath = "//button[@id='Leads_listView_basicAction_LBL_ADD_RECORD']")
	private WebElement createNewLeadIcon;
	
	public LeadsPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public WebElement getCreateNewLeadIcon()
	{
		return createNewLeadIcon;
	}
	
	
	/**
	 * This is a business library to click on create new lead icon
	 */
	public void clickOnCreateNewLeadIcon()
	{
		getCreateNewLeadIcon().click();
	}
}
