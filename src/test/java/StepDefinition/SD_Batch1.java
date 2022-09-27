package StepDefinition;

import java.time.Duration;
import java.util.Set;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.asserts.SoftAssert;

import Base.BaseClass;
import PageObjects.BatchEdit_PageObject;
import PageObjects.Batch_PageObject;
import io.cucumber.java.en.*;
import utilities.ReadConfig;

public class SD_Batch1 extends BaseClass {

	Logger log = LogManager.getLogger("SD_Batch1.java");
	Batch_PageObject bpo = new Batch_PageObject(driver);
	BatchEdit_PageObject bepo = new BatchEdit_PageObject(driver);
	SoftAssert as = new SoftAssert();
	static ReadConfig config = new ReadConfig();
	public String searchBatch = config.getSearchBatch();
	String tittle;
	String URL;
	String result;
	
	@Given("user is at Manage program page")
	public void user_is_at_manage_program_page() {
		tittle = driver.getTitle();
		log.info("The Tittle of Manage Progrm page is :" + tittle);
		as.assertTrue(true);
	}

	@When("user click on Batch button")
	public void user_click_on_batch_button() {
		bpo.BatchButton();
	}

	@Then("user is at Manage Batch page")
	public void user_is_at_manage_batch_page() {
		tittle = driver.getTitle();
		log.info("The Tittle of Manage Batch page is :" + tittle);
		as.assertTrue(true);
	}

	@Given("user display Manage program page")
	public void user_display_manage_program_page() {
		URL = driver.getCurrentUrl();
		log.info("The URL of Manage Progrm page is :" + URL);
		as.assertTrue(true);
	}

	@When("user enter Batch button")
	public void user_enter_batch_button() {
		bpo.BatchButton();
	}

	@Then("user validate Delete button is Disable")
	public void user_validate_delete_button_is_disable() {
		bpo.AllDeleteButtonDisplayed();
		as.assertTrue(true);
	}

	@Given("user is at Batch Page")
	public void user_is_at_batch_page() {
		URL = driver.getCurrentUrl();
		log.info("The Tittle of Manage Batch page is :" + URL);
		as.assertTrue(true);
	}

	@When("user enter Batch Name in search box")
	public void user_enter_batch_name_in_search_box() {
		bepo.searchBox();
		// result = bpo.validatingSearch();
		// System.out.println("Result String is: "+result);
	}

	@Then("records of Batch Name is displayed")
	public void records_of_batch_name_is_displayed() {
		String result = bepo.validatingSearch().toLowerCase();
		log.info("Result String is: " + result);
		if (result.contains((searchBatch).toLowerCase())) {
			log.info("String Exists");
		} else {
			log.info("String not Exists");
		}
	}

	@Given("user is at Batch page with search record")
	public void user_is_at_batch_page_with_search_record() {
		String Entries = bpo.ShowEntries();
		log.info("Entries Text is :" + Entries);
		bpo.searchBox1();
	}

	@When("user clicks on Edit button")
	public void user_clicks_on_edit_button() {
		bpo.BatchName();
		bepo.EditButton();
	}

	@Then("user lands on Batch Details page")
	public void user_lands_on_batch_details_page() {
		String MainWindow = driver.getWindowHandle();
		log.info("Main window handle is " + MainWindow);
		Set<String> s1 = driver.getWindowHandles();
		log.info("Child window handle is" + s1);
		String label = bepo.ValidateBatchDetails();
		log.info("The Edit Window label is " + label);
		log.info("The edit window label is :" + label);
	}

	@Given("user is on Batch Details")
	public void user_is_on_batch_details() {
		String VBD = bepo.ValidateBatchDetails();
		if (VBD.contains("Batch Details")) {
			log.info("User is on Batch Details Edit Page 1");
		} else {
			log.info("User is not on Batch Details Edit Page 2");
		}
	}

	@When("user edit Name and status")
	public void user_edit_name_and_status() {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		//bepo.getBatchDetails();
		//bepo.EditbatchDescription();
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		//bepo.EditBatchNoOfClasses();
	}

	@When("click Cancel button")
	public void click_cancel_button() {
		bepo.CancelButtonEditBatch();
	}

	@Then("user can see message ")
	public void user_can_see_message() {
		String tittle = driver.getTitle();
		log.info("Validating user is at LMS page:" + tittle);
	}

	@When("click Save button")
	public void click_save_button() {
		bepo.searchBox();
		bepo.EditButton();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		String SelectedBatch = bepo.GetBDetailsName();
		config.setPropertyBatchName(SelectedBatch);
		log.info("Current Batch Details Name: "+ SelectedBatch);
		log.info("Current Batch Description: "+ bepo.GetbatchDescription());
		log.info("Current Batch No Of Classes: "+ bepo.getBatchNoOfClasses());
		bepo.EditbatchDescription();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		bepo.EditBatchNoOfClasses();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		bepo.SaveButtonEditBatch();
		bepo.closeButton();
	}

	@Then("user can see message Successfully Batch Updated")
	public void user_can_see_message_successfully_batch_updated() {
		//String Message = bpo.SuceessfullyUpadtedMessgeEdit();
		//System.out.println("Updated Message is :" + Message);
	}

	@Given("user is on Batch Page with edited record")
	public void user_is_on_batch_page_with_edited_record() {
		//String result = bpo.validatingSearch().toLowerCase();
		System.out.println("Updated Batch Name String is: " + config.getUpdatedBatchName());
	}

	@When("user clear the search box")
	public void user_clear_the_search_box() {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
		bepo.searchBox1();
	}

	@When("user enter the edited data")
	public void user_enter_the_edited_data() {
		bepo.searchUpdatedBatch(config.getUpdatedBatchName());
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
	}

	@Then("user should see the edited record")
	public void user_should_see_the_edited_record() {
		driver.navigate().back();
		bpo.BatchButton();
		bpo.BatchName();
		//bepo.searchBox2();
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
//		bepo.UpdatedEditButton();
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

//		System.out.println("Updated Batch Details Name: "+ bepo.GetBDetailsName());
//		System.out.println("Updated Batch Description: "+ bepo.GetbatchDescription());
//		System.out.println("Updated Batch No Of Classes: "+ bepo.getBatchNoOfClasses());

		//bepo.CancelButtonEditBatch();
	}

	@Then("user clear search -user is at Manage batch page")
	public void user_clear_search_user_is_at_manage_batch_page() {
		bpo.searchBox1();
	}

	@Given("user is at Manage Batch Page with multiple check boxes")
	public void user_is_at_manage_batch_page_with_multiple_check_boxes() {
		tittle = driver.getTitle();
		if (tittle.equalsIgnoreCase("LMS")) {
			System.out.println("Page Tittle after Updated:" + tittle);
		} else {
			System.out.println("Wrong Page :" + tittle);
		}
	}

	@When("user click multiple check boxes to delete Batch")
	public void user_click_multiple_check_boxes_to_delete_batch() {
		bepo.DeleteCheckBOx();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	}

	@Then("user click on Delete button next to search box")
	public void user_click_on_delete_button_next_to_search_box() {
		bpo.AllDeleteButtonClick();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(70));
	}

	@Given("user is at Confirm deletion popup Page")
	public void user_is_at_confirm_deletion_popup_page() {
		bepo.DeleteConfirm();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
			}

	@When("user click on Yes button")
	public void user_click_on_yes_button() {
		bepo.YesDeleteConfirm();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	}

	@Then("user see the message- Successfully Deleted")
	public void user_see_the_message_successfully_deleted() {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		bepo.closeButton();
	}

}
