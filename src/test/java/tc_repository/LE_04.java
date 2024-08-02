package tc_repository;

import org.testng.annotations.Test;

import genericLibOrUtlity.BaseClass;
import genericLibOrUtlity.ExcelUtlityOrLib;
import objectRepository.CreatingNewLeadPage;
import objectRepository.HomePage;
import objectRepository.LeadPage;

public class LE_04 extends BaseClass
{
    @Test(groups= {"sanity"})
    public void le04Tc() throws Exception
    {
    	ExcelUtlityOrLib EUTIL = new ExcelUtlityOrLib();
    	String FNAME = EUTIL.readDataFromExcel("Leads", 11, 1);
    	String LNAME = EUTIL.readDataFromExcel("Leads", 11, 2);
    	String CNAME = EUTIL.readDataFromExcel("Leads", 11, 3);
    	String STR = EUTIL.readDataFromExcel("Leads", 11, 4);
    	String PBOX = EUTIL.readDataFromExcel("Leads", 11, 5);
    	String PCODE = EUTIL.readDataFromExcel("Leads", 11, 6);
    	String CTY = EUTIL.readDataFromExcel("Leads", 11, 7);
    	String CNTRY = EUTIL.readDataFromExcel("Leads", 11, 8);
    	String STT = EUTIL.readDataFromExcel("Leads", 11, 9);
    	
    	HomePage hp = new HomePage(driver);
    	hp.clickOnLeads();
    	LeadPage lp = new LeadPage(driver);
    	lp.clickOnCreateLeadButton();
    	
    	CreatingNewLeadPage CNL = new CreatingNewLeadPage();
    	CNL.createLead(FNAME, LNAME, CNAME, STR, PBOX, PCODE, CTY, CNTRY, STT);
    	System.out.println("LE04 execution successfull!!");
    }
}
