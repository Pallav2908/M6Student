package genericLibOrUtlity;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Random;

/**
 * This is a class contains with all java related generic functions
 */
public class JavaLibrary 
{
    /**
     * This method is use to create random number
     * @para bound
     * @return
     */
	public int generateRandomNumber(int bound)
	{
		Random r = new Random();
		int num = r.nextInt(bound);
		return num;
	}
	
	/**
	 * This is a generic method to handle calendar
	 * @param formatType
	 * @return
	 */
	public String calendarHandling(String formatType)
	{
		Calendar cal = Calendar.getInstance();
		Date d = cal.getTime();
		SimpleDateFormat sdf = new SimpleDateFormat(formatType);
		String date = sdf.format(d);
		return date;
	}
}
