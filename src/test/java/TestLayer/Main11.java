package TestLayer;

import java.awt.AWTException;
import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

import Base.BrowserInitialization;
import Base.Screenshot;
import Pagelayer.Candidate;
import Pagelayer.Recruitment;
import Pagelayer.Vacancy;
import Pagelayer.login;
import Pagelayer.logout;


public class Main11 {

	public static ExtentSparkReporter HTMLreporter=new ExtentSparkReporter("./Report/OrangehrmDemo");
public static ExtentReports Report=new ExtentReports();
public static ExtentTest logger1,logger2,logger3,logger4,logger5,logger6,logger7;
public static WebDriver driver;

@BeforeSuite
public void logger()
{
	Report.attachReporter(HTMLreporter);
	logger1=Report.createTest("Browser Initialization");
	logger2=Report.createTest("Login");
	logger3=Report.createTest("Recruitment Page");
	logger4=Report.createTest("Candidates Page");
	logger5=Report.createTest("Vacancies");
	logger6=Report.createTest("Logout");
	logger7=Report.createTest("Failed Test");
	
}
@Test(priority=1)
public void Step1() throws InterruptedException {
	BrowserInitialization broe=PageFactory.initElements(driver, BrowserInitialization.class);
	broe.Brows();
}


@Test(priority=2)

public void Step2() throws Exception {
	login lgn=PageFactory.initElements(driver, login.class);
	
	lgn.logiin();
	}

@Test(priority=8)
public void Step3() throws InterruptedException {
	Recruitment R=PageFactory.initElements(driver, Recruitment.class);
	R.recruit();
}
@Test(priority=4)
public void Step4() throws InterruptedException, AWTException {
	Candidate cand=PageFactory.initElements(driver, Candidate.class);
	cand.cand();
}
	@Test(priority=5)
	public void Step5()throws InterruptedException {
	 Vacancy v=PageFactory.initElements(driver, Vacancy.class);
	 v.Vacc();
	}
	 
	 @Test(priority=6)
	 public void Step8() throws InterruptedException {
	 logout lg=PageFactory.initElements(driver, logout.class);
	 lg.wc();
	 }
	 
//	 @Test(priority=3)
//	 public void Step9() throws InterruptedException {
//		 Timesheet t=PageFactory.initElements(driver, Timesheet.class);
//		 t.TS();
//	 }
//	 
	
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
		@AfterSuite
		public void tear() {
			
				Report.flush();
				driver.close();
				
			
	}
}




