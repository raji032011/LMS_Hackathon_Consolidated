package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Base.BaseClass;
import utilities.ReadConfig;

public class Assignment_PageObject extends BaseClass {

	WebDriver ldriver;
	static ReadConfig config = new ReadConfig();
	public String searchassign = config.getsearchassign();
	public String assigndesc = config.assigndescription();
	public String assigngrade = config.assigngrade();
	public Assignment_PageObject(WebDriver rdriver) {
		ldriver = rdriver;
		PageFactory.initElements(rdriver, this);
	}

	// Assignment link
	@FindBy(xpath = "//span[normalize-space()='Assignment']")
	WebElement assignmentbutton;

	public void Assignmentbutton() {
		assignmentbutton.click();
	}

	// Manage assignment header

	@FindBy(xpath = "//div[normalize-space()='Manage Assignment']")
	WebElement manageassignment;

	public String manageassignment1() {
		return manageassignment.getText();
	}
		
	//Manageassignment footer
		
	@FindBy(xpath = "//div[@class='p-d-flex p-ai-center p-jc-between ng-star-inserted']")
	WebElement managefooter;

	public String manageassignmentfooter() {
		return managefooter.getText();

}
	
	@FindBy(xpath = "//input[@placeholder='Search...']")
	WebElement assignmentsearch;

	public Boolean Assignmentsearchbox() {
		return assignmentsearch.isDisplayed();
	}

	public void searchBox() {
		assignmentsearch.sendKeys(searchassign);
	}
	
	//edit button
	
	@FindBy(xpath = "//tbody/tr[1]/td[6]/div[1]/span[1]/button[1]/span[1]")
	WebElement assignmenteditbutton;

	
	public void assigneditbutton() {
		assignmenteditbutton.click();
	}
	
	//Assignmentdetails header
	
	@FindBy(xpath = "/html[1]/body[1]/app-root[1]/app-assignment[1]/p-dialog[1]/div[1]/div[1]/div[1]/span[1]")
	WebElement assignmentdetailsheader;

	
	public String assignheader() {
	return assignmentdetailsheader.getText();
	}
	
	//Assignment description and grade sendkeys
	
	@FindBy(xpath = "//input[@id='assignmentDescription']")
	WebElement assignmentdescription;
	public void assigndescription() {
		assignmentdescription.sendKeys(assigndesc);
	}
	
	@FindBy(xpath = "//input[@id='assignmentGraderId']")
	WebElement assignmentgrade;
	public void assignmentgrade1() {
		assignmentgrade.sendKeys(assigngrade);
	}
	
	//click save button
	
	@FindBy(xpath = "//span[normalize-space()='Save']")
	WebElement assignmentsave;
	
	public void Assignmentsavebutton() {
		assignmentsave.click();
	}
	
	//Asssignmentdelete
	
	@FindBy(xpath = "//tbody/tr[1]/td[6]/div[1]/span[2]/button[1]")
	WebElement assignmentdelete;
	
	public void assignmentdeletbutton() {
		assignmentdelete.click();
	}
	
	//ConfirmHeaderAssignment
	
	@FindBy(xpath = "//span[contains(text(),'Confirm')]")
	WebElement confirmheader;
	
	public String confirmassignmentheader() {
		return confirmheader.getText();
	}
	
	//No button
	
	@FindBy(xpath = "//body/app-root[1]/app-assignment[1]/p-confirmdialog[1]/div[1]/div[1]/div[3]/button[1]")
	WebElement confirmnobutton;
	
	public Boolean confirmnobuttondisplay() {
		return confirmnobutton.isDisplayed();
	}
	//Yes button
	@FindBy(xpath = "//body/app-root[1]/app-assignment[1]/p-confirmdialog[1]/div[1]/div[1]/div[3]/button[2]")
	WebElement confirmyesbutton;
	
	public Boolean confirmyesbuttondisplay() {
		return confirmyesbutton.isDisplayed();
	}
	
	public void confirmyesbuttonclick() {
		confirmyesbutton.click();
	}	
	
	//Message delete successful
	
	@FindBy(xpath = "//div[contains(text(),'Successful')]")
	WebElement deletesuccessful;
	
	public String confirmdeletesuccess() {
		return deletesuccessful.getText();
	}
	
}