package Pages;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.hssf.extractor.ExcelExtractor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Base.TestBase;

public class DashboardPage extends TestBase{

	@FindBy(xpath = "//div[@id='avatar-84']") private WebElement loginBar;
	@FindBy(xpath = "//h4[@class='username']") private WebElement username;
	@FindBy(xpath = "//div[@class='email']") private WebElement Emailid;
	
	@FindBy(xpath = "//button[text()='Start investing ']") private WebElement StartInvestingButton;
	@FindBy(xpath = "(//input[@type='text'])[2]") private WebElement SearchTextbar;
	@FindBy(xpath = "//li[@class='search-result-item selected']") private WebElement MRF;
	@FindBy(xpath = "//button[text()='Create GTT ']") private WebElement CreateGTTbutton;
	@FindBy(xpath = "//input[@label='Trigger price']") private WebElement TriggerPriceTextbox;
	@FindBy(xpath = "//input[@label='Qty.']") private WebElement QuantityTextBox;
	@FindBy(xpath = "//input[@label='Price']") private WebElement PriceTextbox;
	@FindBy(xpath = "//button[@class='button-outline cancel']") private WebElement CancelButton;
	
	
	
	public DashboardPage()
	{
		PageFactory.initElements(driver, this);
	}
	
	public String VerifyUsername() throws InterruptedException 
	{
		Thread.sleep(2000);
		loginBar.click();
		Thread.sleep(2000);
		return username.getText();
	}
	
	public String verifyemailid() throws InterruptedException
	{
		Thread.sleep(2000);
		loginBar.click();
		Thread.sleep(2000);
		return Emailid.getText();
	}
	
	public void StartInvesting() throws InterruptedException, EncryptedDocumentException, IOException
	{
		Thread.sleep(2000);
		StartInvestingButton.click();
		Thread.sleep(2000);
		SearchTextbar.sendKeys(ReadExcelsheet(0, 0));
		Thread.sleep(2000);
		MRF.click();
		Thread.sleep(2000);
		CreateGTTbutton.click();
		Thread.sleep(2000);
		TriggerPriceTextbox.clear();
		Thread.sleep(2000);
		TriggerPriceTextbox.sendKeys(ReadExcelsheet(0, 1));;
		Thread.sleep(2000);
		QuantityTextBox.clear();
		Thread.sleep(2000);
		QuantityTextBox.sendKeys(ReadExcelsheet(0, 2));
		Thread.sleep(2000);
		PriceTextbox.clear();
		Thread.sleep(2000);
		PriceTextbox.sendKeys(ReadExcelsheet(0, 3));
		Thread.sleep(2000);
		CancelButton.click();
		Thread.sleep(1000);
	}
}
