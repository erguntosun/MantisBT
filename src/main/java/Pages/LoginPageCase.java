package Pages;

import login.LoginPage;

import java.util.concurrent.TimeUnit;

public class LoginPageCase extends WebElements {
    public LoginPageCase(){}
        LoginPage loginPage = new LoginPage();

    public void navigateToWebsite(){
        driver.manage().window().maximize();
        driver.get(URL);
        driver.manage().timeouts().implicitlyWait(8, TimeUnit.SECONDS);
    }

    public void loginWebsite() {
        navigateToWebsite();
        loginPage.insertUsername();
        loginPage.clickLoginButton();
        loginPage.insertPassword();
        loginPage.clickLoginButton();
    }

}
