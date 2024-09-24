package pages;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Testcases.usermanagement;
import baseclassmain.baseclass;

public class home extends baseclass {

    @FindBy(xpath="(//p[@class='MuiTypography-root MuiTypography-body1 css-o2ys2x' and contains(text(),'Business Plan for Calendar Year 2025')])[1]")
    WebElement check;
	
//    @FindBy(xpath="(//div[@id='level_1_1'])[1]")
//    static WebElement setupandconfig;
//    
//    
//	
//    
//    // @FindBy(xpath="(//span[normalize-space()='BPLC Workflow'])[1]")
//    // static WebElement bplcworkflow;
	
    public home() throws IOException {
        PageFactory.initElements(driver, this);
    }

	public usermanagement clickonsetup() {
		// TODO Auto-generated method stub
		return null;
	}
	
//    public String verifydashboardTitle() {
//        return driver.getTitle();
//    }
	
}
