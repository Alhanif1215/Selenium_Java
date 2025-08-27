package genericUtility;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Random;

/**
 * This is a Utility class which has functionality from Java library
 */
public class JavaUtility {
	
	/**
	 * THis is generic method to fetch Calendar details for the given pattern
	 * @param pattern
	 * @return
	 */
	public String getCalenderDetails(String pattern)
	{
		Calendar cal = Calendar.getInstance();
		Date d = cal.getTime();
		SimpleDateFormat sdf = new SimpleDateFormat();
		String vlaue = sdf.format(d);
		return vlaue;
	}
	
	
	public int generateRandomNumbers(int bound)
	{
		Random r = new Random();
		int number = r.nextInt(bound);
		return number;
	}

}
