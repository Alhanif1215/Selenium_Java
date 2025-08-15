package genericUtility;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

	/**
	 * 
	 */
public class PropertiesUtility {
	
	/**
	 * This is a generic method to fetch data from properties file 
	 * @param key
	 * @return
	 * @throws IOException
	 */
	
	public String getDataFromPropertiesFile(String key) throws IOException 
	{
		FileInputStream fis = new FileInputStream(IPathUtility.propertiesPath);
		Properties prop = new Properties();
		prop.load(fis);
		String value = prop.getProperty(key);
		return value;
	}

}
