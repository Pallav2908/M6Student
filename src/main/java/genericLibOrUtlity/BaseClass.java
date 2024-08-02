package genericLibOrUtlity;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

import objectRepository.HomePage;
import objectRepository.LoginPage;

public class BaseClass 
{
    public static WebDriver driver  = null;
    public PropertiesUtilOrLib PUTIL = null;
    public SeleniumUtility SUTIL = new SeleniumUtility();
    
    @BeforeSuite
    public void createDbConnection()
    {
    	System.out.println("db CONNECTION SUCCESSFUL!!");
    }
    
    @BeforeClass(alwaysRun = true)
    public void launchBrowser() throws Exception
    {
    	PUTIL = new PropertiesUtilOrLib();
    	String URL = PUTIL.getDataFromProperties("url");
    	
    	driver = new ChromeDriver();
    	SUTIL.implcitWait(driver, 10);
    	SUTIL.maximizeWindow(driver);
    	driver.get(URL);
    	
    	System.out.println("LAUNCHING SUCCESSFULL!!");
    }
    
    @BeforeMethod(alwaysRun = true)
    public void loginOperation() throws Exception
    {
    	String USERNAME = PUTIL.getDataFromProperties("username");
    	String PASSWORD = PUTIL.getDataFromProperties("password");
    	LoginPage LP = new LoginPage(driver);
    	LP.loginToApplication(USERNAME, PASSWORD);
    	
    	System.out.println("LOGIN SUCCESSFULL!!");
    }
    
    @AfterMethod(alwaysRun = true)
    public void logoutOperation()
    {
    	HomePage hp = new HomePage(driver);
    	hp.logoutOperation(driver);
    	
    	System.out.println("LOGOUT SUCCESSFULL!!");
    }
    
    @AfterClass(alwaysRun = true)
    public void closeBrowser()
    {
    	driver.close();
    	
    	System.out.println("BROWSER CLOSED SUCCESSFULLY!!");
    }
    
    @AfterSuite(alwaysRun = true)
    public void closeDbConnection()
    {
    	System.out.println("db CONNECTION CLOSED!!");
    }
}
