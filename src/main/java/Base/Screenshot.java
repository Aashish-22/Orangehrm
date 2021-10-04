package Base;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import TestLayer.Main11;

public class Screenshot extends Main11 {
	public static String  Screenshot(WebDriver driver,String screenshotname)
	{
		TakesScreenshot ts=(TakesScreenshot)driver;
		
		File source=ts.getScreenshotAs(OutputType.FILE);
		String path = System.getProperty("user.dir")+"/ProjectDemo_SC/"+screenshotname+".png";
		File destination= new File(path);
		
		
		try
		{
		FileUtils.copyFile(source, destination);
		}
		catch (Exception e)
		{   
			
		}
		return path;
		
		
		}
}
