package StepDefinition;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.Assert;

import Base.BaseClass;
import java.lang.Thread;
import PageObjects.LoginPage_PageObject;
import PageObjects.LoginPageHome_PageObject;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SD_login extends BaseClass {

	Logger log = LogManager.getLogger("SD_login.java");

	String tittle;
	public LoginPage_PageObject lp;
	LoginPageHome_PageObject lpHPRef;
	private static String[] errormessage = new String[110];

	@Given("user is  on browser")
	public void user_is_on_browser() {

		lp = new LoginPage_PageObject(driver);

	}

// open the url of LMS website
	@When("user opens LMS Website")
	public void user_opens_lms_website() {

		lp = new LoginPage_PageObject(driver);
		driver.get(baseurl);
	}

// 
	@Then("user is on Login Page")
	public void user_is_on_login_page() {
		/*
		 * String actualUrl = driver.getCurrentUrl(); String expectedUrl = url;
		 * Assert.assertEquals(actualUrl, expectedUrl);
		 */
		Assert.assertEquals(lp.LogInBtnVisibility(), true);
	}

	@Given("User lands on Login Page")
	public void user_lands_on_login_page() {

		driver.getTitle();
	}

	@When("User enters email {string}, password {string} and Error {string}")
	public void user_enters_email_password_and_error(String emailid, String Pwd, String error) {
		lp = new LoginPage_PageObject(driver);

		lp.setUserName(emailid);
		lp.setPassword(Pwd);
		try {
			Thread.sleep(0000);
		} catch (InterruptedException e) {
			log.info("got interrupted!");
		}
		lp.clickLoginBtn();

	}

	@Then("User successfully  login")
	public void user_successfully_login() {
		try {
			Thread.sleep(000);
		} catch (InterruptedException e) {
			log.info("got interrupted!");
		}
		lpHPRef = new LoginPageHome_PageObject(driver);
		Assert.assertEquals(lpHPRef.HomePageLabelVisibility(), true);

	}

}
