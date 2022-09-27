package StepDefinition;

import java.time.Duration;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

import Base.BaseClass;
import PageObjects.Assignment_PageObject;
import utilities.ReadConfig;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SD_Assignment extends BaseClass {

	Logger log = LogManager.getLogger("SD_User1.java");
	Assignment_PageObject apo = new Assignment_PageObject(driver);
	SoftAssert as = new SoftAssert();
	static ReadConfig config = new ReadConfig();
	public String searchassign = config.getsearchassign();
	public String assigndesc = config.assigndescription();
	public String assigngrade = config.assigngrade();
	String assignmenttittle;
	String URL;
	String result;

	@Given("user is at user page with {int} button on menu bar")
	public void user_is_at_user_page_with_button_on_menu_bar(Integer int1) {

		assignmenttittle = driver.getTitle();
		log.info("The Tittle of Manage batch page is :" + assignmenttittle);
		as.assertTrue(true);
	}

	@When("user click on assigment button")
	public void user_click_on_assigment_button() {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		apo.Assignmentbutton();

	}

	@Then("user lands on assignment page")
	public void user_lands_on_assignment_page() {
		System.out.println("Assignment page in LMS is displayed");

	}

	@Given("user is on asssigment page with")
	public void user_is_on_asssigment_page_with() {
		driver.getCurrentUrl();
		as.assertTrue(true);

	}

	@When("user validate manage Assignment text on page")
	public void user_validate_manage_assignment_text_on_page() {
		String expectedassignmentheader = "Manage Assignment";
		String actaulassignmentheader = apo.manageassignment1();
		if (expectedassignmentheader == actaulassignmentheader) {
			System.out.println("Pass");
		} else {
			System.out.println("fail");
		}

	}

	@When("user see text Showing {int} os {int} of {int} Entries")
	public void user_see_text_showing_os_of_entries(Integer int1, Integer int2, Integer int3) {
		String manageassignmentfooter = "In total there are 3 assignments.";
		String actualmanageassignmentfooter = apo.manageassignmentfooter();
		if (manageassignmentfooter == actualmanageassignmentfooter) {
			System.out.println("Pass");
		} else {
			System.out.println("fail");
		}

	}

	@Then("user should see the SearchBox with text search")
	public void user_should_see_the_search_box_with_text_search() {

		apo.Assignmentsearchbox();

	}

	@Given("user is on Assisgment page")
	public void user_is_on_assisgment_page() {

		driver.getCurrentUrl();
		as.assertTrue(true);
	}

	@When("user search assigment by name")
	public void user_search_assigment_by_name() {
		apo.searchBox();

	}

	@Then("user see the search assisgmnet name data")
	public void user_see_the_search_assisgmnet_name_data() {

		System.out.println("Matching assignment");

	}

	@Given("user is on Assigment page with  entries")
	public void user_is_on_assigment_page_with_entries() {
		driver.getTitle();
		as.assertTrue(true);

	}

	@When("user click on Edit button")
	public void user_click_on_edit_button() {
		apo.assigneditbutton();
	}

	@Then("user see Assigment Details form popup")
	public void user_see_assigment_details_form_popup() {
		System.out.println("Assignment details page is displayed");

	}

	@Given("user is at Assigment form")
	public void user_is_at_assigment_form() {

		String Atitle = "Assigment Details";
		String Btitle = apo.assignheader();
		as.assertTrue(true);

	}

	@When("user edited assigment description and grade")
	public void user_edited_assigment_description_and_grade() {

		apo.assigndescription();
		apo.assignmentgrade1();
		;

	}

	@Then("user click save button user lands on Manage Assigment page")
	public void user_save_cancel_button_user_lands_on_manage_assigment_page() {

		apo.Assignmentsavebutton();
	}

	@Given("user is at assigmnet page2")
	public void user_is_at_assigmnet_page2() {
		driver.getTitle();
		as.assertTrue(true);
	}

	@When("user click delete button")
	public void user_click_delete_button() {
		apo.assignmentdeletbutton();

	}

	@Then("user see confirm Deletion form")
	public void user_see_confirm_deletion_form() {
		
		String assignconfirmheader = "Confirm";
		String expectedconfirm = apo.confirmassignmentheader();
		if (assignconfirmheader == expectedconfirm) {
			System.out.println("Pass");
		} else {
			System.out.println("fail");
		}
	}

	@Given("user is at confirm Deletion form with two button")
	public void user_is_at_confirm_deletion_form_with_two_button() {
		
		Boolean yesdeletebutton = apo.confirmyesbuttondisplay();
		Assert.assertTrue(yesdeletebutton);
		
		Boolean nodeletebutton = apo.confirmnobuttondisplay();
		Assert.assertTrue(nodeletebutton);

	}

	@When("user click on yes button")
	public void user_click_on_yes_button() {
       apo.confirmyesbuttonclick();
	}

	@Then("user see msg - Succssfull Assigment deleted")
	public void user_see_msg_succssfull_assigment_deleted() {
      apo.confirmdeletesuccess();
      as.assertTrue(true);
	}

}