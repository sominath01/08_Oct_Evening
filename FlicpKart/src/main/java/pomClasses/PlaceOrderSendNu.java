package pomClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class PlaceOrderSendNu {
	
	// Variable : WebElement : PlaceOrderSendNu
	
	@FindBy(xpath="//input[@autocomplete='off']")
	private WebElement sendMobileNumber;
	
	
	@FindBy(xpath="//span[text()='CONTINUE']")
	private WebElement finalSumbitButton;
	// Constructor :  Intilization of WebElement : PlaceOrderSendNu
	private WebDriverWait wait;
	@SuppressWarnings("unused")
	private WebDriver driver;
	public PlaceOrderSendNu(WebDriver driver) {
		PageFactory.initElements(driver, this);
		this.driver=driver;
//		wait= new WebDriverWait(driver,30);
	}
	
	// Method : Action on WebElement : PlaceOrderSendNu 
	
	public void clickOnMobileNumber(String mobile) {
		wait= new WebDriverWait(driver,20);
		wait.until(ExpectedConditions.visibilityOf(sendMobileNumber));
		sendMobileNumber.sendKeys(mobile);
		
	}
	
	public void clickOnSumbitButton() {
		wait= new WebDriverWait(driver,40);
		wait.until(ExpectedConditions.visibilityOf(finalSumbitButton));
	
		finalSumbitButton.click();
	}

}
