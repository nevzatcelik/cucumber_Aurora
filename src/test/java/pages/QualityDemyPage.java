package pages;

import org.bouncycastle.pqc.crypto.newhope.NHOtherInfoGenerator;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilites.Driver;

public class QualityDemyPage {

    public QualityDemyPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//a[text()='Log in']")
    public WebElement loginLink;

    @FindBy(xpath = "//input[@id='login-email']")
    public WebElement emailBox;

    @FindBy(xpath = "//button[text()='Login']")
    public WebElement loginButton;

    @FindBy(xpath = "//*[text()='Accept']")
    public WebElement acceptCookies;

    @FindBy(xpath = "//input[@id='login-password']")
    public WebElement passwordBox;

    @FindBy (linkText = "Course manager")
    public WebElement courseManagerLink;

    @FindBy(xpath = "//img[@src=\"https://qualitydemy.com/uploads/system/393645bf994114c23be28028a47a77a0.png\"]")
    public WebElement demyPicture;

    @FindBy (xpath = "//a[text () = 'Instructor']")
    public WebElement instructor;

    @FindBy(xpath = "//span[text()='Course manager']")
    public WebElement courseManagerButton;

    @FindBy (xpath = "//a[@class='btn btn-outline-primary btn-rounded alignToTitle']")
    public WebElement add_newcourse;

    @FindBy(xpath = "//span[text()='Requirements']")
    public WebElement requirementsButton;

    @FindBy(xpath = "//button[@onclick='appendRequirement()']")
    public WebElement requirementsGreenPlusButton;

    @FindBy(xpath = "(//button[@onclick='removeRequirement(this)'])[2]")
    public WebElement requirementsRedMinusButton;

    @FindBy(xpath = "//span[text()='Outcomes']")
    public WebElement outComesButton;

    @FindBy(xpath = "//button[@onclick='appendOutcome()']")
    public WebElement outComesGreenPlusButton;

    @FindBy(xpath = "(//i[@class='fa fa-minus'])[3]")
    public WebElement outComesRedMinusButton;

    // Signup section locates
    @FindBy(xpath = "//a[@class='btn btn-sign-up']")
     public WebElement signupLink;

    @FindBy(xpath = "(//input[@type='text'])[2]")
    public WebElement firstnameBox;

    @FindBy(xpath = "(//input[@type='text'])[3]")
    public WebElement lastnameBox;

    @FindBy(xpath = "(//input[@type='text'])[4]")
    public WebElement signupEmailBox;

    @FindBy(xpath = "//input[@type='password']")
    public WebElement signupPasswordBox;

    @FindBy(xpath = "(//button[@type='submit'])[2]")
    public WebElement signupButton;

    @FindBy(xpath = "//div[@class='toast-message']")
    public WebElement hataMesaji;
}
