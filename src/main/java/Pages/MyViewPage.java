package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MyViewPage extends WebElements {

    public MyViewPage () {
        PageFactory.initElements(driver, this);
    }

    //@FindBy(xpath = "//a[.=' Report Issue']")
    @FindBy(xpath = "//*[@id=\"navbar-container\"]/div[2]/ul/li[1]/div/a[1]")

    private WebElement reportIssue;
    public void btnReportIssue(){clickFunction(reportIssue);}

    @FindBy(xpath = "//*[@id='select-project-form']/div/div[2]/div[2]/input")
    private WebElement ChekcAssertion;
   public void checkfirstass(){AssertionDisplay(ChekcAssertion);}

}
