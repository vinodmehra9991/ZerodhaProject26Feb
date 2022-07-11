package TestCases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ParallelTest {

	public void FB() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\vinod\\eclipse-workspace\\ZerodhaProject26Feb\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://www.facebook.com/");
		Thread.sleep(2000);
	}
	public void Instu() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\vinod\\eclipse-workspace\\ZerodhaProject26Feb\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://www.instagram.com/");
		Thread.sleep(2000);
	}
	public void kuku() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\vinod\\eclipse-workspace\\ZerodhaProject26Feb\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://kukufm.com/");
		Thread.sleep(2000);
	}
	
}
