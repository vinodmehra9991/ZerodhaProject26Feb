package TestCases;

	import java.io.IOException;

import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
	import org.testng.annotations.BeforeMethod;
	import org.testng.annotations.Test;

	import Base.TestBase;
	import Pages.LoginPage;

	public class HardAssert extends TestBase {
		
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
			System.out.println("verifytitletest is executed");
		  org.testng.Assert.assertEquals("1Kite - Zerodha's fast and elegant flagship trading platform", title);
		}
		
		@Test 
				public void verifykitelogotest()
		  {
			Boolean kite =  login.verifykitelogo();
			org.testng.Assert.assertEquals(kite, true);
			Reporter.log("Executive the verifykitelogotest");
		}
		
		
		@Test 
		public void verifyzerodhalogotest()
		{
			Boolean zerodha = login.verifyzerodhalogo();
			org.testng.Assert.assertEquals(zerodha, true);
			Reporter.log("Executive the verifyzerodhalogotest");
		}
		
		@Test 
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


