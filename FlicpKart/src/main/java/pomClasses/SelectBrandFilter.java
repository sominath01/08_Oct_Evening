package pomClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SelectBrandFilter {

	// Variable : WebElement : SelectBrandFilter

	@FindBy(xpath = "//div[text()='Brand']")
	private WebElement clickOnBrandfilter;

	@FindBy(xpath = "//div[text()='HP']")
	private WebElement clickHpCheckBox;

	@FindBy(xpath = "(//div//a//div[@class='_4rR01T'])[1]")
	private WebElement clickOnProduct;

	// Constructor : Intionlization of WebElement : SelectBrandFilter
	WebDriver driver;

	public SelectBrandFilter(WebDriver driver) {
		PageFactory.initElements(driver, this);
		this.driver = driver;

	}

	// Method : Action on WebElement : SelectBrandFilter

	public void clickOnBrandFilterButton() {
		clickOnBrandfilter.click();
	}

	public void clickOnCheakBoxInHp() {
		clickHpCheckBox.click();
	}

	public void clickOnProduct() {
//		WebDriverWait wait = new WebDriverWait(driver, 10);
//		wait.until(ExpectedConditions.invisibilityOf(clickOnProduct));
		clickOnProduct.click();
	}

}
