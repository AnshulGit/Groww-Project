package TestCases;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Base.TestBase;

import Pages.LoginPage;

//Author name : Anshul Siddham, Checking this for testing purpose and checking if changes made in 
// git repository or not. 

public class LoginPageTest extends TestBase

{
	LoginPage login;
	@BeforeTest
	public void setup() throws IOException
	{
		initialization();
	    login = new LoginPage();
	}
	
	@Test
	public void verifyLogoTest()
	{
		boolean logo = login.verifyLogo();
		Assert.assertEquals(true, logo);
	}
	@Test
	public void verifyLoginBtnTest()
	{
		boolean loginBtn = login.verifyLoginBtn();
		Assert.assertEquals(true, loginBtn);
	}
	@Test
	public void verifyTitleTest()
	{
		String title = login.verifyTtile();
		Assert.assertEquals("Groww - Online Demat, Trading and Direct Mutual Fund Investment in India", title);
	}
	
	@AfterTest
	public void exit()
	{
		driver.close();
	}

}
