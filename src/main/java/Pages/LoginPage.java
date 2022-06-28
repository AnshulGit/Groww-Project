package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Base.TestBase;

public class LoginPage extends TestBase
{
	//object repository
	@FindBy(xpath="(//img[@alt='Groww Logo'])[1]") private WebElement growwLogo;
	@FindBy(xpath="//span[text()='Login/Register']") private WebElement loginbtn;
	
	public LoginPage()
	{
		PageFactory.initElements(driver, this);
	}
	
	//methods 
	public String verifyTtile()
	{
		return driver.getTitle();
	}
	public boolean verifyLogo()
	{
		return growwLogo.isDisplayed();
	}
	public boolean verifyLoginBtn()
	{
		return loginbtn.isDisplayed();
	}

}
