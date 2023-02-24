package pomClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SerchMainBar {
	
	// Variable : WebElement : Serch Main Bar
	
	@FindBy(xpath="(//input[@type='text'])[1]")
	private WebElement searchButtonSend;
	
	@FindBy(xpath="//button[@type='submit']")
	private WebElement serchButtonClick;
	
	// Constructor : Intilization WebElement : Serch Main Bar
	
	public SerchMainBar(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	// Method : Action on WebElement : Serch Main Bar
	
	public void sendkeyOnMainSerchButton(String Product) {
		searchButtonSend.sendKeys(Product);
		
	}
	public void clickOnSerchBar() {
		serchButtonClick.click();
		
	}//button[@type=\"submit\"]

}
