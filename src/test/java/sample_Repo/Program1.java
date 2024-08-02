package sample_Repo;

import org.testng.annotations.Test;

//@Test 
public class Program1 
{
  @Test (priority = 1)
  public void createUser()
  {
	  System.out.println("cu");
  }
  @Test (priority = 2)
  public void modifyUser()
  {
	  System.out.println("mu");
  }
  @Test (priority = 3)
  public void deleteUser()
  {
	  System.out.println("du");
  }
}
