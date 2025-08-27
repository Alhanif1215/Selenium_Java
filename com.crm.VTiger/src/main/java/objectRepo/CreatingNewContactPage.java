package objectRepo;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CreatingNewContactPage {
	
	@FindBy(name= "firstname")	   
	private WebElement firstNameTextField;
	
	@FindBy(name= "firstname")
	private WebElement lastNameTextField;

	@FindBy(xpath = "//input[@name='company']")
	private WebElement organizationNameTextField;
	
	@FindBy(id = "noOfEmployees")
	private WebElement titleTextField;
	
	@FindBy(id = "noOfEmployees")
	private WebElement departmentTextField;
	
	@FindBy(xpath = "//input[@id='email']")
	private WebElement emailTextField;
	
	@FindBy(xpath = "//input[@id='email']")
	private WebElement mobileTextField;
	
	@FindBy(xpath = "//input[@id='email']")
	private WebElement mailingCityTextField;
	
	@FindBy(xpath = "//input[@id='country']")
	private WebElement mailingCountryTextField;
	
	@FindBy(xpath = "//input[@id='state']")
	private WebElement mailingStateTextField;
	
	@FindBy(xpath = "//input[@title='Save [Alt+S]']")
	private WebElement saveButton;
	
	public CreatingNewContactPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

	public WebElement getFirstNameTextField() {
		return firstNameTextField;
	}

	public WebElement getLastNameTextField() {
		return lastNameTextField;
	}

	public WebElement getOrganizationNameTextField() {
		return organizationNameTextField;
	}

	public WebElement getTitleTextField() {
		return titleTextField;
	}

	public WebElement getDepartmentTextField() {
		return departmentTextField;
	}

	public WebElement getEmailTextField() {
		return emailTextField;
	}

	public WebElement getMobileTextField() {
		return mobileTextField;
	}

	public WebElement getMailingCityTextField() {
		return mailingCityTextField;
	}

	public WebElement getMailingCountryTextField() {
		return mailingCountryTextField;
	}

	public WebElement getMailingStateTextField() {
		return mailingStateTextField;
	}

	public WebElement getSaveButton() {
		return saveButton;
	}
	
	/**
	 * This is business library to create new contact
	 * @param fName
	 * @param lName
	 * @param orgName
	 */
	public void createNewContact(String fName, String lName, String orgName)
	{
		getFirstNameTextField().sendKeys(fName);
		getLastNameTextField().sendKeys(lName);
		getOrganizationNameTextField().sendKeys(orgName);
		getSaveButton().click();
	}
	
	public void createNewContact(String lName, String title, String dept, String email, String mobile)
	{
		getLastNameTextField().sendKeys(lName);
		getTitleTextField().sendKeys(title);
		getDepartmentTextField().sendKeys(dept);
		getEmailTextField().sendKeys(email);
		getMobileTextField().sendKeys(mobile);
		getSaveButton().click();
	}
	
	/**
	 * This is a business library to create new lead
	 * @param lName
	 * @param company
	 * @param title
	 * @param email
	 * @param country
	 * @param city
	 * @param state
	 */
	public void createNewLead(String lName, String dept, String mobile, String email, String mailingCountry , String mailingCity, String mailingState)
	{
		getLastNameTextField().sendKeys(lName);
		getDepartmentTextField().sendKeys(dept);
		getEmailTextField().sendKeys(email);
		getMobileTextField().sendKeys(mobile);
		getMailingCountryTextField().sendKeys(mailingCountry);
		getMailingCityTextField().sendKeys(mailingCity);
		getMailingStateTextField().sendKeys(mailingState);
		getSaveButton().click();
	}
	
	
}
