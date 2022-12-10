package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.ui.Select;
import pages.AmazonPage;
import utilites.ConfigReader;
import utilites.Driver;

public class AmazonStepDefinitions {

    AmazonPage amazonPage=new AmazonPage();


    @Then("Kullanici amazon arama kutusunda {string} arama yapar")
    public void kullanici_amazon_arama_kutusunda_arama_yapar(String istenenKelimeler) {
        amazonPage.amazonAramaKutusu.sendKeys(istenenKelimeler+ Keys.ENTER);

    }
    @Then("Kullanici arattigi {string} test eder")
    public void kullanici_arattigi_test_eder(String testKelimeler) {
        Assert.assertTrue(amazonPage.amazonAramaSonucuTest.getText().contains(testKelimeler));

    }
    @Then("Kullanici arama kutusundaki drop down menusunden {string} secer")
    public void kullanici_arama_kutusundaki_drop_down_menusunden_secer(String istenilenMenu) {
        Select select=new Select(amazonPage.dropDownMenu);
        select.selectByVisibleText(istenilenMenu);
    }

}
