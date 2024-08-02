package tc_repository;

import org.testng.annotations.Test;

import genericLibOrUtlity.BaseClass;
import genericLibOrUtlity.ExcelUtlityOrLib;
import genericLibOrUtlity.JavaLibrary;
import objectRepository.CreatingNewOrganizationPage;
import objectRepository.HomePage;
import objectRepository.OrganizationPage;

public class ORG_04 extends BaseClass
{
	@Test(groups= {"sanity","regression"})
    public void org01Tc() throws Exception
    {
		JavaLibrary JUTIL = new JavaLibrary();
		int num = JUTIL.generateRandomNumber(10000);
		ExcelUtlityOrLib EUTIL = new ExcelUtlityOrLib();
		String ORGNAME = EUTIL.readDataFromExcel("Organization", 11, 1);
		String WEBSITE = EUTIL.readDataFromExcel("Organization", 11, 2);
		String EMP = EUTIL.readDataFromExcel("Organization", 11, 3);
		String PHNO = EUTIL.readDataFromExcel("Organization", 11, 4);
		String OTHPH = EUTIL.readDataFromExcel("Organization", 11, 5);
		String EMAIL = EUTIL.readDataFromExcel("Organization", 11, 6);
		String BILLADD = EUTIL.readDataFromExcel("Organization", 11, 7);
		String BILLCITY = EUTIL.readDataFromExcel("Organization", 11, 8);
		String BILLSTATE = EUTIL.readDataFromExcel("Organization", 11, 9);
		
		HomePage hp = new HomePage(driver);
		hp.clickOnorg();
		OrganizationPage op = new OrganizationPage(driver);
		op.clickOnCreateOrgButton();
		
		CreatingNewOrganizationPage CNO = new CreatingNewOrganizationPage();
		CNO.createOrg(ORGNAME+num, WEBSITE, EMP, PHNO, OTHPH, EMAIL, BILLADD, BILLCITY, BILLSTATE);
		System.out.println("ORG04 execution successfull!!");
		Thread.sleep(4000);
    }
}
