package Testcases;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import baseclassmain.baseclass;
import pages.Loginpage;

public class Login extends baseclass {

    Loginpage loginpage;

    public Login() throws IOException {
        super();
    }

    @BeforeMethod
    public void setup1() throws IOException {
        initialization();
        loginpage = new Loginpage(); // Initialize loginpage object here
    }

//    @Test
//    public void loginpage() {
//        String title = loginpage.validateloginpage();
//        Assert.assertEquals(title, "Login");
//    }

    @Test
    public void login() throws IOException {
        loginpage.login(prop.getProperty("username"), prop.getProperty("password"));
    }
}
