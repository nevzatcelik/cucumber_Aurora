package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import pages.TrendLifeBuyPage;
import utilites.ConfigReader;
import utilites.Driver;
import utilites.ReusableMethods;

import java.security.Key;

public class TrendLifeBuyStepDefinitions    {

    TrendLifeBuyPage life=new TrendLifeBuyPage();
    Actions actions=new Actions(Driver.getDriver());

    @Given("Open browser go to url {string}")
    public void open_browser_go_to_url(String url) {
          Driver.getDriver().get(ConfigReader.getProperty(url)); // Bu dinamik olan
      //  Driver.getDriver().get(ConfigReader.getProperty("myUrl2"));
    }
    @Then("User clicks on the login link, enters {string} and {string} and logs in.")
    public void user_clicks_on_the_login_link_enters_and_and_logs_in(String mail, String password) {
        life.loginLink.click();
       life.emailBox.sendKeys(ConfigReader.getProperty(mail));
      // life.emailBox.sendKeys(mail);
       life.passwordBox.sendKeys(ConfigReader.getProperty(password));
     //   life.passwordBox.sendKeys(password);
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        ReusableMethods.bekle(2);
        life.signInButton.click();
    }
    @Then("User clicks on dashboard link")
    public void user_clicks_on_dashboard_link() {
       life.dashboardLink.click();
    }
    @Then("User clicks My Account section on dashbord page")
    public void user_clicks_my_account_section_on_dashbord_page() {
      actions.sendKeys(Keys.PAGE_DOWN).perform();
      ReusableMethods.bekle(2);
      life.myAccountLink.click();

    }
    @Then("User verifies that the page is accessible")
    public void user_verifies_that_the_page_is_accessible() {
     String expected="https://trendlifebuy.com/profile";
     String actual=Driver.getDriver().getCurrentUrl();

        Assert.assertEquals(expected,actual);
     //   Assert.assertTrue(Driver.getDriver().getCurrentUrl().contains("/profile"));
    }
    @Then("Closes the page")
    public void closes_the_page() {
        Driver.closeDriver();
    }

    @Then("Verifies that the Basic Info tab contains First Name, Last Name,Email Address, Phone Number, Date of Birth, Description,Text Box")
    public void verifiesThatTheBasicInfoTabContainsFirstNameLastNameEmailAddressPhoneNumberDateOfBirthDescriptionTextBox() {
        Assert.assertTrue(life.firstnameBoxMyAccount.isDisplayed());


    }
    @Then("User clicks Purchase History section on dashbord page")
    public void user_clicks_purchase_history_section_on_dashbord_page() {
     actions.sendKeys(Keys.PAGE_DOWN).perform();
     actions.sendKeys(Keys.ARROW_DOWN).perform();
     actions.sendKeys(Keys.ARROW_DOWN).perform();
     actions.sendKeys(Keys.ARROW_DOWN).perform();
        life.purchaseHistoryLink.click();

    }
    @Then("User verifies that Purchase History page is accessible")
    public void user_verifies_that_purchase_history_page_is_accessible() {
        String expected="https://trendlifebuy.com/my-purchase-histories";
        String actual=Driver.getDriver().getCurrentUrl();

        Assert.assertEquals(expected,actual);

    }

    @Then("User verifies that \\(These credentials do not match our records.) message appears in the corner")
    public void userVerifiesThatTheseCredentialsDoNotMatchOurRecordsMessageAppearsInTheCorner() {
       Assert.assertTrue(life.systemMessage.isDisplayed());
    }
}
