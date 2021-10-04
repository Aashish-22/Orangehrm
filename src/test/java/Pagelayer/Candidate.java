package Pagelayer;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.InputEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

import com.aventstack.extentreports.Status;

import TestLayer.Main11;

public class Candidate extends Main11{

	@FindBy(id="btnSrch")WebElement Search; 	//TO SEARCH THE CANDIDATE
	@FindBy(xpath="//a[text()='Download']")WebElement Download;  //TO DOWNLOAD CANDIDATE RESUME
	@FindBy(id="candidateSearch_fromDate")WebElement Calender;	//TO SEARCH CANDIDATE FROM APPLIATION DATE
	@FindBy(xpath="//*[text()='8']") WebElement day;	//TO SEARCH CANDIDATE FROM DAY IN CALENDER
	@FindBy(id="btnAdd")WebElement Add;  //TO ADD CANDIDATES
	@FindBy(id="addCandidate_firstName")WebElement FirstName;	//TO ADD CANDIDATES 1ST NAME
	@FindBy(id="addCandidate_middleName")WebElement MiddleName;	//TO ADD CANDIDATE 2ND NAME
	@FindBy(id="addCandidate_lastName")WebElement LasttName;	//TO ADD CANDIDTAES LAST NAME
	@FindBy(id="addCandidate_email")WebElement Email;		//TO ADD CANDIDATES MAIL
	@FindBy(id="addCandidate_consentToKeepData")WebElement chckbox;
	@FindBy(id="btnSave")WebElement Save;
	@FindBy(id="ohrmList_chkSelectRecord_26_5")WebElement CBD; //Check box to delete data
	@FindBy(id="btnDelete")WebElement Delete; //To delete the data
	@FindBy(id="menu_recruitment_viewCandidates")WebElement Candidates; //to click on candidate tab
	@FindBy(id="dialogDeleteBtn")WebElement d;
	public void cand() throws InterruptedException, AWTException {
		
	Thread.sleep(4000);	
		Select JobTitle=new Select(driver.findElement(By.id("candidateSearch_jobTitle"))); //To select job title
		JobTitle.selectByVisibleText("Support Specialist");
		logger4.log(Status.PASS, "Job Title has been Selected Successfully ");
		
		Thread.sleep(2000);		
		Select Vacancy=new Select(driver.findElement(By.id("candidateSearch_jobVacancy"))); //To select vacancy
		Vacancy.selectByVisibleText("Senior Support Specialist");
		logger4.log(Status.PASS, "Job Vacancy has been Selected Successfully ");
		
		
		Select HiringManager = new Select(driver.findElement(By.id("candidateSearch_hiringManager")));//To select hirimg amager
		HiringManager.selectByVisibleText("Dominic Chase");
		logger4.log(Status.PASS, "Hiring Manager has been Selected Successfully ");
		Thread.sleep(2000);		
		
		
		Select status = new Select(driver.findElement(By.id("candidateSearch_status")));//To check Status
		status.selectByVisibleText("Shortlisted");
		logger4.log(Status.PASS, "Job Title has been Selected Successfully ");
		Thread.sleep(2000);		
		
		
		Search.click();// to click search button
		logger4.log(Status.PASS, "Search button has been Selected Successfully ");
		Thread.sleep(2000);		
		
		
		Download.click();
		logger4.log(Status.PASS, "Download has been Selected Successfully ");
		Thread.sleep(2000);
		
		//TO SEARCH 2ND CANDIDATE
		
		Select JobTitle1=new Select(driver.findElement(By.id("candidateSearch_jobTitle"))); //To select job title
		JobTitle1.selectByVisibleText("Software Engineer");
		logger4.log(Status.PASS, "Job Title has been Selected Successfully ");
		Thread.sleep(2000);		
		
		
		Select Vacancy1=new Select(driver.findElement(By.id("candidateSearch_jobVacancy"))); //To select vacancy
		Vacancy1.selectByVisibleText("Software Engineer");
		logger4.log(Status.PASS, "Job Vacancy has been Selected Successfully ");
		Thread.sleep(2000);		
		
		
//		Select HiringManager1 = new Select(driver.findElement(By.id("candidateSearch_hiringManager")));//To select hirimg amager
//		HiringManager1.selectByValue("2");
//		logger4.log(Status.PASS, "Hiring Manager has been Selected Successfully ");
//		Thread.sleep(2000);		
//		
		
		Select status1 = new Select(driver.findElement(By.id("candidateSearch_status")));//To check Status
		status1.selectByVisibleText("Shortlisted");
		logger4.log(Status.PASS, "Job Status has been Selected Successfully ");
		Thread.sleep(2000);		
		
		
		Calender.click();//to click on calendwr
		logger4.log(Status.PASS, "Calender has been Selected Successfully ");
		Thread.sleep(2000);		
		
		
		Select Month = new Select(driver.findElement(By.className("ui-datepicker-month")));//TO SELECT MONTH
		Month.selectByVisibleText("Oct");
		logger4.log(Status.PASS, "Month has been Selected Successfully ");
		Thread.sleep(2000);		
		
		
		
		Select Year = new Select(driver.findElement(By.className("ui-datepicker-year")));// TO SELECT YEAR
		Year.selectByValue("2020");
		logger4.log(Status.PASS, "Year has been Selected Successfully ");
		Thread.sleep(2000);		
		
		
	day.click();// to click 8 date
	logger4.log(Status.PASS, "Date has been Selected Successfully ");
	Thread.sleep(2000);		
	
	Search.click();// to click search button
	logger4.log(Status.PASS, "Search button has been Selected Successfully ");
	Thread.sleep(2000);		
	
	//To Add Data
	
	Add.click();//to click add button
	logger4.log(Status.PASS, "Add button has been click Successfully ");
	Thread.sleep(2000);		
	
	// TO ADD DETAILS
	FirstName.sendKeys("A");
	logger4.log(Status.PASS, "First Name has been Entered Successfully ");
	Thread.sleep(2000);		
	MiddleName.sendKeys("B");
	logger4.log(Status.PASS, "Middle Name has been Entered Successfully ");
	Thread.sleep(2000);		
	LasttName.sendKeys("C");
	logger4.log(Status.PASS, "last Name has been Entered Successfully ");
	Thread.sleep(2000);		
	Email.sendKeys("admin@example.com");
	logger4.log(Status.PASS, "Email has been Entered Successfully ");
	Thread.sleep(2000);		
	Select jobvacancy = new Select(driver.findElement(By.id("addCandidate_vacancy")));//To select job vacany field
	jobvacancy.selectByValue("5");
	logger4.log(Status.PASS, "Job Vacancy has been Entered Successfully ");
	Thread.sleep(2000);		
	chckbox.click();// to click checkbox
	logger4.log(Status.PASS, "Check box has click Successfully ");
	Thread.sleep(2000);		
	Save.click();// to click save button
	logger4.log(Status.PASS, "Save button has been click Successfully ");
	Thread.sleep(2000);		
	
	
	//To delete data
	Candidates.click();
	logger4.log(Status.PASS, "Candidate tab has been click Successfully ");
	Thread.sleep(2000);		
	
	
	CBD.click();
	logger4.log(Status.PASS, "Checkbox to delete data has been click Successfully ");
	Thread.sleep(2000);		
	
	Delete.click();
	logger4.log(Status.PASS, " delete data has been click Successfully ");
	Thread.sleep(2000);		

	//Using robot class for delete confirmation
	Point p = d.getLocation();
	System.out.println("Position of X-axis is :-" +p.getX());
	System.out.println("Position of Y-axis is :-" +p.getY());
	Robot r = new Robot();
	r.mouseMove(p.getX(), p.getY());
    r.mousePress(InputEvent.BUTTON1_DOWN_MASK);
    r.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);


//	
	}
	
}

