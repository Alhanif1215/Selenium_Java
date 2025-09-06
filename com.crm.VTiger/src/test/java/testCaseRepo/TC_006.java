package testCaseRepo;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import genericUtility.BaseClass;
import objectRepo.ContactsPage;
import objectRepo.CreatingNewContactPage;
import objectRepo.HomePage;

@Listeners(genericUtility.ListenersImplementation.class)
public class TC_006 extends BaseClass{

	@Test(groups = {"Regression"})
	public void CON_003() throws Exception
	{
		HomePage hp = new HomePage(driver);
		hp.clickOnHamburgerMenu();
		hp.mouseHoverOnMarketingMenu(driver);
		hp.clickOnContactMenu();
		ContactsPage cp = new ContactsPage(driver);
		cp.clickOnCreatingNewContactIcon();
		String lname = eUtil.getSingleDataFromExcelFile("Contacts", 7, 1);
		String department = eUtil.getSingleDataFromExcelFile("Contacts", 7, 2);
		String mobile = eUtil.getSingleDataFromExcelFile("Contacts", 7, 3);
		String email = eUtil.getSingleDataFromExcelFile("Contacts", 7, 4);
		String mCity = eUtil.getSingleDataFromExcelFile("Contacts", 7, 5);
		String mState = eUtil.getSingleDataFromExcelFile("Contacts", 7, 6);
		String mCountry = eUtil.getSingleDataFromExcelFile("Contacts", 7, 7);
		CreatingNewContactPage cnlp = new CreatingNewContactPage(driver);
		cnlp.createNewContact(lname, department, mobile, email, mCountry, mCity, mState);
		
	}
}
