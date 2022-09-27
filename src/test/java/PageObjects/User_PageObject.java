package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Base.BaseClass;
import utilities.ReadConfig;

public class User_PageObject extends BaseClass {

	WebDriver ldriver;
	static ReadConfig config = new ReadConfig();
	public String searchuser = config.getsearchuser();

	public User_PageObject(WebDriver rdriver) {
		ldriver = rdriver;
		PageFactory.initElements(rdriver, this);
	}

	// User link on home page
	@FindBy(xpath = "//button[@ng-reflect-router-link='/user']")
	WebElement userbutton;

	// manage user

	@FindBy(xpath = "//div[normalize-space()='Manage User']")
	WebElement manageusertext;

	// Delete Button
	@FindBy(xpath = "//button[@class='p-button-danger p-button p-component p-button-icon-only']")
	WebElement userdeletebutton;
	// ID
	@FindBy(xpath = "// th[normalize-space()='ID']")
	WebElement useridfield;
	// Name
	@FindBy(xpath = "// th[normalize-space()='Name']")
	WebElement usernamefield;
	// Email Address
	@FindBy(xpath = "// th[normalize-space()='Email Address']")
	WebElement useremail;
	// Contact number
	@FindBy(xpath = "// th[normalize-space()='Contact Number']")
	WebElement usercontact;
	// Batch
	@FindBy(xpath = "// th[normalize-space()='Batch']")
	WebElement userbatch;
	// Skill
	@FindBy(xpath = "// th[normalize-space()='Skill']")
	WebElement userskill;
	// edit/delete
	@FindBy(xpath = "// th[normalize-space()='Edit / Delete']")
	WebElement usereditdelete;

	// searchbox

	@FindBy(xpath = "//input[@placeholder='Search...']")
	WebElement usersearchbox;

	// show entries: verifying the number of users

	@FindBy(xpath = "//div[@class='p-paginator-bottom p-paginator p-component ng-star-inserted']")
	WebElement displaysuserlists;

	// usercheckbox
	@FindBy(xpath = "//div[@class='p-checkbox-box p-highlight']//span[@class='p-checkbox-icon pi pi-check']")
	WebElement editcheckbox;

	// edit to for userdetails page
	@FindBy(xpath = "//tbody/tr[1]/td[8]/div[1]/span[1]/button[1]/span[1]")

	WebElement usereditbutton;

	// Userdetails labels

	@FindBy(xpath = "//span[@id='pr_id_43-label']")

	WebElement userdetailswindow;

	// username

	@FindBy(xpath = "//input[@id='mat-input-154']")

	WebElement usertext;

	// cancel button

	@FindBy(xpath = "//span[normalize-space()='Cancel']")

	WebElement cancelbutton;

	// click "X" button

	@FindBy(xpath = "//body/app-root[1]/app-user[1]/div[1]/p-dialog[1]/div[1]/div[1]/div[1]/div[1]/button[1]/span[1]")

	WebElement cancelxbutton;

	// Add user button

	@FindBy(xpath = "//span[@class='p-button-icon p-button-icon-left pi pi-plus']")

	WebElement newuseraddbutton;

	// cancel button

	@FindBy(xpath = "//body/app-root[1]/app-user[1]/div[1]/p-dialog[1]/div[1]/div[1]/div[1]/div[1]/button[1]")

	WebElement cancelnewuserbutton;

	public Boolean userid() {
		return useridfield.isDisplayed();
	}

	public Boolean username() {
		return usernamefield.isDisplayed();
	}

	public Boolean useremail() {
		return useremail.isDisplayed();
	}

	public Boolean usercontact() {
		return usercontact.isDisplayed();
	}

	public Boolean userbatch() {
		return userbatch.isDisplayed();
	}

	public Boolean userskill() {
		return userskill.isDisplayed();
	}

	public Boolean usereditdelete() {
		return usereditdelete.isDisplayed();
	}

	public void userButton() {
		userbutton.click();
	}

	public void canceluserbutton1() {
		cancelnewuserbutton.click();
	}

	public void usercancelxbutton() {
		cancelxbutton.click();
	}

	public void newuserbutton1() {
		newuseraddbutton.click();
	}

	public Boolean userdeletbutton() {
		return userdeletebutton.isDisplayed();
	}

	public void searchBox() {
		usersearchbox.sendKeys(searchuser);
	}

	public String userslist() {
		return displaysuserlists.getText();
	}

	public void usereditcheckbox() {
		editcheckbox.click();
	}

	public void usereditbuttonclick() {
		usereditbutton.click();
	}

	public String userdetailstext() {
		return userdetailswindow.getText();
	}

	public void usertextinput() {
		usertext.sendKeys("Corey");
	}

	public void userdetailssubmit() {
		cancelbutton.click();
	}

	public String manageusertext1() {
		return manageusertext.getText();
	}

}
