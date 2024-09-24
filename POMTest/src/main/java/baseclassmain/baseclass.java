package baseclassmain;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import utilitycommin.TestUtil;

public class baseclass {

// private static final long PAGE_LOAD_TIMEOUT = 0;
//private static final long IMPLICIT_WAIT = 0;
public static	WebDriver driver;
public static Properties prop;
	
	public baseclass() throws IOException
	{
		
		try {
			prop = new Properties();
			FileInputStream ip = new FileInputStream("C:\\Users\\hinai\\New workspace\\POMTest\\src\\main\\java\\configuration\\config.properties");
			prop.load(ip);
			
			}catch (FileNotFoundException e)
		{
				e.printStackTrace();
		}catch (IOException e)
		{
			e.printStackTrace();
		}
		
	}
	
	@SuppressWarnings("deprecation")
	public static void initialization() {
		
		String browser =prop.getProperty("browser");
		if(browser.equals(browser)) {
			
			System.setProperty("webdriver.chrome.driver", "C:\\Webdriver\\chromedriver-win64\\chromedriver.exe");
	        driver = new ChromeDriver();
		}
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(TestUtil.PAGE_LOAD_TIMEOUT, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(TestUtil.IMPLICIT_WAIT, TimeUnit.SECONDS);
		driver.get(prop.getProperty("url"));
	}
	
	
	
	
	
}
