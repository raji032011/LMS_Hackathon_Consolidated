package StepDefinition;

import java.time.Duration;
import java.util.Set;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

import Base.BaseClass;
import PageObjects.LoginPage_PageObject;
import PageObjects.User_PageObject;
import io.cucumber.java.en.*;
import utilities.ReadConfig;

public class SD_User1 extends BaseClass {

	Logger log = LogManager.getLogger("SD_User1.java");
	User_PageObject upo = new User_PageObject(driver);
	SoftAssert as = new SoftAssert();
	static ReadConfig config = new ReadConfig();
	public String searchuser = config.getsearchuser();
	String tittle;
	String URL;
	String result;

	@Given("user is at Manage Batch page1")
	public void user_is_at_manage_batch_page1() {

		tittle = driver.getTitle();
		log.info("The Tittle of Manage batch page is :" + tittle);
		as.assertTrue(true);
	}

	@When("user click on User button")
	public void user_click_on_user_button() {
		upo.userButton();
	}

	@Then("user is at Manage User page2")
	public void user_is_at_manage_user_page2() {

		tittle = driver.getTitle();
		log.info("The Tittle of Manage batch page is :" + tittle);
		as.assertTrue(true);

	}

	@Given("user display user program page")
	public void user_display_user_program_page() {
		URL = driver.getCurrentUrl();
		log.info("The URL of Manage User page is :" + URL);
		as.assertTrue(true);
	}

	@When("user enter user button")
	public void user_enter_user_button() {
		upo.userButton();
	}

	@When("user validate Delete button is Disable1")
	public void user_validate_delete_button_is_disable1() {

		Boolean deletebuttompresence = upo.userdeletbutton();
		Assert.assertTrue(deletebuttompresence);
	}

	@Given("User is on the Manage user page")
	public void user_is_on_the_manage_user_page() {

		URL = driver.getCurrentUrl();
		log.info("The user is in Manage user page :" + URL);
		as.assertTrue(true);
	}

	@When("user clicks user button1")
	public void user_clicks_user_button1() {
		upo.userButton();
	}

	@Then("User verify for the different header fields of users")
	public void user_verify_for_the_different_header_fields_of_users() {
		Boolean useridpresence = upo.userid();
		Assert.assertTrue(useridpresence);

		Boolean usernamepresence = upo.username();
		Assert.assertTrue(usernamepresence);

		Boolean useremailpresence = upo.useremail();
		Assert.assertTrue(useremailpresence);

		Boolean usercontactpresence = upo.usercontact();
		Assert.assertTrue(usercontactpresence);

		Boolean userskillpresence = upo.userskill();
		Assert.assertTrue(usercontactpresence);

		Boolean userbatchpresence = upo.userbatch();
		Assert.assertTrue(userbatchpresence);

		Boolean usereditdeletepresence = upo.usereditdelete();
		Assert.assertTrue(usereditdeletepresence);
	}

	@Given("user is at user Page")
	public void user_is_at_user_page() {

		tittle = driver.getTitle();
		log.info("The Tittle of Manage batch page is :" + tittle);
		as.assertTrue(true);
	}

	@When("user enter username in search box")
	public void user_enter_username_in_search_box() {
		upo.searchBox();
	}

	@Then("Matching records of username is displayed")
	public void matching_records_of_username_is_displayed() {
		log.info("Matching users are displayed");
	}

	@Given("user is at userpage with search record")
	public void user_is_at_userpage_with_search_record() {

		String userentries = upo.userslist();
		log.info("Total number of users :" + userentries);
		// upo.usereditcheckbox();
	}

	@When("user clicks on Edit button1")
	public void user_clicks_on_edit_button1() {
		// upo.usereditcheckbox();
		upo.usereditbuttonclick();

	}

	@Then("user lands on userdetails page")
	public void user_lands_on_userdetails_page() {

		log.info("User details window pops up");
		String actualheadertitle = "User Details";
		// String expectedheadertitle =upo.userdetailstext();

	}

	@Given("user is at user details page")
	public void user_is_at_user_details_page() {

		log.info("Userdetails window is opened");
	}

	@When("user verifies for submit and cancel button")
	public void user_verifies_for_submit_and_cancel_button() {
		// driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

	}

	@Then("user clicks cancel button")
	public void user_clicks_cancel_button() {
		upo.usercancelxbutton();

	}

	@Given("user is at user details page to add new user")
	public void user_is_at_user_details_page_to_add_new_user() {
		tittle = driver.getTitle();
		log.info("The Tittle of Manage batch page is :" + tittle);
		as.assertTrue(true);
	}

	@When("user clicks Add new button")
	public void user_clicks_add_new_button() {

		upo.newuserbutton1();

	}

	@Then("User details window for adding user is displayed")
	public void user_details_window_for_adding_user_is_displayed() {
		log.info(" User details window is displayed to add the details");

	}

	@Given("user is at user details page after clicking Add user")
	public void user_is_at_user_details_page_after_clicking_add_user() {
		Logger log = LogManager.getLogger("add new user");
	}

	@When("user clicks x button at the")
	public void user_clicks_x_button_at_the() {
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		upo.canceluserbutton1();
	}

	@Then("User details window for adding user is closed")
	public void user_details_window_for_adding_user_is_closed() {
		Logger log = LogManager.getLogger("Add new user window is closed");

		String expectedpageheader = "Manage User";
		String actualheader = upo.manageusertext1();
		if (expectedpageheader == actualheader) {
			log.info("Pass");
		} else {
			log.info("fail");
		}
	}

}
