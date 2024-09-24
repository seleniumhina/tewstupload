package Testcases;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import baseclassmain.baseclass;
import pages.Loginpage;
import pages.home;
import pages.dropdown;

public class dashboardtestcase extends baseclass {

    Loginpage loginpage;
    home dashboardPage; // Create an instance of the dashboard page

    public dashboardtestcase() throws IOException {
        super();
    }
    
    @BeforeMethod
    public void setup1() throws IOException {
        initialization();
        loginpage = new Loginpage(); 
        loginpage.login(prop.getProperty("username"), prop.getProperty("password"));
        dashboardPage = new home(); // Initialize the dashboard page
    }
    
//    @Test
//    public void verifydashboardTitle() {
//        // Retrieve the actual dashboard title from the page
//        String actualTitle = dashboardPage.verifydashboardTitle();
//        String expectedTitle = "Macroplan 2140";
//        Assert.assertEquals(actualTitle, expectedTitle, "Dashboard title does not match");
//    }
//    
   
    	
    	@Test
        public void BPPlanAdd() throws InterruptedException {
            driver.findElement(By.id("level_1_1")).click();
            Thread.sleep(2000);
            driver.findElement(By.id("level_2_3-business-plan-config")).click();
            Thread.sleep(2000);

            WebElement uploadElement = driver.findElement(By.xpath("//input[@type='file']"));
            String filePath = "C:\\Users\\hinai\\Pictures\\Saved Pictures\\png.jpg";
            uploadElement.sendKeys(filePath);
            Thread.sleep(5000);
          driver.findElement(By.xpath("/html/body/div[1]/div/div/main/div/div/div/div/div[1]/div[3]/div[2]/div[1]/div/div/div")).click();
          Thread.sleep(2000);    
          
          driver.findElement(By.xpath("//li[normalize-space()='Calendar']")).click();

            driver.findElement(By.xpath("//body[1]/div[1]/div[1]/div[1]/main[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/button[1]")).click();; 
            Thread.sleep(2000);
            driver.findElement(By.xpath("(//button[@aria-label='Choose date, selected date is Jan 1, 2025'])[1]")).click();   
            driver.findElement(By.name("bpPrefix")).sendKeys("G");    
           driver.findElement(By.name("bpSequenceNumber")).sendKeys("2");
           driver.findElement(By.name("initiativePrefix")).sendKeys("o");
           driver.findElement(By.name("initiativeSequenceNumber")).sendKeys("0");
           
           driver.findElement(By.name("programPrefix")).sendKeys("G");    
           driver.findElement(By.name("programSequenceNumber")).sendKeys("2");
           driver.findElement(By.name("issueLogs.issueIdPrefix")).sendKeys("0");
           driver.findElement(By.name("bpFromMaxVersion")).sendKeys("3");
           driver.findElement(By.name("ifrMaxVersion")).sendKeys("3");
           driver.findElement(By.name("workingHoursInDay")).sendKeys("1");    
           driver.findElement(By.name("durationForMonth")).sendKeys("2");
           driver.findElement(By.name("monthWorkdays")).sendKeys("0");
           driver.findElement(By.name("monthYear")).sendKeys("5");
           driver.findElement(By.name("tolerance")).sendKeys("3");
           driver.findElement(By.xpath("//div[@class='MuiGrid-root MuiGrid-item MuiGrid-grid-xs-1 css-1vp760d']//span[@role='button']//*[name()='svg']")).click();
           driver.findElement(By.xpath("(//div[@id='mui-component-select-tShirtSizePram[2].size'])[1]")).click();
           driver.findElement(By.xpath("(//li[normalize-space()='L'])[1]")).click();        
           driver.findElement(By.name("tShirtSizePram[2]durationForMonth[min]")).sendKeys("1");    
           driver.findElement(By.name("tShirtSizePram[2]durationForMonth[max]")).sendKeys("20");
           driver.findElement(By.name("tShirtSizePram[2]effort[min]")).sendKeys("0");
           driver.findElement(By.name("tShirtSizePram[2]effort[max]")).sendKeys("20");
           driver.findElement(By.name("tShirtSizePram[2]fteCount[min]")).sendKeys("0");
           driver.findElement(By.name("tShirtSizePram[2]fteCount[max]")).sendKeys("30");   
           driver.findElement(By.xpath("(//span[@role='button'])[3]")).click();
           driver.findElement(By.id("mui-component-select-l2aConfig.2.deliverEffort")).click();
           driver.findElement(By.xpath("(//li[normalize-space()='Low'])[1]")).click();
         
           driver.findElement(By.name("l2aConfig.2.workdays")).sendKeys("3");
           driver.findElement(By.xpath("(//span[@role='button'])[4]")).click();
           driver.findElement(By.xpath("(//div[@id='mui-component-select-l2bEstimateFactor.1.deliverEffort'])[1]")).click();
       driver.findElement(By.xpath("(//li[normalize-space()='Medium'])[1]")).click();
       driver.findElement(By.name("l2bEstimateFactor.1.workdays")).sendKeys("4");
       driver.findElement(By.id("mui-component-select-l2cEstimateGuideline.deliver.0.deliverEffort")).click();
       driver.findElement(By.xpath("(//li[normalize-space()='High'])[1]")).click();
           driver.findElement(By.name("l2cEstimateGuideline.deliver.0.workdays")).sendKeys("7");
    ;
    driver.findElement(By.name("l2aEstimateGuidelineMin")).sendKeys("3");
    driver.findElement(By.name("l2aEstimateGuidelineMax")).sendKeys("8");
    driver.findElement(By.xpath("(//button[normalize-space()='Save'])[1]")).click();


        
    	
    }
}
