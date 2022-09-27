
package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import Base.BaseClass;

public class Registration_PageObject extends BaseClass {

	public WebDriver ldriver;

	public Registration_PageObject(WebDriver rdriver) {
		ldriver = rdriver;
		PageFactory.initElements(rdriver, this);
	}

	@FindBy(xpath = "//div[@name='Sign Up form']")
	WebElement textSignUpForm;

	@FindBy(xpath = "FirstName")
	@CacheLookup
	WebElement txtFirstName;

	@FindBy(xpath = "LastName")
	@CacheLookup
	WebElement txtLastName;

	@FindBy(xpath = "Address")
	@CacheLookup
	WebElement txtAddress;

	@FindBy(xpath = "StreetName")
	@CacheLookup
	WebElement txtStreetName;

	@FindBy(xpath = "City")
	@CacheLookup
	WebElement txtCity;

	@FindBy(xpath = "State")
	@CacheLookup
	WebElement drpdnstate;

	@FindBy(xpath = "zipCode")
	@CacheLookup
	WebElement txtzipCode;

	@FindBy(xpath = "BithDate")
	@CacheLookup
	WebElement drpdnBirthDate;

	@FindBy(xpath = "PhoneNumber")
	@CacheLookup
	WebElement txtPhoneNumber;

	@FindBy(xpath = "UserName")
	@CacheLookup
	WebElement txtUserName;

	@FindBy(xpath = "Password")
	@CacheLookup
	WebElement txtpassword;

	@FindBy(xpath = "email")
	@CacheLookup
	WebElement txtEmail;

	@FindBy(xpath = "SignUp")
	@CacheLookup
	WebElement btnSignUp;

	@FindBy(xpath = "logIn")
	@CacheLookup
	WebElement btnLogin;

	public String signUpFormText() {
		return textSignUpForm.getText();
	}

	public boolean txtFstNameVisibility() {
		try {
			if (txtFirstName.getText().isBlank()) {
				return false;
			}
			return true;
		} catch (org.openqa.selenium.NoSuchElementException e) {
			return false;
		}

	}

	public boolean txtLstNameVisibility() {

		try {
			if (txtLastName.getText().isBlank()) {
				return false;
			}
			return true;
		} catch (org.openqa.selenium.NoSuchElementException e) {
			return false;
		}

	}

	public boolean txtAddressHouseNumVisibility() {

		try {
			if (txtAddress.getText().isBlank()) {
				return false;
			}
			return true;
		} catch (org.openqa.selenium.NoSuchElementException e) {
			return false;
		}

	}

	public boolean txtStreetNameVisibility() {

		try {
			if (txtStreetName.getText().isBlank()) {
				return false;
			}
			return true;
		} catch (org.openqa.selenium.NoSuchElementException e) {
			return false;
		}

	}

	public boolean txtCityVisibility() {

		try {
			if (txtCity.getText().isBlank()) {
				return false;
			}
			return true;
		} catch (org.openqa.selenium.NoSuchElementException e) {
			return false;
		}

	}

	public boolean drpdnstateVisibility() {

		try {
			if (drpdnstate.getText().isBlank()) {
				return false;
			}
			return true;
		} catch (org.openqa.selenium.NoSuchElementException e) {
			return false;
		}

	}

	public boolean drpdnBirthDateVisibility() {

		try {
			if (drpdnBirthDate.getText().isBlank()) {
				return false;
			}
			return true;
		} catch (org.openqa.selenium.NoSuchElementException e) {
			return false;
		}
	}

	public boolean txtzipCodeVisibility() {

		try {
			if (txtzipCode.getText().isBlank()) {
				return false;
			}
			return true;
		} catch (org.openqa.selenium.NoSuchElementException e) {
			return false;
		}

	}

	public boolean txtUserNameVisibility() {

		try {
			if (txtUserName.getText().isBlank()) {
				return false;
			}
			return true;
		} catch (org.openqa.selenium.NoSuchElementException e) {
			return false;
		}

	}

	public boolean txtpasswordVisibility() {

		try {
			if (txtpassword.getText().isBlank()) {
				return false;
			}
			return true;
		} catch (org.openqa.selenium.NoSuchElementException e) {
			return false;
		}

	}

	public boolean txtPhoneNumberVisibility() {

		try {
			if (txtPhoneNumber.getText().isBlank()) {
				return false;
			}
			return true;
		} catch (org.openqa.selenium.NoSuchElementException e) {
			return false;
		}

	}

	public boolean txtEmailVisibility() {
		try {
			if (txtEmail.getText().isBlank()) {
				return false;
			}
			return true;
		} catch (org.openqa.selenium.NoSuchElementException e) {
			return false;
		}

	}

	public boolean signUpBtnVisibility() {

		try {
			return btnSignUp.isDisplayed();
		} catch (org.openqa.selenium.NoSuchElementException e) {
			return false;
		}

	}

	public void signUp() {

		try {
			btnSignUp.click();

		} catch (org.openqa.selenium.NoSuchElementException e) {

		}
	}

	public void setFirstName(String firstname) {

		try {
			txtFirstName.clear();
			txtFirstName.sendKeys(firstname);

		} catch (org.openqa.selenium.NoSuchElementException e) {

		}

	}

	public void setLastName(String lastname) {

		try {
			txtLastName.clear();
			txtLastName.sendKeys(lastname);
		} catch (org.openqa.selenium.NoSuchElementException e) {

		}
	}

	public void setAddress(String address) {

		try {
			txtAddress.clear();
			txtAddress.sendKeys(address);
		} catch (org.openqa.selenium.NoSuchElementException e) {

		}
	}

	public void setStreetName(String street) {

		try {
			txtStreetName.clear();
			txtStreetName.sendKeys(street);
		} catch (org.openqa.selenium.NoSuchElementException e) {

		}
	}

	public void setCity(String city) {

		try {
			txtCity.clear();
			txtCity.sendKeys(city);
		} catch (org.openqa.selenium.NoSuchElementException e) {

		}

	}

	public Select selectState() {

		try {
			return new Select(drpdnstate);

		} catch (org.openqa.selenium.NoSuchElementException e) {
			return null;

		}
	}

	public void setZip(String int1) {

		try { 
			
			txtzipCode.clear();
			txtzipCode.sendKeys(int1);

		} catch (org.openqa.selenium.NoSuchElementException e) {

		}
	}

	public Select selectDateOfBirth() {

		try {
			return new Select(drpdnBirthDate);

		} catch (org.openqa.selenium.NoSuchElementException e) {
			return null;

		}

	}

	public void setPhoneNumber(CharSequence[] phnNo) {

		try {
			txtPhoneNumber.clear();
			txtPhoneNumber.sendKeys(phnNo);

		} catch (org.openqa.selenium.NoSuchElementException e) {

		}
	}

	public void setUserName(String username) {

		try {
			txtUserName.clear();
			txtUserName.sendKeys(username);
		} catch (org.openqa.selenium.NoSuchElementException e) {

		}

	}

	public void setPassword(String password) {

		try {
			txtpassword.clear();
			txtpassword.sendKeys(password);
		} catch (org.openqa.selenium.NoSuchElementException e) {

		}
	}

	public void setEmail(String email) {

		try {
			txtEmail.clear();
			txtEmail.sendKeys(email);
		} catch (org.openqa.selenium.NoSuchElementException e) {

		}
	}

	public void clickRegPageSignUpBtn() {

		try {
			btnSignUp.click();
		} catch (org.openqa.selenium.NoSuchElementException e) {

		}
	}

	public void clickRegPageLoginBtn() {
		try {
			btnLogin.click();
		} catch (org.openqa.selenium.NoSuchElementException e) {

		}
	}

	public void setPhoneNumber(String string) {
		// TODO Auto-generated method stub
		
	}

	public void setZip1(Integer int1) {
		// TODO Auto-generated method stub
		
	}
}
