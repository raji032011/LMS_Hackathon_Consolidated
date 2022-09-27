package StepDefinition;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import Base.BaseClass;
import PageObjects.BatchOrderPag_PageObject;
import PageObjects.Batch_PageObject;
import io.cucumber.java.en.*;

public class SD_BatchOrder extends BaseClass {
	Logger log = LogManager.getLogger("SD_BatchOrder.java");

	Batch_PageObject bpo = new Batch_PageObject(driver);
	BatchOrderPag_PageObject bOPpo = new BatchOrderPag_PageObject(driver);
	String tittle;

	@Given("user is at Manage Batch Page")
	public void user_is_at_manage_batch_page() {
		bOPpo.CaptureManageBatch();
	}

	@When("user click next link of Pagination")
	public void user_click_next_link_of_pagination() {
		bOPpo.NextPage();
	}

	@Then("validate user is at First page")
	public void validate_user_is_at_first_page() {
		String Entries = bOPpo.getBatchPageNumber();
		log.info("User is on Page number:" + Entries);
	}

	@Given("user is at Batch Page with First page details")
	public void user_is_at_batch_page_with_first_page_details() {
		String Entries = bpo.ShowEntries();
		log.info("Validate Second Page Entries:" + Entries);
			}

	@When("user click < Previous for Pagination")
	public void user_click_next_for_pagination() {
		bOPpo.PreviousPage();
	}

	@Then("validate user is at Second Page")
	public void validate_user_is_at_second_page() {
		String Entries = bOPpo.getBatchPageNumber();
		log.info("User is on Page number:" + Entries);
	}

	@Given("user is at Batch Page with Second page details")
	public void user_is_at_batch_page_with_second_page_details() {
		String Entries = bpo.ShowEntries();
		log.info("Validate Previous Page Entries:" + Entries);
	}

	@When("user click last link for pagination")
	public void user_click_last_link_for_pagination() {
		bOPpo.LasttPage();
	}

	@Then("validate user is at last Page")
	public void validate_user_is_at_last_page() {
		String Entries = bOPpo.getBatchPageNumber();
		log.info("User is on Page number:" + Entries);
	}

	@Given("user is on Last Page of Batch Details")
	public void user_is_on_last_page_of_batch_details() {
		String Entries = bpo.ShowEntries();
		log.info("Validate Last Page Entries:" + Entries);
	}

	@When("user click on  First link for pagination")
	public void user_click_on_first_link_for_pagination() {
		bOPpo.FirstPage();
	}

	@Then("validate is on First page of Batch")
	public void validate_is_on_first_page_of_batch() {
		String Entries = bpo.ShowEntries();
		log.info("Validate First Page Entries:" + Entries);
	}

	@Given("user is at Manage Details page with Batch Name")
	public void user_is_at_manage_details_page_with_batch_name() {

	}

	@When("user click on Batch Name")
	public void user_click_on_batch_name() {
		bpo.BatchName();
	}

	@Then("validate Batch Name in Ascending order")
	public void validate_batch_name_in_ascending_order() {
		String isSorted = bOPpo.sortTableDateAsc("Asc");
		if (isSorted == "true") {
			log.info("Batch Names are sorted in Ascending Order");
		} else {
			log.info("Batch Names are not sorted in Ascending Order");
		}
	}

	@Given("user is at Manage Details page with Batch Description")
	public void user_is_at_manage_details_page_with_batch_description() {

	}

	@When("user click on Batch Description")
	public void user_click_on_batch_description() {
		bpo.BatchDescription();
	}

	@Then("validate Batch Description in Ascending order")
	public void validate_batch_description_in_ascending_order() {

	}

	@Given("user is at Manage Details page with Batch Status")
	public void user_is_at_manage_details_page_with_batch_status() {

	}

	@When("user click on Batch Status")
	public void user_click_on_batch_status() {
		bpo.BatchStatus();
	}

	@Then("validate Batch Status in Ascending order")
	public void validate_batch_status_in_ascending_order() {
          String Statusorder =  bOPpo.StatusOrder();
          log.info("Status Ascending order " +Statusorder);
           if(Statusorder.equalsIgnoreCase("Active")) {
        	   log.info("Ascending Order is Correct");
           }else {
        	   log.info("Ascending Order is not Correct");
           }
	}
	@Given("user is at Manage Details page with NoOfClasses")
	public void user_is_at_manage_details_page_with_no_of_classes() {
	}

	@When("user click on NoOfClasses")
	public void user_click_on_no_of_classes() {
		bpo.NoOfclasses();
	}
	@Then("validate NoOfClasses in Ascending order")
	public void validate_no_of_classes_in_ascending_order() {
		String order = bOPpo.NoOfClassesOrder();
		if(order.equalsIgnoreCase("0")) {
			log.info("No Of Classes is in Ascending order");
		}else  {
			log.info("No Of Classes is in Descending  order");
		}
	}
	@Then("validate Batch Name in Descending order")
	public void validate_batch_name_in_descending_order() {
		
	}
	@Then("validate Batch Description in Descending order")
	public void validate_batch_description_in_descending_order() {

	}
	@Then("validate Batch Status in Descending order")
	public void validate_batch_status_in_descending_order() {
        bpo.BatchStatus();
		String Statusorder =  bOPpo.StatusOrder();
		log.info("Status Ascending order " +Statusorder);
        if(Statusorder.equalsIgnoreCase("Active")) {
     	   log.info("Ascending Order is Correct");
        }else {
     	   log.info("Descending Order is not Correct");
        }
	}
	@Then("validate Batch NoOfClasses in Descending order")
	public void validate_batch_no_of_classes_in_descending_order() {
		bpo.NoOfclasses();
		String order =  bOPpo.NoOfClassesOrder();
		if(order.equalsIgnoreCase("0")) {
			log.info("No Of Classes is in Ascending order");
		}else  {
			log.info("No Of Classes is in Descending  order");
		}
	}
}
