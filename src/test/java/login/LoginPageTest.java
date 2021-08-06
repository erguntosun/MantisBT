package login;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import Pages.LoginPageCase;
import Pages.WebElements;

public class LoginPageTest extends WebElements {
    LoginPage loginPage = new LoginPage();
    LoginPageCase loginPageCase = new LoginPageCase();

    @AfterMethod
    public  void teardown(){quitDriver();}

    @Test
    void loginWebsite(){
        loginPageCase.navigateToWebsite();
        loginPage.insertUsername();
        loginPage.clickLoginButton();
        loginPage.insertPassword();
        loginPage.clickLoginButton();
        Assert.assertEquals(driver.getTitle(),"Übersicht - MantisBT");
        System.out.println("Page Title :  " + driver.getTitle());
    }

}
