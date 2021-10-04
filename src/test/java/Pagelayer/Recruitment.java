package Pagelayer;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.aventstack.extentreports.Status;

import TestLayer.Main11;


	public class Recruitment extends Main11 {
		@FindBy(id="menu_recruitment_viewRecruitmentModule")WebElement RC;
		public void recruit() throws InterruptedException {
			RC.click();
			logger3.log(Status.PASS, "RecruitmentTab has open successfully");
			Thread.sleep(3000);
		}


}
