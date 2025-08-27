package objectRepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

	//Declaration of WebElements
	@FindBy(xpath = "//input[@name='user-name']")
	private WebElement usernameTextField;
	
	@FindBy(xpath = "//input[@type='password']")
	private WebElement passwordTextField;
	
	@FindBy(xpath = "//input[@id='submitButton']")
	private WebElement loginButton;
	
	
	//Initialisation of WebElements
	public void loginPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	//public getters
	public WebElement getUsernameTextField()
	{
		return usernameTextField;
	}
	
	public WebElement getPasswordTextField()
	{
		return passwordTextField;
	}
	public WebElement getLoginButton()
	{
		return loginButton;
	}
	
	//Utilisation of WebElements
	public void loginToApplication(String un, String pwd)
	{
		getUsernameTextField().sendKeys(un);
		getPasswordTextField().sendKeys(pwd);
		getLoginButton().click();
	}
}
