package genericLibOrUtlity;

import java.io.File;
import java.time.Duration;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import com.google.common.io.Files;

public class SeleniumUtility 
{
     public Actions act = null;
     public Select s = null;
     
     /**
      * This method is use to maximize the window
      * @param driver
      */
    public void maximizeWindow(WebDriver driver)
    {
     driver.manage().window().maximize();
    }
    
    /**
     * This method is use to implicit wait
     * @param driver
     * @param time
     */
     public void implcitWait(WebDriver driver, int time)
     {
    	 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(time));
     }
     
     /**
      * This method is use to move to particular element
      * @param driver
      * @param element 
      */
     public void movingTowardsAnElement(WebDriver driver, WebElement element)
     {
    	 act = new Actions(driver);
    	 act.moveToElement(element).perform();
     }
     
     /**
      * This method is use to perform right click operation
      * @param driver
      * @param element
      */
     public void rightClick(WebDriver driver, WebElement element)
     {
    	 act = new Actions(driver);
    	 act.contextClick(element).perform();
     }
     
     /**
      * This method is use to click on an element
      * @param driver
      * @param element
      */
     public void clickOnElement(WebDriver driver, WebElement element) 
     {
    	 act = new Actions(driver);
    	 act.click(element).perform();	
	 }
     
     /**
      * This method is use to scroll to a particular element
      * @param driver
      * @param element
      */
     public void scrollToAparticularElement(WebDriver driver, WebElement element) 
     {
	     act = new Actions(driver);
	     act.scrollToElement(element).perform();
	 }
     
     /**
      * This method is use to drag an element to its destination
      * @param driver
      * @param src
      * @param dest
      */
     public void dragSrcToDest(WebDriver driver, WebElement src, WebElement dest) 
     {
	     act = new Actions(driver);
	     act.dragAndDrop(src, dest).perform();
	 }
     
     /**
      * This method is use to drag a pointer
      * @param driver
      * @param src
      * @param x
      * @param y
      */
     public void dragPointer(WebDriver driver, WebElement src, int x, int y) 
     {
	     act = new Actions(driver);
	     act.dragAndDropBy(src, x, y).perform();
	 }
     
     /**
      * This method is use to click and hold
      * @param driver
      * @param element
      */
     public void clickAndHoldAnElement(WebDriver driver, WebElement element) 
     {
	     act = new Actions(driver);
	     act.clickAndHold(element).perform();
	 }
     
     /**
      * This method is use to release an element
      * @param driver
      * @param element
      */
     public void releaseAnElement(WebDriver driver, WebElement element) 
     {
		 act = new Actions(driver);
		 act.release(element).perform();
	 }
     
     /**
      * This method is use to select an option from drop down based on index
      * @param element
      * @param indexNo
      */
     public void selectAnElementBasedOnIndex(WebElement element, int indexNo) 
     {
	     s = new Select(element);
	     s.selectByIndex(indexNo);
	 }
     
     /**
      * This method is use to select an option from drop down based on value attribute
      * @param element
      * @param value
      */
     public void selectAnElementBasedOnValueAttribute(WebElement element, String value) 
     {
	     s = new Select(element);
	     s.selectByValue(value);
	 }
     
     /**
      * This method is use to select an option from drop down based on visible text
      * @param element
      * @param text
      */
     public void selectAnElementBasedOnVisibleText(WebElement element, String text) 
     {
	     s = new Select(element);
	     s.selectByVisibleText(text);
	 }
     
     /**
      * This method will give all the options
      * @param element
      * @return
      */
     public List<WebElement> getAllOptionsFromDropDown(WebElement element)
     {
	     s = new Select(element);
	     List<WebElement> options = s.getOptions();
	     return options;
	 }
     
     /**
      * This method will give all the selected options
      * @param element
      * @return
      */
     public List<WebElement> getAllSelectOptionsFromDropDown(WebElement element)
     {
    	 s = new Select(element);
    	 List<WebElement> options = s.getAllSelectedOptions();
    	 return options;
     }
     
     /**
      * This method is use to de-select an option from drop down based on index
      * @param element
      * @param indexNo
      */
     public void deselectAnElementBasedOnIndex(WebElement element, int indexNo) 
     {
    	 s = new Select(element);
	     s.deselectByIndex(indexNo);
	 }
     
     /**
      * This method is use to de-select an option from drop down based on value attribute
      * @param element
      * @param value
      */
     public void deselectAnElementBasedOnValueAttribute(WebElement element, String value) 
     {
	     s = new Select(element);
	     s.deselectByValue(value);
	 }
     
     /**
      * This method is use to de-select an option from drop down based on visible text
      * @param element
      * @param text
      */
     public void deselectAnElementBasedOnVisibleText(WebElement element, String text) 
     {
	     s = new Select(element);
	     s.deselectByVisibleText(text);
	 }
     
     /**
      * This method will de-select all the options
      * @param element
      */
     public void deselectAllOptions(WebElement element)
     {
	     s = new Select(element);
	     s.deselectAll();
	 }
     
     /**
      * This method will help to accept the alert
      * @param driver
      */
     public void toAcceptAlert(WebDriver driver) 
     {
	     Alert alt = driver.switchTo().alert();
	     alt.accept();
	 }
     
     /**
      * This method will help to dismiss the alert
      * @param driver
      */
     public void toDismissAlert(WebDriver driver) 
     {
	     Alert alt = driver.switchTo().alert();
	     alt.dismiss();
	 }
     
     /**
      * This method will help to pass the alert msg
      * @param driver
      * @param msg
      */
     public void toPassAlertMsg(WebDriver driver, String msg) 
     {
		 Alert alt = driver.switchTo().alert();
		 alt.sendKeys(msg);
	 }
     
     /**
      * This method will help to read the alert msg
      * @param driver
      * @return
      */
     public String toFetchAalertMsg(WebDriver driver)
     {
    	 Alert alt = driver.switchTo().alert();
    	 String alertMsg = alt.getText();
    	 return alertMsg;
     }
     
     /**
      * This method will help us to perform the java script operations
      * @param driver
      * @param value
      */
     public void operationsWithJs(WebDriver driver, String value) 
     {
		 JavascriptExecutor jse = (JavascriptExecutor) driver;
		 jse.executeScript(value);
	 }
     
     /**
      * This method is use to capture the screenshot
      * @param driver
      * @param path
     * @throws Exception 	
      * @throws Exception
      */
     public void captureScreenshot( String path , String methodName , String extension) throws Exception 
     {
		 TakesScreenshot ts = (TakesScreenshot)BaseClass.driver;
		 File src = ts.getScreenshotAs(OutputType.FILE);
		 File dest = new File(path+methodName+extension);
		 Files.copy(src, dest);
	 }
     
     /**
      * This method is use to custom click
      * @param driver
      * @param element
      * @param time
     * @throws Exception 
      * @throws Exception
      */
     public void ifElementClickFails(WebDriver driver, WebElement element, int time) throws Exception 
     {
		 int count = 0;
		 int reclickCount = 5;
		 while(count <= reclickCount)
		 {
			 element.click();
			 Thread.sleep(time);
			 break;
		 }
	 }
     
     /**
      * This method is to handle the window popup
      * @param driver
      */
     public void windowPopUpHandle(WebDriver driver) 
     {
		 String parentWindow = driver.getWindowHandle();
		 Set<String> allWindow = driver.getWindowHandles();
		 
		 Iterator<String> itr = allWindow.iterator();
		 while(itr.hasNext())
		 {
			 String values = itr.next();
			 String title = driver.switchTo().window(values).getTitle();
			 
			 if(title.contains(values))
			 {
				 break;
			 }
		 }
	 }
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
}    

