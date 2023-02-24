package utils;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class Utility {

	// 2 method - public static

	// for screenshot
	// excellsheet
	private static WebDriver driver;

	public static void captureScreenShot(String testID) throws IOException {

		TakesScreenshot ts = (TakesScreenshot) driver;
		File src = ts.getScreenshotAs(OutputType.FILE);
		File dest = new File("D:\\Testing\\Selenium\\takescreenshots\\" + timestamp() + testID + ".jpeg");

		FileHandler.copy(src, dest);

	}

	private static String timestamp() {
		return new SimpleDateFormat("dd-MM-yyyy HH-mm-ss").format(new Date());

	}

	public static String getExcellSheetData(String sheet, int row, int cell) throws EncryptedDocumentException, IOException {

		String path = "D:\\Testing\\IMP NOtes\\TestFetchData.xlsx";
		try {
		InputStream file = new FileInputStream(path);
		
		String value=WorkbookFactory.create(file).getSheet(sheet).getRow(row).getCell(cell).getStringCellValue();}
		catch (Exception e){
//			double value= getNumericCellValue();
//			data= convert double to String;
//			
		}
		return path;
		

			
}
}
