package CommonFunctional;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import Utilities.PropertiesUtilities;

public class FunctionalLibrary 
{
	
	static WebDriver driver;
	
	public static  void OpenBrowser() throws Throwable, Throwable
	{
		if (PropertiesUtilities.getKeyValue("Browser").equalsIgnoreCase("chrome") )
		{
			driver = new ChromeDriver();
			driver.manage().window().maximize();
		}
		if (PropertiesUtilities.getKeyValue("Browser").equalsIgnoreCase("Firefox") )
		{
			driver = new FirefoxDriver();
			driver.manage().window().maximize();
		}
	
	}
	public static void OpenURL()
	{
		try {
			driver.get(PropertiesUtilities.getKeyValue("URL"));
		} catch (IOException e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
		
		public static void ClickAction(String Locater_Type, String Locater_Value)
		{
			if(Locater_Type.equalsIgnoreCase("id"))
					{
				driver.findElement(By.id(Locater_Value)).click();
					}
			if(Locater_Type.equalsIgnoreCase("name"))
			{
				driver.findElement(By.name(Locater_Value)).click();
			}
			if(Locater_Type.equalsIgnoreCase("xpath"))
			{
				driver.findElement(By.xpath(Locater_Value)).click();
			}
		}
		public static void SendValue(String Locater_Type, String Locater_Value,String Data)
		{
			if(Locater_Type.equalsIgnoreCase("id"))
				{
			driver.findElement(By.id(Locater_Value)).sendKeys(Data);
				}
				if(Locater_Type.equalsIgnoreCase("name"))
		{
			driver.findElement(By.name(Locater_Value)).sendKeys(Data);
		}
		if(Locater_Type.equalsIgnoreCase("xpath"))
		{
			driver.findElement(By.xpath(Locater_Value)).sendKeys(Data);
		}
		}

}
