package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Attendence_PageObject {
   
	WebDriver ldriver;

	public Attendence_PageObject(WebDriver rdriver) {
		ldriver = rdriver;
		PageFactory.initElements(rdriver, this);
	}

	    // capture  screen  text 
	  @FindBy(xpath = "//app-attendance[@class='ng-star-inserted']")
	  WebElement captureAssigText;
	  
	  public String captureAssigmentText() {
		  return captureAssigText.getText();
	  }
	  

	    // capture  screen  text 
	  @FindBy(xpath = "//form[@class='ng-untouched ng-pristine ng-invalid']/p")
	  WebElement captureLoginText;
	  
	  public void CaptureLoginText() {
		  captureLoginText.getText();
	  }
	    
	    
	  }