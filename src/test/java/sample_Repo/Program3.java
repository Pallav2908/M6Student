package sample_Repo;

import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

public class Program3 
{
    @Ignore
    @Test
    public void createUser()
    {
    	System.out.println("cu");
    }
    
    @Test(priority = 2, dependsOnMethods = ("createUser"))
    public void modifyUser()
    {
    	System.out.println("mu");
    }
    
}
