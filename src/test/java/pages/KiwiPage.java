package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.devtools.v85.page.Page;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilites.Driver;

public class KiwiPage {

    public KiwiPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "(//input[@class='SearchFieldstyled__SearchFieldInput-sc-1f3jsso-5 furDfp'])[1]")
    public WebElement departureBox;

    @FindBy(xpath = "(//input[@class='SearchFieldstyled__SearchFieldInput-sc-1f3jsso-5 furDfp'])[2]")
    public WebElement arrivalBox;

    @FindBy(xpath = "(//input[@class='SearchFieldstyled__SearchFieldInput-sc-1f3jsso-5 furDfp'])[3]")
    public WebElement departureTime;

    @FindBy (xpath = "(//input[@class='SearchFieldstyled__SearchFieldInput-sc-1f3jsso-5 furDfp'])[4]")
    public WebElement returnTime;

    @FindBy (xpath = "(//div[@class='ButtonPrimitiveContent__StyledButtonPrimitiveContent-sc-1r81o9a-0 ULnUg'])[5]")
    public WebElement rejectCookies;

    @FindBy (xpath = "//div[text()='Antalya, Turkey']")
    public WebElement antalya;

    @FindBy (xpath = "(//div[@class='ButtonPrimitiveContent__StyledButtonPrimitiveContent-sc-1r81o9a-0 ZYrQU'])[10]")
    public WebElement oneWayMenu;

    @FindBy(xpath = "//p[text()='One-way']")
    public WebElement oneWay;

    @FindBy(xpath = "//input[@name='search-outboundDate']")
    public WebElement date;

    @FindBy(xpath = "(//div[@data-test='CalendarContainer'])[1]")
    public WebElement priceTable1;

    @FindBy(xpath = "(//div[@data-test='CalendarContainer'])[2]")
    public WebElement priceTable2;
}
