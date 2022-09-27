package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProgramPage2_pageobjects 
{
	public ProgramPage2_pageobjects(WebDriver driver)
	
	{
		PageFactory.initElements(driver,this);
		
	}
	
	@FindBy(xpath="//th[normalize-space()='Program Name']")
	WebElement prog_Name; 
	
	@FindBy(xpath="//p-sorticon[@field='description']//i[@class='p-sortable-column-icon pi pi-fw pi-sort-alt']")
	WebElement prog_desc;
	
	@FindBy(xpath="//th[normalize-space()='Program Status']")
	WebElement prog_status; 
	
	@FindBy(xpath="//span[normalize-space()='A New Program']")
	WebElement NewProg_button; 
	
	@FindBy(xpath="//input[@id='programName']")
	WebElement ProgDetails_Name;
	
	@FindBy(xpath="//input[@id='programDescription']")
	WebElement ProgDetails_desc;
	
	@FindBy(xpath="//p-radiobutton[@ng-reflect-input-id='Active']//div[@class='p-radiobutton-box']")
	WebElement ProgDetails_StatusActive;
	
	@FindBy(xpath="//p-radiobutton[@ng-reflect-input-id='Inactive']//div[@class='p-radiobutton-box']")
	WebElement ProgDetails_StatusInActive;
	
	@FindBy(xpath="//span[normalize-space()='Cancel']")
	WebElement ProgDetails_cancel;
	
	@FindBy(xpath="//span[normalize-space()='Save']")
	WebElement ProgDetails_save;
	
	 @FindBy(xpath="//small[@class='p-invalid ng-star-inserted']")
	 WebElement ProgDetails_text_under_name;
	

    public void AddNewProg()
    {
    	NewProg_button.click();
    }
    
    public void AddProgName(String name)
    {
    	ProgDetails_Name.sendKeys(name);
    	
    }
     public void AddDesc(String description)
     {
    	 ProgDetails_desc.sendKeys(description);
     }
    
     public void RadiobtnActive() {
    	 ProgDetails_StatusActive.click();
    	 
     }
     
     public void RadiobtnInActive() {
    	 ProgDetails_StatusInActive.click();
    	 
     }
     
     public void ProgDetailsCancel() {
    	 ProgDetails_cancel.click();
     }
     
     public void ProgDetailsSave() 
     {
    	 ProgDetails_save.click();
     }
     public void  Verify_ProgDetails_text_under_name()
     {
    	 ProgDetails_text_under_name.isDisplayed();
     }
}
