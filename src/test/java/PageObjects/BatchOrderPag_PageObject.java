package PageObjects;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Base.BaseClass;

public class BatchOrderPag_PageObject extends BaseClass {

	WebDriver ldriver;
	// Actions a = new Actions(driver);

	public BatchOrderPag_PageObject(WebDriver rdriver) {
		ldriver = rdriver;
		PageFactory.initElements(rdriver, this);
	}

	// bpo - ShowEnter batchname status descrpi noofClasses programname

	// First Pageination
	@FindBy(xpath = "//button[@class='p-paginator-first p-paginator-element p-link p-ripple ng-star-inserted']")
	WebElement firstpage;

	public void FirstPage() {
		firstpage.click();
	}

	// Previous Pageination //button[@class="p-paginator-prev p-paginator-element
	// p-link p-ripple"]
	@FindBy(xpath = " //button[@class='p-paginator-prev p-paginator-element p-link p-ripple']")
	WebElement previouspage;

	public void PreviousPage() {
		previouspage.click();
	}

	// Next Pageination
	@FindBy(xpath = "//button[@class='p-paginator-next p-paginator-element p-link p-ripple']")
	WebElement nextpage;

	public void NextPage() {
		nextpage.click();
	}

	// Last Pageination
	@FindBy(xpath = "//button[@class='p-paginator-last p-paginator-element p-link p-ripple ng-star-inserted']")
	WebElement lastpage;

	public void LasttPage() {
		lastpage.click();
	}

	// Capture Manage Batch text
	@FindBy(xpath = "//div[@class='box']")
	WebElement capMngBatch;

	public String CaptureManageBatch() {
		return capMngBatch.getText();
	}
	
	// Get Batch Page Number 
	@FindBy(xpath="//button[contains(@class,'highlight')]")
	WebElement PageNumber;
	
	public String  getBatchPageNumber() {
		return PageNumber.getText();
	}
	
	// Ascending/Descending Order for Status
	
	@FindBy(xpath = "//tbody/tr/td[4]")
	WebElement statusOrder;
	
	public String StatusOrder() {
		return statusOrder.getText();
	}
	
	// NoOFClasses for Order 
		@FindBy(xpath = "//tbody/tr/td[5]")
	WebElement noOfClassesOrder;
	public String NoOfClassesOrder() {
		return noOfClassesOrder.getText();
	}
	
	// Get All WebElements

	public List<WebElement> getAllElements() {
		List<WebElement> Element = driver.findElements(By.xpath("//table/tbody/tr"));
		return Element;
	}

	public String GetElementBatchName(int i) {
		String BatchName = driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td")).getText();
		return BatchName;
	}

	public String sortTableDateAsc(String sortType) {

		List<String> displayedNames = new ArrayList<String>();
		List<String> sortedNames = new ArrayList<String>();
		List<WebElement> Element = getAllElements();
		int size = Element.size();
		String isSorted = "true";
		for (int i = 1; i < size; i++) { // Get all the Batch names
			String str;
			str = GetElementBatchName(i);
			displayedNames.add(str); // Added as they are displayed
			sortedNames.add(str); // Add each name as we find it
		} // for

		if (sortType == "Asc") {
			Collections.sort(sortedNames);
		} else {
			Collections.sort(sortedNames, Collections.reverseOrder());
		}
		if (!displayedNames.equals(sortedNames)) {
			isSorted = "false";
			System.out.println("Batch name is not sorted");
		}
		return isSorted;
	}
}
