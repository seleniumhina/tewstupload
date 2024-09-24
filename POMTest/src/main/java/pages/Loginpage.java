package pages;



import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import baseclassmain.baseclass;

public class Loginpage extends baseclass {

	
	@FindBy(name="email")
	WebElement email;
	
	@FindBy(name="password")
	WebElement password;
	
	@FindBy(xpath="(//button[normalize-space()='Submit'])[1]")
	WebElement submit;
	
//	@FindBy(xpath="(//p[@class='oxd-text oxd-text--p orangehrm-login-forgot-header'])[1]")
//	WebElement forgot;
	
	
	public Loginpage() throws IOException {
		//PageFactory.initElements("driver",this)
	;	
PageFactory.initElements(driver, this);	
		
	}
	
	
	public String validateloginpage() {
		return driver.getTitle();
		
		
		
		
	}
	
	public home login(String un, String pwd) throws IOException {
		
		email.sendKeys(un);
		password.sendKeys(pwd);
		submit.click();
		
		
		return new home();
		
	}

	

	
	}

 
 