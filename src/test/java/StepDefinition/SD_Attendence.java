package StepDefinition;

import java.time.Duration;

import Base.BaseClass;
import PageObjects.Attendence_PageObject;
import PageObjects.Batch_PageObject;
import io.cucumber.java.en.*;

public class SD_Attendence extends BaseClass{
	
	Attendence_PageObject apo = new  Attendence_PageObject(driver);
	Batch_PageObject bpo = new Batch_PageObject(driver);
	String tittle ;
	String URL;
	
	@Given("user is at Manage Batch Page with NoOfClasses in Descending order")
	public void user_is_at_manage_batch_page_with_no_of_classes_in_descending_order() {
	  tittle = driver.getTitle();
	  System.out.println("Page tittle of Batch Page for Assigment:"+tittle);
	}

	@When("user click on Attendence button on Menu Bar")
	public void user_click_on_attendence_button_on_menu_bar() {
		// explicit wait - to wait for the compose button to be click-able
				bpo.AttendenceButton();
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
	}

	@Then("user lands on Attendence page")
	public void user_lands_on_attendence_page() {
	   URL = driver.getCurrentUrl();
	   System.out.println("Assigment Page URL :"+URL);
	}

	@Given("user is at Attendence page")
	public void user_is_at_attendence_page() {
	  
	}

	@When("user see window with text- Attendence Works")
	public void user_see_window_with_text_attendence_works() {
	  String text =  apo.captureAssigmentText();
	   System.out.println("Text on Assigmnet page :"+text);
	}

	@Then("user click on logout")
	public void user_click_on_logout() {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
	   bpo.LogoutButton();
	}

	@Then("user lands on Login page")
	public void user_lands_on_login_page() {
	  apo.CaptureLoginText();
	  tittle = driver.getCurrentUrl();
	  System.out.println("URL after Logout button:"+tittle);
	}
}