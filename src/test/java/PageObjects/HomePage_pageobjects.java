package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


  public class HomePage_pageobjects {
	  
	  WebDriver driver;
	  
	  
	  public HomePage_pageobjects(WebDriver driver)
	  {
		  PageFactory.initElements(driver, this);
	  }
	  
	  
	  
	@FindBy(xpath= "//span[normalize-space()='Program']")
	public  WebElement program;
	
	@FindBy(xpath="//span[normalize-space()='Batch']")
	 public  WebElement batch;
	
	@FindBy(xpath="//span[normalize-space()='User']")
	public  WebElement user;
	
	@FindBy(xpath="//span[normalize-space()='Assignment']")
	public  WebElement assignment;
	
	@FindBy(xpath="//span[normalize-space()='Attendance']")
	public  WebElement attendance;
	
	@FindBy(xpath="//span[normalize-space()='Logout']")
	public  WebElement logout;
	
	@FindBy(xpath="//span[normalize-space()='LMS - Learning Management System']")
	public WebElement Text_on_page ;
	
	public  void click_on_program() 
	{
		program.click();
	}
	
	public  void click_on_batch() 
	{
		batch.click();
	}

	public  void click_on_user() 
	{
		user.click();
	}
	public  void click_on_assignment() 
	{
		assignment.click();
	}
	public  void click_on_attendence() 
	{
		attendance.click();
	}
	public  void click_on_logout() 
	{
		logout.click();
	}
	public void Verify_text()
	{
		Text_on_page.getText();
	}

}
