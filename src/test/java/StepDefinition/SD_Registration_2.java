package StepDefinition;

import org.testng.Assert;

import Base.BaseClass;
import PageObjects.Registration_PageObject;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SD_Registration_2 extends BaseClass {

	public Registration_PageObject rp;

	@Given("User is on the Registration Page")
	public void user_is_on_the_registration_page() {
		rp = new Registration_PageObject(driver);
	}

	@When("User fills the First Name in Alphabets only")
	public void user_fills_the_first_name_in_alphabets_only() {
		rp.setFirstName("Shweta");
	}

	@Then("The First Name will be displayed")
	public void the_first_name_will_be_displayed() {

		try {
			Assert.assertEquals(rp.txtFstNameVisibility(), true);
		} catch (Exception ex) {
			Assert.fail();

		}

	}

	@When("User fills the Last Name in Alphabets only")
	public void user_fills_the_last_name_in_alphabets_only() {
		rp.setLastName("Tripathi");
	}

	@Then("The last Name will be displayed")
	public void the_last_name_will_be_displayed() {
		try {
			Assert.assertEquals(rp.txtLstNameVisibility(), true);
		} catch (Exception ex) {
			Assert.fail();

		}

	}

	@When("User fills the Address Field using Alpha Numerics and or Symbols")
	public void user_fills_the_address_field_using_alpha_numerics_and_or_symbols() {
		// Write code here that turns the phrase above into concrete actions
		rp.setAddress("711 E Cloud");

	}

	@Then("The Address will be displayed")
	public void the_address_will_be_displayed() {

		try {
			Assert.assertEquals(rp.txtAddressHouseNumVisibility(), true);
		} catch (Exception ex) {
			Assert.fail();

		}
	}

	@When("User fills the StreetName Field using Alpha Numerics and or Symbols")
	public void user_fills_the_street_name_field_using_alpha_numerics_and_or_symbols() {
		// Write code here that turns the phrase above into concrete actions
		rp.setStreetName("711 E Cloud");
	}

	@Then("The Street will be displayed")
	public void the_street_will_be_displayed() {

		try {
			Assert.assertEquals(rp.txtUserNameVisibility(), true);
		} catch (Exception ex) {
			Assert.fail();

		}
	}

	@When("User fills the HouseNumber Field using Alpha Numerics and or Symbols")
	public void user_fills_the_house_number_field_using_alpha_numerics_and_or_symbols() {
		rp.setAddress("1300");
	}

	@Then("The HouseNumber will be displayed")
	public void the_house_number_will_be_displayed() {

		try {
			Assert.assertEquals(rp.txtAddressHouseNumVisibility(), true);
		} catch (Exception ex) {
			Assert.fail();

		}
	}

	@When("User fills the City Name in Alphabets only")
	public void user_fills_the_city_name_in_alphabets_only() {
		rp.setCity("Wichita");
	}

	@Then("The city will be displayed")
	public void the_city_will_be_displayed() {

		try {
			Assert.assertEquals(rp.txtCityVisibility(), true);
		} catch (Exception ex) {
			Assert.fail();

		}
	}

	@When("User selects the respective State Name from the DropBox")
	public void user_selects_the_respective_state_name_from_the_drop_box() {
		rp.selectState();
	}

	@Then("The State will be displayed")
	public void the_state_will_be_displayed() {

		try {
			Assert.assertEquals(rp.drpdnstateVisibility(), true);
		} catch (Exception ex) {
			Assert.fail();

		}
	}

	@When("User fills the {int} digit Zip code using Numbers only")
	public void user_fills_the_digit_zip_code_using_numbers_only(String  int1) {
		rp.setZip(int1);
	}

	@Then("The Zip will be displayed")
	public void the_zip_will_be_displayed() {

		try {
			Assert.assertEquals(rp.txtzipCodeVisibility(), true);
		} catch (Exception ex) {
			Assert.fail();

		}
	}

	@When("User selects date od birth from calender")
	public void user_selects_date_od_birth_from_calender() {
		rp.selectDateOfBirth();
	}

	@Then("The DateofBirth will be displayed")
	public void the_dateof_birth_will_be_displayed() {

		try {
			Assert.assertEquals(rp.drpdnBirthDateVisibility(), true);
		} catch (Exception ex) {
			Assert.fail();

		}
	}

	@When("User fills the valid {int} digit Mobile number in Numerics")
	public void user_fills_the_valid_digit_mobile_number_in_numerics(CharSequence[] phnNo) {
		rp.setPhoneNumber(phnNo);
	}

	@Then("The Phone number will be displayed")
	public void the_phone_number_will_be_displayed() {

		try {
			Assert.assertEquals(rp.txtPhoneNumberVisibility(), true);
		} catch (Exception ex) {
			Assert.fail();

		}
	}

	@When("User fills the valid unique UserName")
	public void user_fills_the_valid_unique_user_name() {
		rp.setUserName("Shweta_Wichita");
	}

	@Then("The User name  will be displayed")
	public void the_user_name_will_be_displayed() {

		try {
			Assert.assertEquals(rp.txtUserNameVisibility(), true);
		} catch (Exception ex) {
			Assert.fail();

		}
	}

	@When("User fills the valid Password with {int} Upper case, {int} Numeric and {int} special charecter and {int} charecters")
	public void user_fills_the_valid_password_with_upper_case_numeric_and_special_charecter_and_charecters(Integer int1,
			Integer int2, Integer int3, Integer int4) {
		rp.setPassword("Wichita");
	}

	@Then("The password will be displayed")
	public void the_password_will_be_displayed() {

		try {
			Assert.assertEquals(rp.txtpasswordVisibility(), true);
		} catch (Exception ex) {
			Assert.fail();

		}
	}


	
	@When("User enter FirstName {string}, LastName {string} , Address {string} , StreetName {string} , City {string} , State {string} , Zip {string} , BithDate {string} , PhoneNumber {string} , UserName {string} , Password {string} , Email {string}")
	public void user_enter_first_name_last_name_address_street_name_city_state_no_data_zip_bith_date_phone_number_user_name_password_email(String fs_name, String lst_name, 
			String address, String st_name, String city, String state, String zip, String birth_date, String phone_num, String user_name, String password,String email) {
		rp = new Registration_PageObject(driver);
		rp.setFirstName(fs_name);
		rp.setLastName(lst_name);
		rp.setAddress(address);
		rp.setStreetName(st_name);
		rp.setCity(city);
		rp.selectState();
		rp.setZip(zip);
		rp.selectDateOfBirth();
		rp.setUserName(user_name);
		rp.setPassword(password);
		rp.setEmail(email);
		
		
		
	
	}
	@Then("User Successfully SignUp")
	public void user_successfully_sign_up() {
		rp = new Registration_PageObject(driver);
		rp.signUp();

	}



}
