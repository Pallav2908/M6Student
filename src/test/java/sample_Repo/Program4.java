package sample_Repo;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Program4 
{
    @Test
    public void strictLevelComparison()
    {
    	String expectedValue = "raja";
        String actualValue = "Raja";
      //String actualValue = "raja";
    	Assert.assertEquals(actualValue, expectedValue);
    	System.out.println("assertion passed!!");
    }
    
    @Test
    public void containsLevel()
    {
    	String expectedValue = "raja";
        String actualValue = "MahaRaja";
      //String actualValue = "Maharaja";
        Assert.assertTrue(actualValue.contains(expectedValue));
        System.out.println("contains passed!!");
    }
}
