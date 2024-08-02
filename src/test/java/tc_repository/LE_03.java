package tc_repository;

import org.testng.annotations.Test;

import genericLibOrUtlity.BaseClass;
import genericLibOrUtlity.ExcelUtlityOrLib;
import objectRepository.CreatingNewLeadPage;
import objectRepository.HomePage;
import objectRepository.LeadPage;

public class LE_03 extends BaseClass
{
    @Test(groups= {"smoke"})
    public void le03Tc() throws Exception
    {
    	ExcelUtlityOrLib EUTIL = new ExcelUtlityOrLib();
    	String FNAME = EUTIL.readDataFromExcel("Leads", 8, 1);
    	String LNAME = EUTIL.readDataFromExcel("Leads", 8, 2);
    	String CNAME = EUTIL.readDataFromExcel("Leads", 8, 3);
    	String TITLE = EUTIL.readDataFromExcel("Leads", 8, 4);
    	String PHNO = EUTIL.readDataFromExcel("Leads", 8, 5);
    	String MOB = EUTIL.readDataFromExcel("Leads", 8, 6);
    	String EMAIL = EUTIL.readDataFromExcel("Leads", 8, 7);
    	String EMPNO = EUTIL.readDataFromExcel("Leads", 8, 8);
    	
    	HomePage hp = new HomePage(driver);
    	hp.clickOnLeads();
    	LeadPage lp = new LeadPage(driver);
    	lp.clickOnCreateLeadButton();
    	
    	CreatingNewLeadPage CNL = new CreatingNewLeadPage();
    	CNL.createLead(FNAME, LNAME, CNAME, TITLE, PHNO, MOB, EMAIL, EMPNO);
    	System.out.println("LE03 execution successfull!!");
    }
}
