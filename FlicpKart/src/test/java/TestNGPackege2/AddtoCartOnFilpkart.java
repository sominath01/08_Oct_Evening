package TestNGPackege2;

import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import browser.BrowserSetup;
import pomClasses.DismissOfPopup;
import pomClasses.SelectBrandFilter;
import pomClasses.SelectByNowAndVerify;
import pomClasses.SelectElectronics;

public class AddtoCartOnFilpkart extends BrowserSetup{
	
	
	private WebDriver driver;
	SelectElectronics selectElectronics;
	SelectBrandFilter selectBrandFilter;
	SelectByNowAndVerify selectByNowAndVerify;
	
	@Parameters("browser")
	@BeforeTest
	public void toLauncBrowser(String browserName) {
		System.out.println(browserName);

		if (browserName.equals("Chrome")) {
			driver=lauchChromeBrowser();
		}
		if (browserName.equals("Edge")) {
			driver=lauchEdgeBrowser();
		}
		if (browserName.equals("Firfox")) {
			driver=lauchFirfoxBrowser();
		}

		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.manage().window().maximize();
	}
	@BeforeClass
	public void createPomClassObjects() {
		System.out.println("Before Class");
		selectElectronics = new SelectElectronics(driver);
		selectBrandFilter = new SelectBrandFilter(driver);
		selectByNowAndVerify= new SelectByNowAndVerify(driver);
	}
	

	@BeforeMethod
	public void goToMainPageOnFlipkart() {
		System.out.println("Before Method");
		driver.get("https://www.flipkart.com/");

		DismissOfPopup dismissOfPopup = new DismissOfPopup(driver);
		dismissOfPopup.clickOnCrossButton();

	}

	@Test(priority = 0)
	public void clickOnElectronicsButto() throws InterruptedException {
		System.out.println("Test");
		
		selectElectronics.toClickOnElectroncs();
		selectElectronics.toClickOnLaptopAndDesk();

		
		
		selectBrandFilter.clickOnBrandFilterButton();
		selectBrandFilter.clickOnCheakBoxInHp();
		Thread.sleep(2000);
		selectBrandFilter.clickOnProduct();
		ArrayList<String> addr= new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(addr.get(1));
		
		
		selectByNowAndVerify.toClickByNowButton();
		
		selectByNowAndVerify.toClickCheakOnAddToCart();
		
		
		
		
	}

	@Test(priority = 1, enabled = false)
	public void toVerifyFilterOnHp() {

	}

	@AfterMethod
	public void afterMethod() {
		System.out.println("After Method");
		driver.close();
	}

	@AfterClass
	public void afterClass() {
		System.out.println("After Class");
		selectElectronics = null;
		selectBrandFilter = null;
		selectByNowAndVerify=null;
	}
	@AfterTest
	public void closeBrowser() {
		driver.quit();
		driver=null;
		
		System.gc(); // garbege collecter
	}

}
