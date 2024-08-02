package objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/**
 * This is createLead pom class
 * @author Pallav Mukesh
 */
public class CreatingNewLeadPage 
{
    @FindBy(xpath = "//input[@name='firstname']")
    private WebElement firstName;
    
    @FindBy(xpath = "//input[@name='lastname']")
    private WebElement lastName;
    
    @FindBy(xpath = "//input[@name='company']")
    private WebElement company;
    
    @FindBy(xpath = "//input[@name='designation']")
    private WebElement title;
    
    @FindBy(xpath = "//input[@name='phone']")
    private WebElement phone;
    
    @FindBy(xpath = "//input[@name='mobile']")
    private WebElement mobileNo;
    
    @FindBy(xpath = "//input[@name='email']")
    private WebElement email;
    
    @FindBy(xpath = "//input[@name='noofemployees']")
    private WebElement noOfEmp;
    
    @FindBy(xpath = "//textarea[@name='lane']")
    private WebElement street;
    
    @FindBy(xpath = "//input[@name='pobox']")
    private WebElement poBox;
    
    @FindBy(xpath = "//input[@name='code']")
    private WebElement postalCode;
    
    @FindBy(xpath = "//input[@name='city']")
    private WebElement city;
    
    @FindBy(xpath = "//input[@name='country']")
    private WebElement country;
    
    @FindBy(xpath = "//input[@name='state']")
    private WebElement state;
    
    @FindBy(xpath = "(//input[@title='Save [Alt+S]'])[2]")
    private WebElement saveBtn;
    
    public void CreateNewLead(WebDriver driver)
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

	public WebElement getCompany() 
	{
		return company;
	}

	public WebElement getTitle() 
	{
		return title;
	}

	public WebElement getPhone() 
	{
		return phone;
	}

	public WebElement getMobileNo() 
	{
		return mobileNo;
	}

	public WebElement getEmail() 
	{
		return email;
	}

	public WebElement getNoOfEmp() 
	{
		return noOfEmp;
	}

	public WebElement getStreet() 
	{
		return street;
	}

	public WebElement getPoBox() 
	{
		return poBox;
	}

	public WebElement getPostalCode() 
	{
		return postalCode;
	}

	public WebElement getCity() 
	{
		return city;
	}

	public WebElement getCountry() 
	{
		return country;
	}

	public WebElement getState() 
	{
		return state;
	}

	public WebElement getSaveBtn() 
	{
		return saveBtn;
	}

	/**
     * Business logic
     * @param fname
     * @param lname
     * @param company
     */
    public void createLead(String fname, String lname, String comp)
    {
    	firstName.sendKeys(fname);
    	lastName.sendKeys(lname);
    	company.sendKeys(comp);
    	saveBtn.click();
    }
    /**
     * This is business library to create lead with all creds
     * @param fname
     * @param lname
     * @param comp
     * @param desg
     * @param phNo
     * @param mob
     * @param mailId
     * @param employees
     * @param strt
     * @param pb
     * @param postcode
     * @param cty
     * @param cntry
     * @param st
     */
    public void createLead(String fname, String lname, String comp, String desg, 
    		String phNo, String mob, String mailId, String employees, String strt, 
    		String pb, String postcode, String cty, String cntry, String st)
    {
    	firstName.sendKeys(fname);
    	lastName.sendKeys(lname);
    	company.sendKeys(comp);
    	title.sendKeys(desg);
    	phone.sendKeys(phNo);
    	mobileNo.sendKeys(mob);
    	email.sendKeys(mailId);
    	noOfEmp.sendKeys(employees);
    	street.sendKeys(strt);
    	poBox.sendKeys(pb);
    	postalCode.sendKeys(postcode);
    	city.sendKeys(cty);
    	country.sendKeys(cntry);
    	state.sendKeys(st);
    	saveBtn.click();
    
    }
    /**
     * This is business library to create led with employee creds
     * @param fname
     * @param lname
     * @param comp
     * @param desg
     * @param phNo
     * @param mob
     * @param mailId
     * @param employees 		
     */
    public void createLead(String fname, String lname, String comp, String desg, 
    		String phNo, String mob, String mailId, String employees)
    {
    	firstName.sendKeys(fname);
    	lastName.sendKeys(lname);
    	company.sendKeys(comp);
    	title.sendKeys(desg);
    	phone.sendKeys(phNo);
    	mobileNo.sendKeys(mob);
    	email.sendKeys(mailId);
    	noOfEmp.sendKeys(employees);
    	saveBtn.click();
    }
    /**
     * This is business library to create lead with employee address
     * @param fname
     * @param lname
     * @param comp
     * @param strt
     * @param pb
     * @param postcode
     * @param cty
     * @param cntry
     * @param st	
     */
    public void createLead(String fname, String lname, String comp, String strt, 
    		String pb, String postcode, String cty, String cntry, String st)
    {
    	firstName.sendKeys(fname);
    	lastName.sendKeys(lname);
    	company.sendKeys(comp);
    	street.sendKeys(strt);
    	poBox.sendKeys(pb);
    	postalCode.sendKeys(postcode);
    	city.sendKeys(cty);
    	country.sendKeys(cntry);
    	state.sendKeys(st);
    	saveBtn.click();
    }
    		    
}
