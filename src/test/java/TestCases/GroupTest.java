package TestCases;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Base.TestBase;
import Pages.LoginPage;

public class GroupTest extends TestBase

{
	LoginPage login;
	@BeforeMethod
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
	
	@AfterMethod
	public void exit()
	{
		driver.close();
	}

}

