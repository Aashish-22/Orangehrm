package Pagelayer;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.aventstack.extentreports.Status;

import TestLayer.Main11;

public class logout extends Main11 {
	@FindBy(id="welcome")WebElement Welcome;
	@FindBy(xpath="//a[text()='Logout']")WebElement logout;
	public void wc() throws InterruptedException {
		Welcome.click();
	logger6.log(Status.PASS, "Welcome button has been clicked successfully");
		Thread.sleep(2000);
		
		logout.click();
		logger6.log(Status.PASS, "Logout button has been clicked Successfully");
		Thread.sleep(2000);
		
		
	
}


}
