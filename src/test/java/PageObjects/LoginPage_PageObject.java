package PageObjects;

import org.openqa.selenium.WebDriver;

import Base.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class LoginPage_PageObject extends BaseClass {

	WebDriver ldriver;

	public LoginPage_PageObject(WebDriver rdriver) {
		ldriver = rdriver;
		PageFactory.initElements(rdriver, this);
	}

	@FindBy(xpath = "//input[@id='username']")
	@CacheLookup
	WebElement txtUserName;

	@FindBy(xpath = "//input[@id='password']")
	@CacheLookup
	WebElement txtPassword;

	@FindBy(xpath = "//button[@id='login']")
	@CacheLookup
	WebElement btnLogin;

	@FindBy(xpath = "register_link")
	@CacheLookup
	WebElement register_lnk;

	public void setUserName(String uname) {
		txtUserName.clear();
		txtUserName.sendKeys(uname);

	}

	public void setPassword(String pwd) {
		txtPassword.clear();
		txtPassword.sendKeys(pwd);
	}

	public void clickLoginBtn() {
		btnLogin.click();

	}

	public boolean LogInBtnVisibility() {
		return btnLogin.isDisplayed();
	}

	public void Lnk_register() {

		register_lnk.click();

	}
}
