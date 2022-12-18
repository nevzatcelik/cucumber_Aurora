package utilites;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

import java.time.Duration;

public class Driver {

    private Driver(){
//Singleton Pattern consepti ile bu classtan obje oluşturulmasını engellemek için
// bu constructor callu oluşturduk.
    }

    static WebDriver driver;

    public static WebDriver getDriver(){


        if(driver==null) {// method ilk cagrildiginda driver degeri atanmamis oldugundan deger ata
            // sonraki calistirmalarda degeri atanmis oldugundan 18.satir calismayacak
            String browser=ConfigReader.getProperty("browser");
            switch (browser){
                case "chrome":
                    ChromeOptions options = new ChromeOptions();
                    options.addArguments("start-maximized");
                    options.addArguments("--incognito");
                    WebDriverManager.chromedriver().setup();
                    driver = new ChromeDriver(options);

                    break;
                case "firefox":
                    WebDriverManager.firefoxdriver().setup();
                    driver = new FirefoxDriver();
                    break;
                case "safari":
                    WebDriverManager.safaridriver().setup();
                    driver = new SafariDriver();
                    break;
                default:
                    WebDriverManager.chromedriver().setup();
                    driver = new ChromeDriver();
            }
        }

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        driver.manage().window().maximize();
        return driver;
    }

    public static void closeDriver(){
        if (driver!=null){
            driver.close();
            driver=null;
        }

    }
}