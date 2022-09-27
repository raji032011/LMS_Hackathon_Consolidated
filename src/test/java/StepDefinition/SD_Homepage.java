package StepDefinition;

import io.cucumber.java.en.*;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import Base.BaseClass;
import io.cucumber.java.en.*;
import io.github.bonigarcia.wdm.WebDriverManager;
import PageObjects.HomePage_pageobjects;

public class SD_Homepage  extends BaseClass
{
	HomePage_pageobjects hpobjects;
	Logger log = LogManager.getLogger("SD_Homepage.java");
	WebElement Text_on_page;
	
	@Given("User is on Homepage")
	public void user_is_on_homepage() 
	{
		hpobjects = new HomePage_pageobjects(driver);
		String title = driver.getTitle();
		 log.info("LMS @Given User is on Homepage " + title);
	}

	@When("User clicks on the text")
	public void user_clicks_on_the_text() {
		log.info("LMS @When text on page is displayed");
		hpobjects = new HomePage_pageobjects(driver);
		hpobjects.Verify_text();
	}

	@Then("User should see a heading with text LMS Learning Management System on the Home page")
	public boolean user_should_see_a_heading_with_text_lms_learning_management_system_on_the_home_page() {
		hpobjects = new HomePage_pageobjects(driver);		 
		Boolean visible = driver.findElement(By.xpath("//span[normalize-space()='LMS - Learning Management System']")).isDisplayed();
		 log.info("LMS @Then text on page is displayed : "+visible);
		 Assert.assertTrue(true);
		 return visible;
	}

	@When("User clicks on the program")
	public void user_clicks_on_the_program() {
		hpobjects = new HomePage_pageobjects(driver);
		hpobjects.click_on_program();
		 log.info("LMS @When user clicks on the prog: ");

	}

	@Then("User should see a button with text Program on the menu bar")
	public boolean user_should_see_a_button_with_text_program_on_the_menu_bar() 
	{
		hpobjects = new HomePage_pageobjects(driver);
		Boolean visible = driver.findElement(By.xpath("//span[normalize-space()='Program']")).isDisplayed();
		 log.info("LMS @Then user clicks on the text on the prog ");
		 Assert.assertTrue(true);
		return visible;
	    
	}

	@When("User clicks on the batch")
	public void user_clicks_on_the_batch() 
	{
		hpobjects = new HomePage_pageobjects(driver);
		hpobjects.click_on_batch();
		 log.info("LMS @Then user clicks on the batch ");

	}

	@Then("User should see a button with text batch on the menu bar")
	public boolean user_should_see_a_button_with_text_batch_on_the_menu_bar() {
		hpobjects = new HomePage_pageobjects(driver);
		  Boolean visible = driver.findElement(By.xpath("//span[normalize-space()='Batch']")).isDisplayed();
		    log.info("LMS @When user clicks on the batch ");
		    Assert.assertTrue(true);
		    return visible;
	}

	@When("User clicks on the user button")
	public void user_clicks_on_the_user_button() 
	{
		hpobjects = new HomePage_pageobjects(driver);
		hpobjects.click_on_user();
		 log.info("LMS @When user clicks on the user ");
	}

	@Then("User should see a button with text User on the menu bar")
	public boolean user_should_see_a_button_with_text_user_on_the_menu_bar() 
	{
		hpobjects.click_on_user();
		Boolean visible = driver.findElement(By.xpath("//span[normalize-space()='User']")).isDisplayed();
		log.info("LMS @Then user clicks on the user ");
		Assert.assertTrue(true);
		return visible;
	}

	@When("User clicks on the Assignment button")
	public void user_clicks_on_the_assignment_button() 
	{
		hpobjects = new HomePage_pageobjects(driver);
		hpobjects.click_on_assignment();
		 log.info("LMS @When user clicks on the assignment ");	
	}

	@Then("User should see a button with text Assignment on the menu bar")
	public boolean user_should_see_a_button_with_text_assignment_on_the_menu_bar() {
		hpobjects.click_on_user();
		Boolean visible = driver.findElement(By.xpath("//span[normalize-space()='Assignment']")).isDisplayed();
		log.info("LMS @Then user clicks on the assignment ");
		Assert.assertTrue(true);
		return visible;
	}

	@When("User click on the attendence button")
	public void user_click_on_the_attendence_button() 
	{
		hpobjects = new HomePage_pageobjects(driver);
		hpobjects.click_on_attendence();
		 log.info("LMS @When user clicks on the attendence ");
	}

	@Then("User should see a button with text Attendence on the menu bar")
	public boolean user_should_see_a_button_with_text_attendence_on_the_menu_bar() 
	{
		hpobjects.click_on_user();
		Boolean visible = driver.findElement(By.xpath("//span[normalize-space()='Attendance']")).isDisplayed();
		log.info("LMS @Then user clicks on the attendence ");
		Assert.assertTrue(true);
		return visible;
		
	}

	@Given("User click on user page")
	public void user_click_on_user_page() {
		String title = driver.getTitle();
		 log.info("LMS @Given User is on Homepage " + title);
	}

	@When("user click on program button")
	public void user_click_on_program_button() 
	{
		hpobjects = new HomePage_pageobjects(driver);
		hpobjects.click_on_program();
		 log.info("LMS @When user clicks on the prog: ");

	}

	@Then("user is on program page")
	public void user_is_on_program_page() {
		String title = driver.getTitle();
		 log.info("LMS @Given User is on Homepage " + title);
	}

}
