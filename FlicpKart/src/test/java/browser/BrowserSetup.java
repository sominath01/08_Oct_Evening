package browser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BrowserSetup {
	
	public static WebDriver lauchChromeBrowser() {
		System.setProperty("webdriver.chrome.driver",
				"C:\\TestingAutomation\\NEW Path Folder\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		return driver;
	}
	public static WebDriver lauchEdgeBrowser() {
		System.setProperty("webdriver.edge.driver", "C:\\TestingAutomation\\edgedriver_win64 (1)\\msedgedriver.exe");
		WebDriver driver = new EdgeDriver();
		return driver;
	}
	public static WebDriver lauchFirfoxBrowser() {
		System.setProperty("webdriver.gecko.driver",
				"C:\\Users\\Somin\\Downloads\\geckodriver-v0.32.2-win32\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		return driver;
	}

}
//"C:\Users\Somin\Downloads\geckodriver-v0.32.2-win-aarch64\geckodriver.exe"