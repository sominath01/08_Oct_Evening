package pomClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SelectElectronics {
	
	// Variable : WebElement : SelectElectronics
	
	@FindBy(xpath="//div[text()='Electronics']")
	private WebElement clickOnElecronics;
	
	@FindBy(xpath="//a[text()='Laptop and Desktop']")
	private WebElement clickComputerAndDeskTop;
	
	// Constructor : Inttionlization of WebElement : SelectElectronics
	private WebDriver driver;
	Actions action;
	public SelectElectronics(WebDriver driver) {
		PageFactory.initElements(driver, this);
		this.action=new Actions(driver);
	}
	
	// Method : Actoin on WebElement : SelectElectronics
	
	public void toClickOnElectroncs() {
//		Actions action= new Actions(driver);
		action.moveToElement(clickOnElecronics).build().perform();
		
	}
	
	public void toClickOnLaptopAndDesk() {
//		Actions action = new Actions(driver);
		action.moveToElement(clickComputerAndDeskTop).click().build().perform();
	}

}
