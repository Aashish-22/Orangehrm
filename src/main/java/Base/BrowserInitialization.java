package Base;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import com.aventstack.extentreports.Status;

import TestLayer.Main11;

public class BrowserInitialization extends Main11 {
	public void Brows() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C://Selenium//chromedriver1.exe");
		driver=new ChromeDriver();
		
		driver.get("https://opensource-demo.orangehrmlive.com");
		logger1.log(Status.PASS, "Website has launch Successfully");
		Thread.sleep(4000);
		driver.manage().window().maximize();
		logger1.log(Status.PASS, "Maximize successfully");
		Thread.sleep(4000);
		
		System.out.println(driver.getTitle());
		String Actual_Title="OrangeHRM";
		Assert.assertEquals(Actual_Title, driver.getTitle());
		logger1.log(Status.PASS," Assertion has performed Successfully");
			
	}
	}


