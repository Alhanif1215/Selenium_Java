package testCaseRepo;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import genericUtility.BaseClass;
import objectRepo.CreatingNewLeadPage;
import objectRepo.HomePage;
import objectRepo.LeadsPage;

@Listeners(genericUtility.ListenersImplementation.class)
public class TC_002 extends BaseClass{

	@Test(groups = {"Sanity"})
	public void LE_002() throws Exception
	{
		HomePage hp = new HomePage(driver);
		hp.clickOnHamburgerMenu();
		hp.mouseHoverOnMarketingMenu(driver);
		hp.clickOnLeadsMenu();
		LeadsPage lp = new LeadsPage(driver);
		lp.clickOnCreateNewLeadIcon();
		String lname = eUtil.getSingleDataFromExcelFile("Leads", 4, 1);
		String company = eUtil.getSingleDataFromExcelFile("Leads", 4, 2);
		String leadSource = eUtil.getSingleDataFromExcelFile("Leads", 4, 3);
		String noOfEmoloyees = eUtil.getSingleDataFromExcelFile("Leads", 4, 4);
		String mobile = eUtil.getSingleDataFromExcelFile("Leads", 4, 5);
		CreatingNewLeadPage cnlp = new CreatingNewLeadPage(driver);
		cnlp.createNewLead(lname, company, leadSource, noOfEmoloyees, mobile);
			
	}
}
