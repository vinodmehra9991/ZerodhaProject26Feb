package TestCases;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Base.TestBase;
import Pages.DashboardPage;
import Pages.LoginPage;

public class DashboardPageTest extends TestBase {
	
	DashboardPage dash;
	LoginPage login;
@BeforeMethod
public void setuo() throws IOException, InterruptedException
{
	initialization();
	login = new LoginPage();
     dash = new DashboardPage();
     login.loginsetup();
}

@Test
public void VerifyUsernametest() throws InterruptedException
{
	String  username = dash.VerifyUsername();
	Assert.assertEquals(username,"Akash Pundlikrao Kelwadkar");
}

@Test
public void verifyemailidtest() throws InterruptedException
{
	String email =  dash.verifyemailid();
	Assert.assertEquals(email, "iakashkelwadkar@gmail.com");
}

@Test
public void StartInvestingtest() throws InterruptedException, EncryptedDocumentException, IOException
{
	dash.StartInvesting();
}

@AfterMethod
public void exit() 
{
	driver.quit();
}

}
