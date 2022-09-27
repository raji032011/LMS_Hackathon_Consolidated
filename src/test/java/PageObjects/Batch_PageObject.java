package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.ReadConfig;

public class Batch_PageObject {

	WebDriver ldriver;
	static ReadConfig config = new ReadConfig();
	public String searchBatch = config.getSearchBatch();

	public Batch_PageObject(WebDriver rdriver) {
		ldriver = rdriver;
		PageFactory.initElements(rdriver, this);
	}

	// MENU BAR BUTTON
	// Program Button
	@FindBy(xpath = "//button[@ng-reflect-router-link='/program']")
	WebElement ProgramBut;

	public void ProgramButton() {
		ProgramBut.click();
	}

	// Batch Button
	@FindBy(xpath = "//button[@ng-reflect-router-link='/batch']")
	WebElement BatchBut;

	public void BatchButton() {
		BatchBut.click();
	}

	// User Button
	@FindBy(xpath = "//button[@ng-reflect-router-link='/user']")
	WebElement UserBut;

	public void UserButton() {
		UserBut.click();
	}

	// Assignment Button
	@FindBy(xpath = "//button[@ng-reflect-router-link='/assignment']")
	WebElement assignmentBut;

	public void AssignmentButton() {
		assignmentBut.click();
	}

	// Attendence
	@FindBy(xpath = "//button[@ng-reflect-router-link='/attendance']")
	WebElement AttendenceBut;

	public void AttendenceButton() {
		AttendenceBut.click();
	}

	// logout Button
	@FindBy(xpath = "//button[@class='mat-focus-indicator mat-button mat-button-base ng-star-inserted']")
	WebElement LogoutBut;

	public void LogoutButton() {
		LogoutBut.click();
	}

	// ELEMENTS ON MANAGE BATCH
	// Search Box
	@FindBy(xpath = "//input[@placeholder='Search...']")
	WebElement searchBox;

	public void searchBox() {
		searchBox.sendKeys(searchBatch);
	}

	// Clear Search Box
	@FindBy(xpath = "//input[@placeholder='Search...']")
	WebElement searchBox1;

	// A New Batch Button
	@FindBy(xpath = "//button[@id='new']")
	WebElement ANewbatch;

	public void ANewbatch() {
		ANewbatch.click();
	}

	// All Delete Button
	@FindBy(xpath = "//button[@ng-reflect-icon='pi pi-trash']")
	WebElement AllDeleteBut;

	public void AllDeleteButtonDisplayed() {
		AllDeleteBut.isDisplayed();
	}

	public void AllDeleteButtonClick() {
		AllDeleteBut.click();
	}

	// Batch Name
	@FindBy(xpath = "//thead[@class='p-datatable-thead']/tr/th[@psortablecolumn='batchName']")
	WebElement BatchName;

	public void BatchName() {
		BatchName.click();
	}

	// Batch Description
	@FindBy(xpath = "//thead[@class='p-datatable-thead']/tr/th[@psortablecolumn='batchDescription']")
	WebElement BatchDescription;

	public void BatchDescription() {
		BatchDescription.click();
	}

	// batchStatus
	@FindBy(xpath = "//thead[@class='p-datatable-thead']/tr/th[@psortablecolumn='batchStatus']")
	WebElement batchStatus;

	public void BatchStatus() {
		batchStatus.click();
	}

	// No Of classes
	@FindBy(xpath = "//thead[@class='p-datatable-thead']/tr/th[@psortablecolumn='batchNoOfClasses']")
	WebElement NoOfclasses;

	public void NoOfclasses() {
		NoOfclasses.click();
	}

	// Program Name
	@FindBy(xpath = "//thead[@class='p-datatable-thead']/tr/th[@psortablecolumn='programName']")
	WebElement programName;

	public void ProgramName() {
		programName.click();
	}

	// Edit Delete
	@FindBy(xpath = "//thead[@class='p-datatable-thead']/tr/th[text()=' Edit Delete ']")
	WebElement editDelete;

	public void EditDelete() {
		editDelete.click();
	}

	// All check box
	@FindBy(xpath = "//thead[@class='p-datatable-thead']//div[@role='checkbox']")
	WebElement Allcheckbox;

	// Edit button
	@FindBy(xpath = "//tbody/tr[3]/td[7]/div/span")
	WebElement editButt;

	public void EditButton() {
		editButt.click();
	}

	// Delete Button
	@FindBy(xpath = "//tbody/tr[4]/td[7]/div/span/button[@icon=\"pi pi-trash\"]")
	WebElement deleteButt;

	public void DeleteBatchButton() {
		deleteButt.click();
	}

	// Validate Batch Details
	@FindBy(xpath = "//span[@id='pr_id_5-label']")
	WebElement batchdetails;

	public String ValidateBatchDetails() {
		return batchdetails.getText();
	}

	// Edit Name in Batch Details
	@FindBy(xpath = "//input[@id='batchName']")
	WebElement editBatchName;

	public void EditBatchName() {
		editBatchName.sendKeys("SDET 100A");
	}

	// Edit Status in Batch Details
	@FindBy(xpath = "//div[@class='p-radiobutton-box']")
	WebElement editBatchStatus;

	public void EditBatchStatus() {
		editBatchStatus.click();
	}

	// cancel Button in Batch Details
	@FindBy(xpath = "//div/button[@label='Cancel']")
	WebElement cancelBut;

	public void CancelButtonEditBatch() {
		cancelBut.click();
	}

	// Save Button in Batch Details
	@FindBy(xpath = "//div/button[@label='Save']")
	WebElement saveButton;

	public void SaveButtonEditBatch() {
		saveButton.click();
	}

	// Validating Updated message in Batch Details
	@FindBy(xpath = "//div[@role='alert']//div/div[@class='p-toast-detail ng-tns-c90-19']")
	WebElement Upadtedmessge;

	public String SuceessfullyUpadtedMessgeEdit() {
		return Upadtedmessge.getText();
	}

	// validating Search
	@FindBy(xpath = "//tbody/tr/td[2]")
	WebElement ValdSearch;

	public String validatingSearch() {
		return ValdSearch.getText();
	}

	// Showing entries
	@FindBy(xpath = "//span[@class='p-paginator-current ng-star-inserted']")
	WebElement Entries;

	public String ShowEntries() {
		return Entries.getText();
	}

	public void searchBox1() {
		searchBox1.clear();
	}

}