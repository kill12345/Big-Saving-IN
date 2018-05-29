import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.logging.Logger;

import static java.util.logging.Logger.GLOBAL_LOGGER_NAME;


public class Log_In extends BaseClass  {

    private static Logger logger = Logger.getLogger(GLOBAL_LOGGER_NAME);
    private String signInButton = "//a[contains(text(),'Sign In')]";
    private String button = "//input[@class ='btn btn-primary']";
    private String url    = "https://qa-test.avenuecode.com/";

    public void navigate_To_Page(){




        WebDriver driver = new FirefoxDriver();
        driver.get(url);
        driver.findElement(By.xpath(signInButton)).click();
        pause(1);
        driver.findElement(By.id("user_email")).sendKeys(PropertiesUtility.getProperty("email"));
        driver.findElement(By.id("user_password")).sendKeys(PropertiesUtility.getProperty("password"));
        pause(1);
        driver.findElement(By.xpath(button)).click();

    }

}

