package pomClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SelectByNowAndVerify {
	
	// Variable : WebElement : SelectByNowAndVerify
	
	@FindBy(xpath="//button[text()='Add to cart']")
	private WebElement addToCartButton;
	
	@FindBy(xpath="//a[@class='_3SkBxJ']")
	private WebElement clickOnAddToCart;
	
	// Constructor : Intialization of WebElement : SelectByNowAndVerify
	
	public SelectByNowAndVerify(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	// Method : Action On WebElement : SelectByNowAndVerify
	
	public void toClickByNowButton() {
		addToCartButton.click();
	}
	public void toClickCheakOnAddToCart() {
		clickOnAddToCart.click();
	}
}
