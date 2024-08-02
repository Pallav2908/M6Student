package tc_repository;

import org.testng.annotations.Test;

import genericLibOrUtlity.BaseClass;
import genericLibOrUtlity.ExcelUtlityOrLib;
import genericLibOrUtlity.JavaLibrary;
import objectRepository.CreatingNewOrganizationPage;
import objectRepository.HomePage;
import objectRepository.OrganizationPage;

public class ORG_02 extends BaseClass
{
	@Test(groups= {"regression"})
    public void org01Tc() throws Exception
    {
		JavaLibrary JUTIL = new JavaLibrary();
		int num = JUTIL.generateRandomNumber(10000);
		ExcelUtlityOrLib EUTIL = new ExcelUtlityOrLib();
		String ORGNAME = EUTIL.readDataFromExcel("Organization", 5, 1);
		String WEBSITE = EUTIL.readDataFromExcel("Organization", 5, 2);
		String EMP = EUTIL.readDataFromExcel("Organization", 5, 3);
		String PHNO = EUTIL.readDataFromExcel("Organization", 5, 4);
		String OTHPH = EUTIL.readDataFromExcel("Organization", 5, 5);
		String EMAIL = EUTIL.readDataFromExcel("Organization", 5, 6);
		
		HomePage hp = new HomePage(driver);
		hp.clickOnorg();
		OrganizationPage op = new OrganizationPage(driver);
		op.clickOnCreateOrgButton();
		
		CreatingNewOrganizationPage CNO = new CreatingNewOrganizationPage();
		CNO.createOrg(ORGNAME+num, WEBSITE, EMP, PHNO, OTHPH, EMAIL);
		System.out.println("ORG02 execution successfull!!");
		Thread.sleep(4000);
		
    }
}
