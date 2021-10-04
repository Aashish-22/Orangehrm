package Pagelayer;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.aventstack.extentreports.Status;

import TestLayer.Main11;

public class login extends Main11{

		@FindBy(xpath="//input[@name='txtUsername']") WebElement ID;
		@FindBy(xpath="//input[@name='txtPassword']")WebElement Passwd;
		@FindBy(xpath="//input[@id='btnLogin']")WebElement Submit;

		static Properties prop;

	public static void load_property_file()throws IOException
	{
	prop = new Properties();



	try {
	InputStream input=new FileInputStream(System.getProperty("user.dir")+"\\src\\test\\java\\Base\\Detail.prop");
	prop.load(input);

	} catch (FileNotFoundException e) {

	e.printStackTrace();
	}
	}

	public static String getobject(String Data) throws IOException
	{
	load_property_file();
	String data= prop.getProperty(Data);
	return data;
	}

		
		public void logiin() throws InterruptedException, IOException{
			driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);

			ID.sendKeys(getobject("Id"));
			logger2.log(Status.PASS, "Username has entered successfully");  
			Thread.sleep(3000);
			Passwd.sendKeys(getobject("Password"));
			logger2.log(Status.PASS,"Password has been entered Successfully");
			Thread.sleep(2000);
			Submit.click();
			logger2.log(Status.PASS,"Submit button has been click successfully");
			
		}

	
}
