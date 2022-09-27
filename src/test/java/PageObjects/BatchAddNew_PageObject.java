package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BatchAddNew_PageObject {

	WebDriver ldriver;

	public BatchAddNew_PageObject(WebDriver rdriver) {
		ldriver = rdriver;
		PageFactory.initElements(rdriver, this);
	}

	// VAlidating add Batch Details Button
	@FindBy(xpath = "//span[@id='pr_id_11-label']")
	WebElement ValBatchDetal;

	public String ValBatchDetails() {
		return ValBatchDetal.getText();
	}

	// Add No Of Classes
	@FindBy(xpath = "//input[@id='batchNoOfClasses']")
	WebElement batchNoOfClasses;

	public void BatchNoOfClasses(String NoOFClasses) {
		batchNoOfClasses.sendKeys(NoOFClasses);
	}

	// Save Button Add Details
	@FindBy(xpath = "//button[@label='Save']")
	WebElement AddSaveButton;

	public void AddSaveButton() {
		AddSaveButton.click();
	}

	// Drop clcik Program Name
	//@FindBy(xpath = "//div[@class='p-dropdown-trigger ng-tns-c101-35']/span")
    @FindBy(xpath = "//div[@aria-haspopup='listbox']")
	WebElement Dropprogramname;

	public void DropAddBAtchProgramName() {
	//	Dropprogramname.isSelected();
		Dropprogramname.click();
	}
	// Program Name    
		@FindBy(xpath = "//input[@placeholder='Select a Program name']")
		WebElement addBatchProgramName;

		public void AddBatchProgramName() {
			//addBatchProgramName.isSelected();
			//addBatchProgramName.click();
			addBatchProgramName.sendKeys("Oracle");
			}

	// Add Name in Batch Details

		@FindBy(xpath = "//input[@id='batchName']")
		WebElement AddBatchName;

	public void AddBatchName(String Name) {
		AddBatchName.sendKeys(Name);
	}

	// Add Description in Batch Details
	@FindBy(xpath = "//input[@id='batchDescription']")
	WebElement AddbatchDescription;

	public void AddBatchDescription(String description) {
		AddbatchDescription.sendKeys(description);
	}

	// Add Active Radio
	@FindBy(xpath = "//p-radiobutton[@ng-reflect-input-id='ACTIVE']")
	WebElement activeRadioButt;

	public void ActiveRadioButton() {
		activeRadioButt.click();
	}

	// Add InActive Radio
	@FindBy(xpath = "//p-radiobutton[@ng-reflect-input-id='INACTIVE']")
	WebElement inactiveRadioButt;

	public void InActiveRadioButton() {
		inactiveRadioButt.click();
	}

}
