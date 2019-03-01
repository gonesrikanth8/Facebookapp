package Utilities;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class PropertiesUtilities {
	
	public static String getKeyValue(String key) throws FileNotFoundException, IOException
	{
		Properties configproperties = new Properties();
		try {
	

	configproperties.load( new FileInputStream(new File("./DataFolder/Environment.properties")));
	return configproperties.getProperty(key);
	}
		catch (Exception e)
		{
			System.out.println(e);
			return key;
		}
	
	}
}

