package sample_Repo;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import genericLibOrUtlity.BaseClass;

public class Sample1 extends BaseClass
{
    @Test
    public void loginOperationCrossCheck()
    {
    	driver.findElement(By.xpath("hjghjghjghjg")).click();
    }
}
