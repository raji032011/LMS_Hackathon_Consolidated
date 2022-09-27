package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Base.BaseClass;

import java.util.List;

public class LoginPageHome_PageObject extends BaseClass {

	WebDriver ldriver;

	public LoginPageHome_PageObject(WebDriver rdriver) {
		ldriver = rdriver;
		PageFactory.initElements(rdriver, this);
	}

	@FindBy(xpath = "//div[normalize-space()='Manage Program']")
	@CacheLookup
	WebElement lblHomePage;

	public boolean HomePageLabelVisibility() {

		return lblHomePage.isDisplayed();
	}
}
