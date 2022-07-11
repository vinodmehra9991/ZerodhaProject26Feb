package Pages;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Base.TestBase;


//Step 3 - 
public class LoginPage extends TestBase {
	
@FindBy(xpath = "//img[@alt='Kite']") private WebElement KiteLogo;
@FindBy(xpath = "//img[@alt='Zerodha']") private WebElement zerodhaLogoElement;
@FindBy(xpath = "//input[@id='userid']") private WebElement UserID;
@FindBy(xpath = "//input[@id='password']") private WebElement Password;
@FindBy(xpath = "//button[@class='button-orange wide']") private WebElement LoginButton;	
@FindBy(xpath = "//input[@id='pin']") private WebElement pin;
@FindBy(xpath = "//button[@class='button-orange wide']") private WebElement continuButton;

public LoginPage() 
{
	PageFactory.initElements(driver, this);
}

public String verifytitle()
{
	return driver.getTitle();
}


public boolean verifykitelogo() 
{
	 return KiteLogo.isDisplayed();
}


public boolean verifyzerodhalogo()
{
	return zerodhaLogoElement.isDisplayed();
}

public void loginsetup() throws InterruptedException, IOException
{
	UserID.sendKeys(readpropertyfile("Username"));
	Thread.sleep(1000);
	Password.sendKeys(readpropertyfile("Password"));
	Thread.sleep(1000);
	LoginButton.click();
	Thread.sleep(5000);
	pin.sendKeys(readpropertyfile("pin"));
	Thread.sleep(1000);
	continuButton.click();
	Thread.sleep(2000);
}
 
}
