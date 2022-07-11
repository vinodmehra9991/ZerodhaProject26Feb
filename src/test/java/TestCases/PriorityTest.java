package TestCases;

	import java.io.IOException;

import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
	import org.testng.annotations.BeforeMethod;
	import org.testng.annotations.Test;

	import Base.TestBase;
	import Pages.LoginPage;

	public class PriorityTest extends TestBase {
		
		LoginPage login;
		@BeforeMethod
		public void  setup() throws IOException
		{
			initialization();
			login = new LoginPage();
		}
		
		@Test (priority = -1)
				public void verifytitletest()
		{
			String title = login.verifytitle();
		  org.testng.Assert.assertEquals("Kite - Zerodha's fast and elegant flagship trading platform", title);
		   Reporter.log("Executive the verifytitletest"); 
		}
		
		@Test (priority = 0)
				public void verifykitelogotest()
		  {
			Boolean kite =  login.verifykitelogo();
			org.testng.Assert.assertEquals(kite, true);
			Reporter.log("Executive the verifykitelogotest");
		}
		
		
		@Test (priority = 1)
		public void verifyzerodhalogotest()
		{
			Boolean zerodha = login.verifyzerodhalogo();
			org.testng.Assert.assertEquals(zerodha, true);
			Reporter.log("Executive the verifyzerodhalogotest");
		}
		
		@Test (priority = 2)
		public void loginsetuptest() throws InterruptedException, IOException
		{
			login.loginsetup();
			Reporter.log("Executive the loginsetuptest");
		}
		
		
		@AfterMethod
		
		public void exit()
		{
			driver.quit();
		}

	}


