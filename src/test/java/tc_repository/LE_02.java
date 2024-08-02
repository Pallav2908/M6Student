package tc_repository;

import org.testng.annotations.Test;

import genericLibOrUtlity.BaseClass;
import genericLibOrUtlity.ExcelUtlityOrLib;
import objectRepository.CreatingNewLeadPage;
import objectRepository.HomePage;
import objectRepository.LeadPage;

public class LE_02 extends BaseClass
{
    @Test(groups= {"regression"})
    public void le02Tc() throws Exception
    {
    	ExcelUtlityOrLib EUTIL = new ExcelUtlityOrLib();
    	String FNAME = EUTIL.readDataFromExcel("Leads", 5, 1);
    	String LNAME = EUTIL.readDataFromExcel("Leads", 5, 2);
    	String CNAME = EUTIL.readDataFromExcel("Leads", 5, 3);
    	String TITLE = EUTIL.readDataFromExcel("Leads", 5, 4);
    	String PHNO = EUTIL.readDataFromExcel("Leads", 5, 5);
    	String MOB = EUTIL.readDataFromExcel("Leads", 5, 6);
    	String EMAIL = EUTIL.readDataFromExcel("Leads", 5, 7);
    	String EMPNO = EUTIL.readDataFromExcel("Leads", 5, 8);
    	String STR = EUTIL.readDataFromExcel("Leads", 5, 9);
    	String PBOX = EUTIL.readDataFromExcel("Leads", 5, 10);
    	String PCODE = EUTIL.readDataFromExcel("Leads", 5, 11);
    	String CTY = EUTIL.readDataFromExcel("Leads", 5, 12);
    	String CNTRY = EUTIL.readDataFromExcel("Leads", 5, 13);
    	String STT = EUTIL.readDataFromExcel("Leads", 5, 14);
    	
    	HomePage hp = new HomePage(driver);
    	hp.clickOnLeads();
    	LeadPage lp = new LeadPage(driver);
    	lp.clickOnCreateLeadButton();
    	
    	CreatingNewLeadPage CNL = new CreatingNewLeadPage();
    	CNL.createLead(FNAME, LNAME, CNAME, TITLE, PHNO, MOB, EMAIL, EMPNO, STR, PBOX, PCODE, CTY, CNTRY, STT);
    	System.out.println("LE02 execution successfull!!");
    }
}
