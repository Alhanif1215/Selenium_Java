package testCaseRepo;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import genericUtility.BaseClass;
import objectRepo.ContactsPage;
import objectRepo.CreatingNewContactPage;
import objectRepo.HomePage;

@Listeners(genericUtility.ListenersImplementation.class)
public class TC_005 extends BaseClass {

	@Test(groups = {"Regression"})
	public void CON_002() throws Exception
	{
		HomePage hp = new HomePage(driver);
		hp.clickOnHamburgerMenu();
		hp.mouseHoverOnMarketingMenu(driver);
		hp.clickOnContactMenu();
		ContactsPage cp = new ContactsPage(driver);
		cp.clickOnCreatingNewContactIcon();
		String lname = eUtil.getSingleDataFromExcelFile("Contacts", 4, 1);
		String title = eUtil.getSingleDataFromExcelFile("Contacts", 4, 2);
		String department = eUtil.getSingleDataFromExcelFile("Contacts", 4, 3);
		String email = eUtil.getSingleDataFromExcelFile("Contacts", 4, 4);
		String mobile = eUtil.getSingleDataFromExcelFile("Contacts", 4, 5);
		CreatingNewContactPage cnlp = new CreatingNewContactPage(driver);
		cnlp.createNewContact(lname, title, department, email, mobile);
		
	}
}
