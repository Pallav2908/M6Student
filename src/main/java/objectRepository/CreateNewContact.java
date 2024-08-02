package objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/**
* This is createcontact pom class
* @author Pallav Mukesh
*/
public class CreateNewContact 
{
    @FindBy(xpath = "//input[@name='firstname']")
    private WebElement firstName;
    
    @FindBy(xpath = "//input[@name='lastname']")
    private WebElement lastName;
    
    @FindBy(xpath = "//input[@name='account_name']")
    private WebElement organization;
    
    @FindBy(xpath = "//input[@id='title']")
    private WebElement title;
    
    @FindBy(xpath = "//select[@name='leadsource']")
    private WebElement leadsource;
    
    @FindBy(xpath = "//input[@id='department']")
    private WebElement department;
    
    @FindBy(xpath = "//input[@id='email']")
    private WebElement email;
    
    @FindBy(xpath = "//input[@id='assistant']")
    private WebElement assistant;
    
    @FindBy(xpath = "//input[@id='assistantphone']")
    private WebElement assistantphone;
    
    @FindBy(xpath = "//input[@id='phone']")
    private WebElement officephone;
    
    @FindBy(xpath = "//input[@id='mobile']")
    private WebElement mobile;
    
    @FindBy(xpath = "//input[@id='homephone']")
    private WebElement homephone;
    
    @FindBy(xpath = "//input[@id='otherphone']")
    private WebElement otherphone;
    
    @FindBy(xpath = "(//input[@title='Save [Alt+S]'])[1]")
    private WebElement saveBtn;
    
    public CreateNewContact(WebDriver driver) 
	{
	    PageFactory.initElements(driver, this); 
	}

    
    public WebElement getFirstName() 
    {
		return firstName;
	}


	public WebElement getLastName() 
	{
		return lastName;
	}


	public WebElement getOrganization() 
	{
		return organization;
	}


	public WebElement getTitle() 
	{
		return title;
	}


	public WebElement getLeadsource() {
		return leadsource;
	}


	public WebElement getDepartment() {
		return department;
	}


	public WebElement getEmail() {
		return email;
	}


	public WebElement getAssistant() 
	{
		return assistant;
	}


	public WebElement getAssistantphone() 
	{
		return assistantphone;
	}


	public WebElement getOfficephone() 
	{
		return officephone;
	}


	public WebElement getMobile() 
	{
		return mobile;
	}


	public WebElement getHomephone() 
	{
		return homephone;
	}


	public WebElement getOtherphone() {
		return otherphone;
	}


	public WebElement getSaveBtn() {
		return saveBtn;
	}


	/**
     * Business Logic
     * @param fName
     * @param lName
     * @param ttl
     */
    public void createContact(String fName, String lName, String ttl)
    {
    	firstName.sendKeys(fName);
		lastName.sendKeys(lName);
		organization.sendKeys(ttl);
		saveBtn.click();
    }
    
    /**
     * This is business library to create contact with all 
     * 
     */
    public void createContact(String fName, String lName, String orgName, String ledSrc, String ttl, String dept, String mail, String astnt, String astntPhNo)
    {
    	firstName.sendKeys(fName);
		lastName.sendKeys(lName);
		organization.sendKeys(orgName);
		leadsource.sendKeys(ledSrc);
		title.sendKeys(ttl);
		department.sendKeys(dept);
		email.sendKeys(mail);
		assistant.sendKeys(astnt);
		assistantphone.sendKeys(astntPhNo);
		saveBtn.click();
    }
    
	/**
	 * This method is use to create contact with all employee Phone details
	 * 
    */
    public void createContact(String phNo, String mob, String homePh, String othrPh)
    {
    	officephone.sendKeys(phNo);
		mobile.sendKeys(mob);
		homephone.sendKeys(homePh);
		otherphone.sendKeys(othrPh);
		saveBtn.click();
    }
    
	
	/**
	 * This method is use to create contact with all contact details
	 * @param fname
	 * 
	 */
	public void createContact(String fName, String lName, String ttl, String ledSrc, String dept, String mail, 
			String astnt, String astntPhNo, String phNo, String mob, String homePh, String othrPh)
	{
		firstName.sendKeys(fName);
		lastName.sendKeys(lName);
		title.sendKeys(ttl);
		leadsource.sendKeys(ledSrc);
		department.sendKeys(dept);
		email.sendKeys(mail);
		assistant.sendKeys(astnt);
		assistantphone.sendKeys(astntPhNo);
		officephone.sendKeys(phNo);
		mobile.sendKeys(mob);
		homephone.sendKeys(homePh);
		otherphone.sendKeys(othrPh);
		saveBtn.click();
		
    }
    
}
