package testCaseRepo;

import org.testng.annotations.Test;

import genericUtility.BaseClass;
import objectRepo.ContactsPage;
import objectRepo.CreatingNewContactPage;
import objectRepo.HomePage;

public class TC_004 extends BaseClass{

	@Test
	public void CON_001() throws Exception
	{
		HomePage hp = new HomePage(driver);
		hp.clickOnHamburgerMenu();
		hp.mouseHoverOnMarketingMenu(driver);
		hp.clickOnContactMenu();
		ContactsPage cp = new ContactsPage(driver);
		cp.clickOnCreatingNewContactIcon();
		String fname = eUtil.getSingleDataFromExcelFile("Contacts", 1, 1);
		String lname = eUtil.getSingleDataFromExcelFile("Contacts", 1, 2);
		String orgName = eUtil.getSingleDataFromExcelFile("Contacts", 1, 3);
		CreatingNewContactPage cnlp = new CreatingNewContactPage(driver);
		cnlp.createNewContact(fname, lname, orgName);
		
	}
}
