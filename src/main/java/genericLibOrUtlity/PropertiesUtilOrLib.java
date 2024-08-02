package genericLibOrUtlity;

import java.io.FileInputStream;
import java.util.Properties;

public class PropertiesUtilOrLib 
{
   public String getDataFromProperties(String data) throws Exception
   {
	   FileInputStream fis = new FileInputStream(IconstantUtilityProgram.propertiesPath);
	   Properties pobj = new Properties();
	   pobj.load(fis);
	   
	   String info = pobj.getProperty(data);
	   return info;
   }
}
