package pomClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProductAnyClick {
	
	// Variable : WebElment : Product Any Click
	 
	@FindBy(xpath="(//div//a//div[@class='_4rR01T'])[1]")
	private WebElement selectAnyProduct;
	
	@FindBy(xpath="//button[@type='button']")
	private WebElement buyNow;
	
	// Constructor : Intilization WebElment : Product Any Click
	
	public ProductAnyClick(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	// Method : Action On WebElement : Product Any Click
	
	public void clickOnAnyProduct() {
		selectAnyProduct.click();
	}
	public void clickOnBuyNow() {
		buyNow.click();
	}
	

}
