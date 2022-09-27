package PageObjects;

import java.time.Duration;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Base.BaseClass;
import utilities.ReadConfig;

public class BatchEdit_PageObject extends BaseClass{

	WebDriver ldriver;
	static ReadConfig config = new ReadConfig();
	public String searchBatch = config.getSearchBatch();
	public String editBatchDescrip = config.getEditbatchDescription();
	public String editNoOfClasses = config.EditBatchNoOfClasses();
	public String selectedBatchName;

	public BatchEdit_PageObject(WebDriver rdriver) {
		ldriver = rdriver;
		PageFactory.initElements(rdriver, this);
	}

	// Search Box
	@FindBy(xpath = "//input[@placeholder='Search...']")
	WebElement searchBox;

	public void searchBox() {
		searchBox.sendKeys(searchBatch);
	}
	
	// 1 Check Delete Check box
	@FindBy(xpath="//tbody/tr[1]/td")
	WebElement checkDelete1;
	// 2  Check Delete Check box
	@FindBy(xpath="//tbody/tr[3]/td")
	WebElement checkDelete3;
	// Select 1 and 3 check box
	public void DeleteCheckBOx() {
		checkDelete1.isSelected();
		checkDelete1.click();
		checkDelete3.isSelected();
		checkDelete3.click();
					}
	
	// Delete confirm PopUp 
	@FindBy(xpath="//div[@class='p-dialog-header ng-tns-c133-16 ng-star-inserted']/span")
	WebElement DeleteConfirm;
	public void DeleteConfirm() {
		DeleteConfirm.getText();
	}
	// Delete Confirm Yes Button 
	@FindBy(xpath="//button[@ng-reflect-label='Yes']")
	WebElement yesDeleteConfirm;
	public void YesDeleteConfirm() {
		yesDeleteConfirm.click();
	}
	
	public void searchUpdatedBatch(String BatchName) {
		System.out.println("in SearchUpdateBatch method - updated batch name is:"+BatchName);
		searchBox.isSelected();
		searchBox.sendKeys(BatchName);
	}
	// close Suceessful Upadte Msg   
		@FindBy(xpath = "//button[@type='button']")
		WebElement closeButton;

		public void closeButton() {
			closeButton.click();
		}

	// Clear Search Box
	@FindBy(xpath = "//input[@placeholder='Search...']")
	WebElement searchBox1;

	public void searchBox1() {
		searchBox1.clear();
	}

	// Edit button
	@FindBy(xpath = "//tbody/tr[3]/td[7]/div/span")
	WebElement editButt;

	public void EditButton() {
		editButt.click();
	}
	
	// Updated batch Edit button
	@FindBy(xpath = "//tbody/tr[1]/td[7]/div/span")
	WebElement updEditButt;

	public void UpdatedEditButton() {
		updEditButt.click();
	}

	// Delete Button
	@FindBy(xpath = "//tbody/tr[4]/td[7]/div/span/button[@icon=\"pi pi-trash\"]")
	WebElement deleteButt;

	public void DeleteBatchButton() {
		deleteButt.click();
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

	// Showing entries
	@FindBy(xpath = "//span[@class='p-paginator-current ng-star-inserted']")
	WebElement Entries;

	public String ShowEntries() {
		return Entries.getText();
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

	// A New Batch Button
	@FindBy(xpath = "//button[@id='new']")
	WebElement ANewbatch;

	public void ANewbatch() {
		ANewbatch.click();
	}

	// All check box
	@FindBy(xpath = "//thead[@class='p-datatable-thead']//div[@role='checkbox']")
	WebElement Allcheckbox;

	// Validate Batch Details
	@FindBy(xpath = "//span[@id='pr_id_5-label']")
	WebElement batchdetails;

	public String ValidateBatchDetails() {
		return batchdetails.getText();
	}

	// Edit BatchDescription in Batch Details
	@FindBy(xpath = "//input[@id='batchDescription']")
	WebElement batchDescription;

	public void getBatchDetails()
	{
		GetBDetailsName.isSelected();

		selectedBatchName = GetBDetailsName.getAttribute("value");
		System.out.println("Get Batch Details Name: "+selectedBatchName);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		batchDescription.isSelected();
		System.out.println("Get Batch Details Description: "+batchDescription.getAttribute("value"));
	}
	public void EditbatchDescription() {

		batchDescription.isSelected();
		System.out.println("Edit Batch current Description: "+batchDescription.getAttribute("value"));
		batchDescription.clear();
		try
		{
		batchDescription.sendKeys(editBatchDescrip);
		}catch(org.openqa.selenium.StaleElementReferenceException ex)
		{
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
			batchDescription.isSelected();
			batchDescription.clear();
			batchDescription.sendKeys(editBatchDescrip);
			
		}
	}
	
		public String GetbatchDescription() {
			batchDescription.isSelected();
			return batchDescription.getAttribute("value");
	}
	//   Batch Details Name get Text
		@FindBy(xpath = "//input[@id='batchName']")
		WebElement GetBDetailsName;
		public String GetBDetailsName() {
			GetBDetailsName.isSelected();
			System.out.println("Getting Batch Name: "+GetBDetailsName.getAttribute("value"));
			return GetBDetailsName.getAttribute("value");}
		
		

	// Edit NoOfClasses in Batch Details
	@FindBy(xpath = "//input[@id='batchNoOfClasses']")
	WebElement batchNoOfClasses;

	public void EditBatchNoOfClasses() {
		batchNoOfClasses.isSelected();
		batchNoOfClasses.clear();
		batchNoOfClasses.sendKeys(editNoOfClasses);
	}
	public String getBatchNoOfClasses() {
		return batchNoOfClasses.getAttribute("value");
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

}