package tc_repository;

import org.testng.annotations.Test;

import genericLibOrUtlity.BaseClass;
import genericLibOrUtlity.ExcelUtlityOrLib;
import genericLibOrUtlity.JavaLibrary;
import objectRepository.CreatingNewLeadPage;
import objectRepository.HomePage;
import objectRepository.LeadPage;

public class LE_01 extends BaseClass
{
    @Test
    public void le01Tc() throws Exception
    {
    	JavaLibrary JUTIL = new JavaLibrary();
		int num = JUTIL.generateRandomNumber(10000);
    	ExcelUtlityOrLib EUTIL = new ExcelUtlityOrLib();
    	String FNAME = EUTIL.readDataFromExcel("Leads", 1, 1);
    	String LNAME = EUTIL.readDataFromExcel("Leads", 1, 2);
    	String CNAME = EUTIL.readDataFromExcel("Leads", 1, 3);
    	
    	HomePage hp = new HomePage(driver);
    	hp.clickOnLeads();
    	LeadPage lp = new LeadPage(driver);
    	lp.clickOnCreateLeadButton();
    	
    	CreatingNewLeadPage CNL = new CreatingNewLeadPage();
    	CNL.createLead(FNAME+num, LNAME, CNAME);
    	System.out.println("LE01 execution successfull!!");
    	driver.quit();
    }
}
