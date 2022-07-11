package Base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.opera.OperaDriver;

public class TestBase {
	
	public static WebDriver driver;
	
	
	//Step 2 = Add the URL address in step 1 from the file which is in Config Package
	 public String readpropertyfile(String value) throws IOException
	 {
		 Properties properties = new Properties();
		 FileInputStream file = new FileInputStream("C:\\Users\\vinod\\eclipse-workspace\\ZerodhaProject26Feb\\src\\main\\java\\Config\\Config.properties");
		 properties.load(file);
		return properties.getProperty(value);
	 }

	 // Step 1 = To call the Chromedriver & disable the website notification
	public void initialization() throws IOException
	{
		String browsername = readpropertyfile("browser");
		if (browsername.equalsIgnoreCase("chrome"))
		{
			
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");
		
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\vinod\\eclipse-workspace\\ZerodhaProject26Feb\\Drivers\\chromedriver.exe");
		driver = new ChromeDriver(options);
		}
		
		else if (browsername.equalsIgnoreCase("gecko"))
		{
			System.setProperty("webdriver.gecko.driver", 
					"C:\\Users\\vinod\\eclipse-workspace\\ZerodhaProject26Feb\\Drivers\\geckodriver.exe");
			driver = new FirefoxDriver();
		}
		
		else if (browsername.equalsIgnoreCase("Opera"))
		{
			System.setProperty("webdriver.opera.driver", 
					"C:\\Users\\vinod\\eclipse-workspace\\ZerodhaProject26Feb\\Drivers\\operadriver.exe");
			driver = new OperaDriver();
		}
		
		else if (browsername.equalsIgnoreCase("msedge"))
		{
			System.setProperty("webdriver.edge.driver", 
					"C:\\Users\\vinod\\eclipse-workspace\\ZerodhaProject26Feb\\Drivers\\msedgedriver.exe");
			driver = new EdgeDriver();
					}
		
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get(readpropertyfile("url"));
		
	} 
	
	public String ReadExcelsheet(int RowNum, int ColNum ) throws EncryptedDocumentException, IOException
	{
		FileInputStream file = new FileInputStream("C:\\Users\\vinod\\eclipse-workspace\\ZerodhaProject26Feb\\TestData\\TestData.xls");
		Sheet excel = WorkbookFactory.create(file).getSheet("Sheet1");
	    String value	= excel.getRow(RowNum).getCell(ColNum).getStringCellValue();	
	    return value;
	}

}
