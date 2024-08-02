package objectRepository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * This is createOrg pom class
 * @author Pallav Mukesh
 */
public class CreatingNewOrganizationPage 
{
	@FindBy(xpath = "//input[@name='accountname']")
    private WebElement orgName;
    
	@FindBy(xpath =  "//input[@name='website']")
    private WebElement website;
    
	@FindBy(xpath = "//input[@name='employees']")
    private WebElement empNo;
    
	@FindBy(xpath = "//input[@name='phone']")
    private WebElement phNo;
    
	@FindBy(xpath = "//input[@name='otherphone']")
    private WebElement otherPhNo;
    
	@FindBy(xpath = "//input[@name='email']")
    private WebElement emailId;
    
	@FindBy(xpath = "//textarea[@name='bill_street']")
    private WebElement billAdd;
    
	@FindBy(xpath = "//input[@name='bill_city']")
    private WebElement billCty;
    
	@FindBy(xpath = "//input[@name='bill_state']")
    private WebElement billSt;
    
   @FindBy(xpath = "(//input[@title='Save [Alt+S]'])[1]")
   private WebElement saveBtn;
   
   /**
    * Business logic
    * @param orgName
    * @param website
    * @param empNo
    */
   public void createOrg(String OrganizationName, String web, String eNum)
   {
	   orgName.sendKeys(OrganizationName);
	   website.sendKeys(web);
	   empNo.sendKeys(eNum);
	   saveBtn.click();
   }
   
   public void createOrg(String OrganizationName, String web, String eNum, String phNum, String othPhNo, String email)
   {
	   orgName.sendKeys(OrganizationName);
	   website.sendKeys(web);
	   empNo.sendKeys(eNum); 
	   phNo.sendKeys(phNum);
	   otherPhNo.sendKeys(othPhNo);
	   emailId.sendKeys(email);
	   saveBtn.click();
   }
   
   
   public void createOrg(String OrganizationName, String web, String billingAdd, String billingCty, String billingSt )
   {
	   orgName.sendKeys(OrganizationName);
	   website.sendKeys(web);
	   billAdd.sendKeys(billingAdd);
	   billCty.sendKeys(billingCty);
	   billSt.sendKeys(billingSt);
	   saveBtn.click();
   }
   
   public void createOrg(String OrganizationName, String web, String eNum, String phNum, String othPhNo, String email,
		   String billingAdd, String billingCty, String billingSt)
   {
	   orgName.sendKeys(OrganizationName);
	   website.sendKeys(web);
	   empNo.sendKeys(eNum);
	   phNo.sendKeys(phNum);
	   otherPhNo.sendKeys(othPhNo);
	   emailId.sendKeys(email);
	   billAdd.sendKeys(billingAdd);
	   billCty.sendKeys(billingCty);
	   billSt.sendKeys(billingSt);
	   saveBtn.click();
   }  
}
