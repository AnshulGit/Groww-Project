package Base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestBase 
{
	
	public static WebDriver driver;
	
	public String readProperrtyFile(String value) throws IOException
	{
		Properties prop = new Properties();
		FileInputStream file = new FileInputStream("C:\\Users\\91940\\OneDrive\\Desktop\\Eclipse Workspace\\Project2\\src\\main\\java\\Config\\Config.properties");
		prop.load(file);
		return prop.getProperty(value);
		
	}
	
	
	public void initialization() throws IOException
	{
	System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
	driver = new ChromeDriver();
	driver.manage().window().maximize();
//	driver.get("https://groww.in/");
	driver.get(readProperrtyFile("url"));
	driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
	}

}
