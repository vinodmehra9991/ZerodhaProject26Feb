package TestCases;

import java.io.IOException;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Base.TestBase;
import Pages.LoginPage;

public class LoginPageTest extends TestBase {
	
	LoginPage login;
	@BeforeMethod
	public void  setup() throws IOException
	{
		initialization();
		login = new LoginPage();
	}
	
	@Test
	public void verifytitletest()
	{
		String title = login.verifytitle();
	  org.testng.Assert.assertEquals("Kite - Zerodha's fast and elegant flagship trading platform", title);
	}
	
	@Test (dependsOnMethods = "verifytitletest")
			public void verifykitelogotest()
	  {
		Boolean kite =  login.verifykitelogo();
		org.testng.Assert.assertEquals(kite, true);
	}
	
	
	@Test (dependsOnMethods = "verifytitletest")
	public void verifyzerodhalogotest()
	{
		Boolean zerodha = login.verifyzerodhalogo();
		org.testng.Assert.assertEquals(zerodha, true);
	}
	
	@Test (dependsOnMethods = "verifytitletest")
	public void loginsetuptest() throws InterruptedException, IOException
	{
		login.loginsetup();
	}
	
	
	@AfterMethod
	
	public void exit()
	{
		driver.quit();
	}

}
