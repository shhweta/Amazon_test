package pages;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ResultPage {
    WebDriver webDriver;


    //@FindBy(xpath="//li[@id='p_85/10440599031']//i[@class='a-icon a-icon-checkbox']")

    //public WebElement analogFilterCheckBox;

    @FindBy(xpath = "//body[@class='a-aui_152852-c a-aui_157141-c a-aui_158613-t1 a-aui_72554-c a-aui_dropdown_187959-c a-aui_pci_risk_banner_210084-c a-aui_perf_130093-c a-aui_tnr_v2_180836-c a-aui_ux_145937-c a-meter-animate']")
    public WebElement leatherFilterCheckBox;


    //@FindBy(xpath = "//*[@id=\"p_89/BLUTECH\"]/span/a/div/label/i")

    //public WebElement bluTechFilterCheckBox;



    public ResultPage(WebDriver driver) throws Exception {
        this.webDriver = driver;
        PageFactory.initElements(this.webDriver, this);
        Thread.sleep(2000);
    }


}
