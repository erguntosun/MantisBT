package stepdefination;

import cucumber.api.java.en.*;
import Pages.LoginPageCase;
import Pages.MyViewPage;
import Pages.WebElements;


public class MyView extends WebElements {
    LoginPageCase loginPageCase = new LoginPageCase();
    MyViewPage myViewPage = new MyViewPage();

    @Given("^I am on the MantisBT Home Page$")
    public void i_am_on_the_MantisBT_Home_Page() throws Throwable {
        loginPageCase.loginWebsite();

    }

    @When("^I click Report Issue button$")
    public void i_click_Report_Issue_button() throws Throwable {
        myViewPage.btnReportIssue();
    }

    @Then("^I should see new issue page$")
    public void i_should_see_new_issue_page() throws Throwable {
         //Assert.assertTrue(driver.findElement(By.xpath("//*[@id='select-project-form']/div/div[2]/div[2]/input")).isDisplayed());
        myViewPage.checkfirstass();
    }
}
