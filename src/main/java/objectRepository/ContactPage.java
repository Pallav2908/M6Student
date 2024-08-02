package objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/**
 * This is a pom class to click on create contact button
 */
public class ContactPage 
{
   @FindBy(xpath = "//img[@title='Create Contact...']")
   private WebElement createNewContact;

   public WebElement getCreateNewContact() 
   {
	   return createNewContact;
   }

   public ContactPage(WebDriver driver) 
   {
       PageFactory.initElements(driver, this);
   }

   /**
	 * Business lib to click on create new contact
	 */
   public void clickOnCreateContactButton()
   {
	   createNewContact.click();
   }
}
