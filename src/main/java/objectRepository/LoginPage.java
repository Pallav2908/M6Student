package objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/**
 * This is a LoginPage POM Class
 * @auther Pallav 
 */

public class LoginPage 
{
	@FindBy(xpath = "//input[@name='user_name']")
	  private WebElement usernameTextfield;
	  
	  @FindBy(xpath = "//input[@name='user_password']")
	  private WebElement passwordTextfield;
	  
	  @FindBy(xpath = "//input[@id='submitButton']")
	  private WebElement loginButton;

	public Object loginOperation;
	  
	  public LoginPage(WebDriver driver)
	  {
		  PageFactory.initElements(driver, this);
	  }

	  public WebElement getUsernameTextfield() 
	  {
		return usernameTextfield;
	  }

	  public WebElement getPasswordTextfield() 
	  {
		return passwordTextfield;
	  }

	  public WebElement getLoginButton() 
	  {
		return loginButton;
	  }
	  
	  /**
	   * This is a business library method to perform login operation to application
	   * @param username
	   * @param password
	   */
	  
	  public void loginToApplication(String username, String password)
	  {
		  getUsernameTextfield().sendKeys(username);
		  getPasswordTextfield().sendKeys(password);
		  getLoginButton().click();
	  }
	}

