package TestCases;

	import java.io.IOException;

import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
	import org.testng.annotations.BeforeMethod;
	import org.testng.annotations.Test;

	import Base.TestBase;
	import Pages.LoginPage;

	public class GroupTest extends TestBase {
		
		LoginPage login;
		@BeforeMethod(groups = {"Sanity","Regression"})
		public void  setup() throws IOException
		{
			initialization();
			login = new LoginPage();
		}
		
		@Test (groups = {"Sanity"})
				public void verifytitletest()
		{
			String title = login.verifytitle();
		  org.testng.Assert.assertEquals("Kite - Zerodha's fast and elegant flagship trading platform", title);
		   Reporter.log("Executive the verifytitletest"); 
		}
		
		@Test (groups = {"Sanity"})
				public void verifykitelogotest()
		  {
			Boolean kite =  login.verifykitelogo();
			org.testng.Assert.assertEquals(kite, true);
			Reporter.log("Executive the verifykitelogotest");
		}
		
		
		@Test (groups = {"Regression"})
		public void verifyzerodhalogotest()
		{
			Boolean zerodha = login.verifyzerodhalogo();
			org.testng.Assert.assertEquals(zerodha, true);
			Reporter.log("Executive the verifyzerodhalogotest");
		}
		
		@Test (groups = {"Regression"})
		public void loginsetuptest() throws InterruptedException, IOException
		{
			login.loginsetup();
			Reporter.log("Executive the loginsetuptest");
		}
		
		
		@AfterMethod(groups = {"Sanity","Regression"})
		
		public void exit()
		{
			driver.quit();
		}

	}

