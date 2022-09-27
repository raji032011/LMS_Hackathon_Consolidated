 package StepDefinition;

import java.io.IOException;
import java.time.Duration;
import java.util.ArrayList;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.bson.BsonDbPointer;

import Base.BaseClass;
import PageObjects.BatchAddNew_PageObject;
import PageObjects.Batch_PageObject;
import io.cucumber.java.en.*;
import utilities.ExcelDataDriven;

public class SD_BatchNewAdd extends BaseClass{
	
	Logger log = LogManager.getLogger("SD_BatchNewAdd.java");
	ExcelDataDriven exlData = new  ExcelDataDriven();
	Batch_PageObject bpo = new Batch_PageObject(driver);
	BatchAddNew_PageObject bANpo = new BatchAddNew_PageObject(driver);
	ArrayList<String> data;
	String tittle;
	
	@Given("user is at Manage Batch page with ANew Batch button")
	public void user_is_at_manage_batch_page_with_a_new_batch_button() {
	    tittle = driver.getTitle();
	}

	@When("user clicks on ANew Batch button")
	public void user_clicks_on_a_new_batch_button() {
	     bpo.ANewbatch();
	}

	@Then("Batch Details Page popup with all empty fields")
	public void batch_details_page_popup_with_all_empty_fields() {
		String Name = bANpo.ValBatchDetails();
		log.info("validating Add Batch PAge:" +Name);
	}

	@Given("user is at New Add Batch Details Page")
	public void user_is_at_new_add_batch_details_page() {
	   
	}

	@When("user enter empty username - click save button")
	public void user_enter_empty_username_click_save_button() {
		 bANpo.AddBatchName("");
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		 bpo.SaveButtonEditBatch();
	}

	@Then("message display - Name is required")
	public void message_display_name_is_required() {
		
	}

	@Given("user is at New Add Batch Details Page1")
	public void user_is_at_new_add_batch_details_page1() throws IOException {
		 data = exlData.dataDriven("Batch2");
		 bANpo.AddBatchName(data.get(1));
		 log.info("Batch Name:" +(data.get(1)));
		 log.info("Batch Desc:" +(data.get(2)));
		 log.info("Batch Classes:" +(data.get(3)));
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
   		 bANpo.AddBatchDescription(data.get(2));
   		 bANpo.BatchNoOfClasses(data.get(3));
   		 	}

	@When("user  click cancel button")
	public void user_click_cancel_button() {
	    bpo.CancelButtonEditBatch();
	}

	@Then("Batch Details popup is disappears")
	public void batch_details_popup_is_disappears() {
	   tittle = driver.getTitle();
	   log.info("Page tittle after cancel button:"+tittle);
	}

	@Given("user is at Batch Details adding all details in popup page")
	public void user_is_at_batch_details_adding_all_details_in_popup_page() {
		 bpo.ANewbatch();
	}

	@When("user enters all details")
	public void user_enters_all_details() throws IOException {
		 data = exlData.dataDriven("Batch2");
		 bANpo.AddBatchName(data.get(1));
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
   		 bANpo.AddBatchDescription(data.get(2));
   		 bANpo.BatchNoOfClasses(data.get(3));
   		 bANpo.InActiveRadioButton();
   		bANpo.AddBatchProgramName();

	}

	@Then("user clicks on save button")
	public void user_clicks_on_save_button() {
	   bANpo.AddSaveButton();
	}

	@Then("user see message -Successful batch created")
	public void user_see_message_successful_batch_created() {
	 // bpo.SuceessfullyUpadtedMessgeEdit();
	  //bpo.CancelButtonEditBatch();
	}

	@Given("user is at Manage Batch page2")
	public void user_is_at_manage_batch_page2() {
	   
	}

	@When("user verify  Add batch in search box")
	public void user_verify_add_batch_in_search_box() {
	   bpo.searchBox();
	 //  bANpo.AddBatchName(data.get(1));   
	}

	@Then("user should see new batch data on Manage batch page")
	public void user_should_see_new_batch_data_on_manage_batch_page() {
	//	bpo.CancelButtonEditBatch();
	 //  driver.navigate().back();
	}

}
