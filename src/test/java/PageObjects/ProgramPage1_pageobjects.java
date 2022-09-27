package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProgramPage1_pageobjects 
{


	public ProgramPage1_pageobjects(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
		
	}
	
	@FindBy(xpath="//input[@placeholder='Search...']")
	WebElement search_box;
	
	@FindBy(xpath="//button[@class='p-button-danger p-button p-component p-button-icon-only']//span[@class='p-button-icon pi pi-trash']")
	 public WebElement delete_button;
	
	/*@FindBy(xpath="")
	WebElement ;
	
	@FindBy(xpath="")
	WebElement search_box;*/
	
	public void searchbox()
	{
		search_box.isDisplayed();
	}
	
	public void text_on_searchbox()
	{
		search_box.getAttribute("");
		
	}
	 
	public String Validatesearch()
	{
	 search_box.sendKeys("");
	return ("");
		
		
	}
	
	
	
	
	public void verify_dlt_btn()
	{
		delete_button.click();
	}
}
