package Base;

import java.io.IOException;

import org.testng.ITest;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;

import com.aventstack.extentreports.MediaEntityBuilder;

import TestLayer.Main11;

public class failure extends Main11 {
	 @AfterMethod
		public void teardown(ITestResult result) throws IOException
		{
			
			try {
			if(ITestResult.FAILURE==result.getStatus())
			{
			String temp=Screenshot.Screenshot(driver, result.getName());
			
			logger7.fail("Testcase name "+ result.getName());
			logger7.fail(result.getThrowable().getMessage(), MediaEntityBuilder.createScreenCaptureFromPath(temp).build());
		    }}
			catch(Exception e)
			{
				System.out.println(e.getMessage());
			}
			
			
		}
		


}

	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 