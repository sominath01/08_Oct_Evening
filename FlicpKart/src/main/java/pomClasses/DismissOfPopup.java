package pomClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DismissOfPopup {
	// Variable : WebElement : Dismiss Of Popup
	
	@FindBy(xpath="//button[@class='_2KpZ6l _2doB4z']")
	private WebElement crossButton;
	
	//Constructor : Initialization Of WebElement :  Dismiss Of Popup
	 
	public DismissOfPopup(WebDriver driver) {
		PageFactory.initElements(driver, this);
		
	}
	
	// Method : Action On Element :  Dismiss Of Popup
	
	public void clickOnCrossButton() {
		crossButton.click();
		
	}

	

}
