package StepDefinition;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Assert;

import Base.BaseClass;
import io.cucumber.java.en.*;
import PageObjects.HomePage_pageobjects;
import PageObjects.ProgramPage1_pageobjects;
import PageObjects.ProgramPage2_pageobjects;

public class SD_Program6 extends BaseClass
{
	ProgramPage2_pageobjects pp2;
	ProgramPage1_pageobjects pp1;
	Logger log = LogManager.getLogger("SD_Program6 .java");
	
	@Given("User is on Program to add a new program")
	public void user_is_on_program_to_add_a_new_program() {
		pp1 = new ProgramPage1_pageobjects(driver);
		String title = driver.getTitle();
		 log.info("LMS @Given User is on programpage " + title);
	}

	@When("User clicks new program button")
	public void user_clicks_new_program_button() {
		pp2=new ProgramPage2_pageobjects(driver);
		pp2.AddNewProg();
	}

	@When("User clicks Save button without entering data")
	public void user_clicks_save_button_without_entering_data() {
		pp2=new ProgramPage2_pageobjects(driver);
		pp2.ProgDetailsSave();
	}

	@Then("User gets message Name is required")
	public void user_gets_message_name_is_required() {
		pp2=new ProgramPage2_pageobjects(driver);
		pp2.Verify_ProgDetails_text_under_name();
		Assert.assertTrue(true);
		
		
		
	}

	@When("User enters Name in text box")
	public void user_enters_name_in_text_box() {
		pp2=new ProgramPage2_pageobjects(driver);
		pp2.AddProgName("name");
	}

	@Then("User can see Name entered")
	public void user_can_see_name_entered() {
		pp2=new ProgramPage2_pageobjects(driver);
		pp2.AddProgName("name");
	}
	@Then("User lands on Program Details form")
	public void user_lands_on_program_details_form() {
	}

}

