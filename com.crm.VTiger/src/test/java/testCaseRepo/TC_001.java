package testCaseRepo;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import genericUtility.BaseClass;
import objectRepo.CreatingNewLeadPage;
import objectRepo.HomePage;
import objectRepo.LeadsPage;

@Listeners(genericUtility.ListenersImplementation.class)
public class TC_001 extends BaseClass{

	@Test(groups = {"Smoke", "Sanity"})
	public void LE_001() throws Exception
	{
		HomePage hp = new HomePage(driver);
		hp.clickOnHamburgerMenu();
		hp.mouseHoverOnMarketingMenu(driver);
		hp.clickOnLeadsMenu();
		LeadsPage lp = new LeadsPage(driver);
		lp.clickOnCreateNewLeadIcon();
		String fname = eUtil.getSingleDataFromExcelFile("Leads", 1, 1);
		String lname = eUtil.getSingleDataFromExcelFile("Leads", 1, 2);
		String company = eUtil.getSingleDataFromExcelFile("Leads", 1, 3);
		CreatingNewLeadPage cnlp = new CreatingNewLeadPage(driver);
		cnlp.createNewLead(fname, lname, company);
	}
}
