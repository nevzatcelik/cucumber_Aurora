package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.By;
import org.openqa.selenium.Capabilities;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.devtools.v106.page.model.FileChooserOpened;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import pages.KiwiPage;
import utilites.ConfigReader;
import utilites.Driver;
import utilites.ReusableMethods;

import java.net.URL;
import java.security.Key;
import java.util.Arrays;
import java.util.Set;

public class KiwiStepDefinitions {

    KiwiPage kiwiPage=new KiwiPage();
    Actions actions=new Actions(Driver.getDriver());


    @Given("The user goes the kiwi homepage")
    public void the_user_goes_the_kiwi_homepage() {
       Driver.getDriver().get(ConfigReader.getProperty("kiwiHomePage"));
       kiwiPage.rejectCookies.click();

    }
    @Then("The user choose From {string} city in the box")
    public void the_user_choose_from_city_in_the_box(String From) {
      actions.click(kiwiPage.departureBox).sendKeys(Keys.DELETE).sendKeys(Keys.DELETE).
              sendKeys(ConfigReader.getProperty(From)+Keys.ENTER).perform();
    }
    @Then("The user choose To {string} city in the box")
    public void the_user_choose_to_city_in_the_box(String To) {
     actions.click(kiwiPage.arrivalBox).sendKeys(Keys.DELETE).sendKeys(Keys.DELETE).perform();
     kiwiPage.arrivalBox.sendKeys(ConfigReader.getProperty(To)+Keys.ENTER);
     kiwiPage.antalya.click();
    }
    @Then("The user choose one way flight from menu")
    public void theUserChooseOneWayFlightFromMenu() {
       kiwiPage.oneWayMenu.click();
       kiwiPage.oneWay.click();
    }
    @Then("The user sorts the prices from cheapest to most expensive.")
    public void the_user_sorts_the_prices_from_cheapest_to_most_expensive() {
       kiwiPage.date.click();
       ReusableMethods.bekle(10);
     //   System.out.println(kiwiPage.priceTable1.getText());
        System.out.println(kiwiPage.priceTable2.getText());
    }

}
