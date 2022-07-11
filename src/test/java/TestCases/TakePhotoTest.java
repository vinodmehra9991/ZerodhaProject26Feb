package TestCases;

import java.io.IOException;

import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Base.TestBase;
import Pages.LoginPage;
import Utility.UtilityClass;

public class TakePhotoTest extends TestBase {
	
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
	  org.testng.Assert.assertEquals("1Kite - Zerodha's fast and elegant flagship trading platform", title);
	}
	
	@Test 
			public void verifykitelogotest()
	  {
		Boolean kite =  login.verifykitelogo();
		org.testng.Assert.assertEquals(kite, true);
	}
	
	
	@Test 
	public void verifyzerodhalogotest()
	{
		Boolean zerodha = login.verifyzerodhalogo();
		org.testng.Assert.assertEquals(zerodha, false);
	}
	
	@Test 
	public void loginsetuptest() throws InterruptedException, IOException
	{
		login.loginsetup();
	}
	
	
	@AfterMethod
	public void exit(ITestResult itr) throws IOException
	{
		if (ITestResult.SUCCESS == itr.getStatus())
		{
			UtilityClass.TakePhoto(itr.getName()); 
		}
		driver.quit();
	}
	
		
	}


