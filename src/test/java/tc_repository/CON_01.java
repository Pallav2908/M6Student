package tc_repository;

import org.testng.annotations.Test;

import genericLibOrUtlity.BaseClass;
import genericLibOrUtlity.ExcelUtlityOrLib;
import genericLibOrUtlity.JavaLibrary;
import objectRepository.ContactPage;
import objectRepository.CreateNewContact;
import objectRepository.HomePage;

public class CON_01 extends BaseClass
{
    @Test
    public void con01Tc() throws Exception
    {
    	JavaLibrary JUTIL = new JavaLibrary();
		int num = JUTIL.generateRandomNumber(10000);
    	ExcelUtlityOrLib EUTIL = new ExcelUtlityOrLib();
    	String FNAME = EUTIL.readDataFromExcel("Contacts", 1, 1);
    	String LNAME = EUTIL.readDataFromExcel("Contacts", 1, 2);
    	String TITLE = EUTIL.readDataFromExcel("Contacts", 1, 3);
    	
    	HomePage hp = new HomePage(driver);
    	hp.clickOnContacts();
        ContactPage cp = new ContactPage(driver);
        cp.clickOnCreateContactButton();
        
        CreateNewContact CNC = new CreateNewContact(driver);
        CNC.createContact(FNAME+num, LNAME, TITLE);
        System.out.println("CON01 execution successfull!!");
    	
    }
}
