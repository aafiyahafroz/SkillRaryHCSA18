package GenericLibraries;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

/**
 * this class contains reusable methods to perform actions on Properties file
 * @author Aafiyah
 *
 */
public class PropertiesUtility {
// used to fetch data from property file
	
	private Properties property;//making it private so that classes dont access directly
	
	/**
	 * this method is uded to initialize properties file
	 * @param filePath
	 */
	
	public void propertiesInitialization(String filePath)
	{
		FileInputStream fis=null;// global declaration so that it can be accessed outside
		try {
		fis=new FileInputStream(filePath);//not using throws bcoz it will go till the end of the script so using try-catch
		}
		catch(FileNotFoundException e)
		{
			e.printStackTrace();
		}
		property=new Properties();
		
		try
		{
			property.load(fis);
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}
	}
	/** this method is used to read data from properties file
	 * 
	 * @param key
	 * @return
	 */
		public String fetchProperty(String key)
		{
			return property.getProperty(key);
		}
		
	}

