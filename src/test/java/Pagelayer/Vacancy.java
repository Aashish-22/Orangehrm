package Pagelayer;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

import com.aventstack.extentreports.Status;

import TestLayer.Main11;

public class Vacancy extends Main11{
	@FindBy(xpath="//a[text()='Vacancies']")WebElement Vacancy; //To click on vacany tab
	@FindBy(id="btnSrch")WebElement Search;// To click on Search button
	@FindBy(id="btnRst")WebElement Reset; //To click on Reset button
	@FindBy(id="btnAdd")WebElement Add; //to click on Add bttn
	@FindBy(id="addJobVacancy_name")WebElement Name; //To add job vacancy name
	@FindBy(id="addJobVacancy_hiringManager")WebElement HMN ;//to add hiring manager name
	@FindBy(id="addJobVacancy_noOfPositions")WebElement Positions; //To add number of posistion
	@FindBy(id="btnSave")WebElement Save;
	public void Vacc() throws InterruptedException {
		Vacancy.click();
		logger5.log(Status.PASS, "Vacancies Tab as been opened Succesfully");
		Thread.sleep(2000);
		
		//To Select !st Vacancy
		Select JobTitle=new Select(driver.findElement(By.id("vacancySearch_jobTitle"))); //To select Job title
		JobTitle.selectByVisibleText("Account Assistant");
		logger5.log(Status.PASS, "Job Title  has been Selected Succesfully");
		Thread.sleep(2000);
		
	
		Select Vacancy= new Select(driver.findElement(By.id("vacancySearch_jobVacancy")));// TO SELECT VACANCY
		Vacancy.selectByVisibleText("Junior Account Assistant");
		logger5.log(Status.PASS, "Job Vacancy  has been Selected Succesfully");
		Thread.sleep(2000);
		
		
		Select HiringManager= new Select(driver.findElement(By.id("vacancySearch_hiringManager"))); //TO SELECT HIRING MANAGER
		HiringManager.selectByVisibleText("Kevin Mathews");
		logger5.log(Status.PASS, "Hiring Manager  has been Selected Succesfully");
		Thread.sleep(2000);
		
		
		Select status=new Select(driver.findElement(By.id("vacancySearch_status")));// TO SELECT JOB STATUS
		status.selectByVisibleText("Active");
		logger5.log(Status.PASS, "Job Status  has been Selected Succesfully");
		Thread.sleep(2000);
		
		
		Search.click();// To click Search button
		logger5.log(Status.PASS, "Search button has been clicked successfully");
		Thread.sleep(4000);
		
		Reset.click(); //TO CLICK RESET BUTTON
		logger5.log(Status.PASS, "Reset button has been clicked successfully");
		Thread.sleep(2000);
		
		//TO SELECT 2ND VACANCY
		
		Select JobTitle1=new Select(driver.findElement(By.id("vacancySearch_jobTitle"))); //To select Job title
		JobTitle1.selectByValue("8");
		logger5.log(Status.PASS, "2nd Job Title  has been Selected Succesfully");
		Thread.sleep(2000);
		
	
		Select Vacancy1= new Select(driver.findElement(By.id("vacancySearch_jobVacancy")));// TO SELECT VACANCY
		Vacancy1.selectByVisibleText("Senior QA Lead");
		logger5.log(Status.PASS, "2nd Job Vacancy  has been Selected Succesfully");
		Thread.sleep(2000);
		
		
//		Select HiringManager1= new Select(driver.findElement(By.id("vacancySearch_hiringManager"))); //TO SELECT HIRING MANAGER
//		HiringManager1.selectByValue("2");
//		logger5.log(Status.PASS, "2nd Hiring Manager  has been Selected Succesfully");
//		Thread.sleep(2000);
//		
		
		Select status1=new Select(driver.findElement(By.id("vacancySearch_status")));// TO SELECT JOB STATUS
		status1.selectByVisibleText("Active");
		logger5.log(Status.PASS, "2nd Job Status  has been Selected Succesfully");
		Thread.sleep(2000);
		
		
		Search.click();// To click Search button
		logger5.log(Status.PASS, "Search button has been clicked successfully");
		Thread.sleep(4000);
		
		
		// TO ADD JOB VACANCY
		
		Add.click();
		logger5.log(Status.PASS,"Add Button has been clicked Successfully");
		
		Select AddVacancy=new Select(driver.findElement(By.id("addJobVacancy_jobTitle"))); //To add Job vacancy
		AddVacancy.selectByVisibleText("Chief Executive Officer");
		logger5.log(Status.PASS,"Job vacancy has been Added Successfully");
		Thread.sleep(2000);
		
		Name.sendKeys("Executive Officer");
		logger5.log(Status.PASS,"Vacancy name has been added Successfully");
		Thread.sleep(2000);
		
		HMN.sendKeys("PQR");
		logger5.log(Status.PASS,"HR manager name has been added Successfully");
		Thread.sleep(2000);

		Positions.sendKeys("5");
		logger5.log(Status.PASS,"Number of position has been added Successfully");
		Thread.sleep(2000);
		
		Save.click();
		logger5.log(Status.PASS, "Save button has been  clicked successfully");
		Thread.sleep(2000);
}

}
