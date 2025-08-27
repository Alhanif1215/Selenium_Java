package objectRepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import genericUtility.SeleniumUtility;

public class CreatingNewLeadPage {

	@FindBy(xpath = "//input[@name='firstname']")
	private WebElement firstNameTextField;
	
	@FindBy(name = "firstname")
	private WebElement lastNameTextField;
	
	@FindBy(xpath = "//input[@name='company']")
	private WebElement companyTextField;
	
	@FindBy(xpath = "//select[@name='leadsource']")
	private WebElement leadSourceDropdown;
	
	@FindBy(id = "noOfEmployees")
	private WebElement noOfEmployeesTextField;
	
	@FindBy(id = "mobile")
	private WebElement mobileTextField;
	
	@FindBy(xpath = "//input[@name='designation']")
	private WebElement titleTextField;
	
	@FindBy(xpath = "//input[@id='email']")
	private WebElement emailTextField;
	
	@FindBy(xpath = "//input[@id='country']")
	private WebElement countryTextField;
	
	@FindBy(xpath = "//input[@id='state']")
	private WebElement stateTextField;
	
	@FindBy(xpath = "//input[@id='city']")
	private WebElement cityTextField;
	
	@FindBy(xpath = "//input[@title='Save [Alt+S]']")
	private WebElement saveButton;
	
	
	public CreatingNewLeadPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	public WebElement getFirstNameTextField()
	{
		return firstNameTextField;
	}
	public WebElement getLastNameTextField()
	{
		return lastNameTextField;
	}
	public WebElement getCompanyTextField()
	{
		return companyTextField;
	}
	public WebElement getLeadSourceDropdown()
	{
		return leadSourceDropdown;
	}
	public WebElement getNoOfEmployeesTextField()
	{
		return noOfEmployeesTextField;
	}
	public WebElement getMobileTextField()
	{
		return mobileTextField;
	}
	public WebElement getTitleTextField()
	{
		return titleTextField;
	}
	public WebElement getEmailTextField()
	{
		return emailTextField;
	}
	public WebElement getCountryTextField()
	{
		return countryTextField;
	}
	public WebElement getStateTextField()
	{
		return stateTextField;
	}
	public WebElement getCityTextField()
	{
		return cityTextField;
	}
	public WebElement getSaveButton()
	{
		return saveButton;
	}
	
	
	
	/**
	 * This is a business library to create new lead
	 * @param fName
	 * @param lName
	 * @param company
	 */
	public void createNewLead(String fName, String lName, String company)
	{
		getFirstNameTextField().sendKeys(fName);
		getLastNameTextField().sendKeys(lName);
		getCompanyTextField().sendKeys(company);
		getSaveButton().click();
	}
	
	/**
	 * This is a business library to create new lead
	 * @param lName
	 * @param company
	 * @param leadSource
	 * @param noOfEmployees
	 * @param mobile
	 */
	public void createNewLead(String lName, String company, String leadSource, String noOfEmployees, String mobile)
	{
		getLastNameTextField().sendKeys(lName);
		getCompanyTextField().sendKeys(company);
		SeleniumUtility sUtil = new SeleniumUtility();
		sUtil.selectOptionByValue(getLeadSourceDropdown(), leadSource);
		getNoOfEmployeesTextField().sendKeys(noOfEmployees);
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
	public void createNewLead(String lName, String company, String title, String email, String country , String city, String state)
	{
		getLastNameTextField().sendKeys(lName);
		getCompanyTextField().sendKeys(company);
		getTitleTextField().sendKeys(title);
		getEmailTextField().sendKeys(email);
		getCountryTextField().sendKeys(country);		
		getCityTextField().sendKeys(city);
		getStateTextField().sendKeys(state);
		getSaveButton().click();
	}
	
	
}
