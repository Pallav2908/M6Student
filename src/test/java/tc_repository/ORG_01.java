package tc_repository;

import org.testng.annotations.Test;

import genericLibOrUtlity.BaseClass;
import genericLibOrUtlity.ExcelUtlityOrLib;
import genericLibOrUtlity.JavaLibrary;
import objectRepository.CreatingNewOrganizationPage;
import objectRepository.HomePage;
import objectRepository.OrganizationPage;

public class ORG_01 extends BaseClass
{
	@Test(groups= {"regression"})
    public void org01Tc() throws Exception
    {
		JavaLibrary JUTIL = new JavaLibrary();
		int num = JUTIL.generateRandomNumber(10000);
		ExcelUtlityOrLib EUTIL = new ExcelUtlityOrLib();
		String ORGNAME = EUTIL.readDataFromExcel("Organization", 2, 1);
		String WEBSITE = EUTIL.readDataFromExcel("Organization", 2, 2);
		String EMP = EUTIL.readDataFromExcel("Organization", 2, 3);
		
		HomePage hp = new HomePage(driver);
		hp.clickOnorg();
		OrganizationPage op = new OrganizationPage(driver);
		op.clickOnCreateOrgButton();
		
		CreatingNewOrganizationPage CNO = new CreatingNewOrganizationPage();
		CNO.createOrg(ORGNAME+num, WEBSITE, EMP);
		System.out.println("ORG01 execution successfull!!");
		Thread.sleep(4000);
		
    }
}
