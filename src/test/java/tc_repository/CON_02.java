package tc_repository;

import org.testng.annotations.Test;

import genericLibOrUtlity.BaseClass;
import genericLibOrUtlity.ExcelUtlityOrLib;
import genericLibOrUtlity.JavaLibrary;
import objectRepository.ContactPage;
import objectRepository.CreateNewContact;
import objectRepository.HomePage;

public class CON_02 extends BaseClass
{
    @Test(groups= {"regression"})
    public void con02Tc() throws Exception
    {
    	JavaLibrary JUTIL = new JavaLibrary();
		int num = JUTIL.generateRandomNumber(10000);
    	ExcelUtlityOrLib EUTIL = new ExcelUtlityOrLib();
    	String FNAME = EUTIL.readDataFromExcel("Contacts", 4, 1);
    	String LNAME = EUTIL.readDataFromExcel("Contacts", 4, 2);
    	String ORGNAME = EUTIL.readDataFromExcel("Contacts", 4, 3);
    	String LEADSRC = EUTIL.readDataFromExcel("Contacts", 4, 4);
    	String TITLE = EUTIL.readDataFromExcel("Contacts", 4, 5);
    	String DEPT = EUTIL.readDataFromExcel("Contacts", 4, 6);
    	String EMAIL = EUTIL.readDataFromExcel("Contacts", 4, 7);
    	String ASSTNT = EUTIL.readDataFromExcel("Contacts", 4, 8);
    	String ASSTNTPHNO = EUTIL.readDataFromExcel("Contacts", 4, 9);
    	
    	HomePage hp = new HomePage(driver);
    	hp.clickOnContacts();
        ContactPage cp = new ContactPage(driver);
        cp.clickOnCreateContactButton();
        
        CreateNewContact CNC = new CreateNewContact(driver);
        CNC.createContact(FNAME+num, LNAME, ORGNAME, LEADSRC, TITLE, DEPT, EMAIL, ASSTNT, ASSTNTPHNO);
        System.out.println("CON02 execution successfull!!");
        
    }
}
