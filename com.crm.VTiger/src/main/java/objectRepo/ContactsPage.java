package objectRepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ContactsPage {

	@FindBy(xpath = "//button[@id='Contacts_listView_basicAction_LBL_ADD_RECORD']")
	private WebElement creatingNewContactIcon;
	
	public ContactsPage(WebDriver driver)
	{
		PageFactory.initElements(driver,  this);
	}

	public WebElement getCreatingNewContactIcon() {
		return creatingNewContactIcon;
	}
	
	public void clickOnCreatingNewContactIcon()
	{
		getCreatingNewContactIcon().click();
	}
}
