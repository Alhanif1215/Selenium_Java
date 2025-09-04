package objectRepo;


import java.awt.AWTException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import genericUtility.SeleniumUtility;

public class CreatingNewContactPage {
	
	@FindBy(name= "firstname")	   
	private WebElement firstNameTextField;
	
	@FindBy(name= "lastname")
	private WebElement lastNameTextField;

	@FindBy(xpath = "//input[@name='account_id_display']")
	private WebElement organizationNameTextField;
	
	@FindBy(name = "title")
	private WebElement titleTextField;
	
	@FindBy(name = "department")
	private WebElement departmentTextField;
	
	@FindBy(name="email")
	private WebElement emailTextField;
	
	@FindBy(name="phone")
	private WebElement mobileTextField;
	
	@FindBy(xpath = "//input[@data-fieldname='mailingcity']")
	private WebElement mailingCityTextField;
	
	@FindBy(xpath = "//input[@id='Contacts_editView_fieldName_mailingcountry']")
	private WebElement mailingCountryTextField;
	
	@FindBy(xpath = "//input[@id='Contacts_editView_fieldName_mailingcity']")
	private WebElement mailingStateTextField;
	
	@FindBy(xpath = "//button[@type='submit']")
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
	 * @throws InterruptedException 
	 * @throws AWTException 
	 */
	public void createNewContact(String fName, String lName, String orgName) throws InterruptedException, AWTException
	{
		getFirstNameTextField().sendKeys(fName);
		getLastNameTextField().sendKeys(lName);
		getOrganizationNameTextField().sendKeys(orgName);
		Thread.sleep(1000);
		SeleniumUtility sUtil = new SeleniumUtility();
		sUtil.pressDownNEnterx2();
		getSaveButton().click();
	}
	
	/**
	 * This is business library to create new contact
	 * @param lName
	 * @param title
	 * @param dept
	 * @param email
	 * @param mobile
	 */
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
	public void createNewContact(String lName, String dept, String mobile, String email, String mailingCountry , String mailingCity, String mailingState)
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
