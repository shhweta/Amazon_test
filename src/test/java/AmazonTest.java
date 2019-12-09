import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.ResultPage;

import static utils.TestBase.initiateTest;
import static utils.TestBase.webDriver;

public class AmazonTest {
    private HomePage homePage;
    private ResultPage resultPage;

    @BeforeClass
    public void initialize() {
        initiateTest();
    }

    @Test (priority =0)
    public void searchForWristWatches() throws Exception {
        homePage = new HomePage(webDriver);
        homePage.searchInput.sendKeys("Wrist Watches");
        homePage.searchButton.click();
        Thread.sleep(3000);
    }

    @Test
    public  void addFilter() throws Exception {
        resultPage  = new ResultPage (webDriver);
        //resultPage.analogFilterCheckBox.click();
        //resultPage.bluTechFilterCheckBox.click();
        resultPage.leatherFilterCheckBox.click();
    }
}