package tc_repository;

import org.testng.annotations.Test;

import genericLibOrUtlity.BaseClass;
import genericLibOrUtlity.ExcelUtlityOrLib;
import genericLibOrUtlity.JavaLibrary;
import objectRepository.CreatingNewOrganizationPage;
import objectRepository.HomePage;
import objectRepository.OrganizationPage;

public class ORG_03 extends BaseClass
{
	@Test(groups= {"smoke", "regression"})
    public void org01Tc() throws Exception
    {
		JavaLibrary JUTIL = new JavaLibrary();
		int num = JUTIL.generateRandomNumber(10000);
		ExcelUtlityOrLib EUTIL = new ExcelUtlityOrLib();
		String ORGNAME = EUTIL.readDataFromExcel("Organization", 8, 1);
		String WEBSITE = EUTIL.readDataFromExcel("Organization", 8, 2);
		String BILLADD = EUTIL.readDataFromExcel("Organization", 8, 3);
		String BILLCITY = EUTIL.readDataFromExcel("Organization", 8, 4);
		String BILLSTATE = EUTIL.readDataFromExcel("Organization", 8, 5);
		
		HomePage hp = new HomePage(driver);
		hp.clickOnorg();
		OrganizationPage op = new OrganizationPage(driver);
		op.clickOnCreateOrgButton();
		
		CreatingNewOrganizationPage CNO = new CreatingNewOrganizationPage();
		CNO.createOrg(ORGNAME+num, WEBSITE, BILLADD, BILLCITY, BILLSTATE);
		System.out.println("ORG03 execution successfull!!");
		Thread.sleep(4000);
		
    }
}
