package apitests;

import org.apache.commons.lang3.RandomStringUtils;

public class RestUtils {
	
	
	public static String getFirstname()
	{
		String generatedstring = RandomStringUtils.randomAlphanumeric(1);
		return ("John" + generatedstring);
	}

	public static String getLasttname()
	{
		String generatedstring = RandomStringUtils.randomAlphanumeric(1);
		return ("Kenedy" + generatedstring);
	}

	public static String getUsername()
	{
		String generatedstring = RandomStringUtils.randomAlphanumeric(3);
		return ("John" + generatedstring);
	}
	public static String getPassword()
	{
		String generatedstring = RandomStringUtils.randomAlphabetic(3);
		return ("John" + generatedstring);
	}
	public static String getEmail()
	{
		String generatedstring = RandomStringUtils.randomAlphabetic(3);
		return ( generatedstring + "gmail.com");
	}

	public static String getEmpName()
	{
		String generatedstring = RandomStringUtils.randomAlphabetic(1);
		return ("John" + generatedstring);
	}
	public static String getAge()
	{
		String generatedstring = RandomStringUtils.randomNumeric(2);
		return  (generatedstring);
	}
	
	public static String getSalary()
	{
		String generatedstring = RandomStringUtils.randomNumeric(5);
		return  (generatedstring) ;
	}
	
}

