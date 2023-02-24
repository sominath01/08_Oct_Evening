package TestNGPackege2;

import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
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
import pomClasses.PlaceOrderSendNu;
import pomClasses.ProductAnyClick;
import pomClasses.SerchMainBar;

public class PlaceOrderClassFlipkart {
	
	private WebDriver driver;
	ArrayList<String> addr;
	SerchMainBar serchMainBar;
	ProductAnyClick productAnyClick;
	PlaceOrderSendNu placeOrderSendNu ;
	

	@Parameters("browser")
	@BeforeTest
	public void toLaunchBrowser(String browserName) {
		System.out.println(browserName);
		
		if (browserName.equals("Chrome")) {
			
			driver=BrowserSetup.lauchChromeBrowser();
		
		}
		if (browserName.equals("Edge")) {
			driver=BrowserSetup.lauchEdgeBrowser();
		}
		if (browserName.equals("Firfox")) {
			driver=BrowserSetup.lauchFirfoxBrowser();

		}//"C:\TestingAutomation\geckodriver-v0.32.2-win-aarch64\geckodriver.exe"

		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.manage().window().maximize();
	}

	@BeforeClass
	public void createPOMObjects() {
		System.out.println("Before Class");
		serchMainBar = new SerchMainBar(driver);
		productAnyClick = new ProductAnyClick(driver);
		placeOrderSendNu= new PlaceOrderSendNu(driver);
	}

	@BeforeMethod
	public void goToMainPageFlipKart() {
		System.out.println("Before Method");
		driver.get("https://www.flipkart.com/");

		DismissOfPopup dismissOfPopup = new DismissOfPopup(driver);
		dismissOfPopup.clickOnCrossButton();

	}

	@Test
	public void verifyCorrectProduct() throws InterruptedException {
		
		serchMainBar.sendkeyOnMainSerchButton("mobile");
		serchMainBar.clickOnSerchBar();

		
		productAnyClick.clickOnAnyProduct();
		ArrayList<String> addr = new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(addr.get(1));
		productAnyClick.clickOnBuyNow();
//			String actualData=" https://www.flipkart.com/samsung-galaxy-f04-opal-green-64-gb/p/itmd0c05f8b03876?pid=MOBGKY2V7QZ2QVFS&lid=LSTMOBGKY2V7QZ2QVFSGOGYVU&marketplace=FLIPKART&q=mobile&store=tyy%2F4io&srno=s_1_1&otracker=search&otracker1=search&fm=organic&iid=a84665be-3438-4807-8229-048526a4b946.MOBGKY2V7QZ2QVFS.SEARCH&ppt=hp&ppn=homepage&ssid=swcgoxer3k0000001676369871479&qH=532c28d5412dd75b";
//			String expectedResult="https://www.flipkart.com/samsung-galaxy-f04-opal-green-64-gb/p/itmd0c05f8b03876?pid=MOBGKY2V7QZ2QVFS&lid=LSTMOBGKY2V7QZ2QVFSGOGYVU&marketplace=FLIPKART&q=mobile&store=tyy%2F4io&srno=s_1_1&otracker=search&otracker1=search&fm=organic&iid=a84665be-3438-4807-8229-048526a4b946.MOBGKY2V7QZ2QVFS.SEARCH&ppt=hp&ppn=homepage&ssid=swcgoxer3k0000001676369871479&qH=532c28d5412dd75b ";
//			
//			Assert.assertEquals(actualData, expectedResult, "click Button not Click RightProduct");
					
//		Thread.sleep(2000);
		

		placeOrderSendNu.clickOnMobileNumber("8464132438");
		placeOrderSendNu.clickOnSumbitButton();

	}

	@AfterMethod
	public void afterMehtod() {
		System.out.println("After Method");
		driver.close();
	}

	@AfterClass
	public void closePOMClasses() {
		System.out.println("After Class");
		serchMainBar=null;
		productAnyClick=null;
		placeOrderSendNu=null;
	}
	@AfterTest
	public void afterMethod(){
		
		driver.quit();
		driver=null;
		
		System.gc(); // garbege collecter

	}

}
