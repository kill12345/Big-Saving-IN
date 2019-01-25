import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.logging.Logger;

import static java.util.logging.Logger.GLOBAL_LOGGER_NAME;




public class Items_ButtonsUtility {

    private static Logger logger = Logger.getLogger(GLOBAL_LOGGER_NAME);
    public  static  String myTask_Present =   "//a[contains(text(),'My Tasks')]";
    public  static  String massageDisplayed = "/html/body/div[1]/h1";
    public  static  String characters =       "//input[@id='new_task']";

    public boolean isElementPresent(WebDriver driver,By by)throws Exception {
        logger.info("CALLED:isElementPresent()");

        try {
            driver.findElement(by);
            System.out.println("My Element Present");
            return true;
        } catch (NoSuchElementException e) {
            System.out.println("My Element NOT Present  ");
            return false;
        }

    }

    public void isSomeTextPresent(WebDriver driver,By by) {

        WebElement text = driver.findElement(by);
        boolean isTextDisplayed = text.isDisplayed();
        System.out.println("Is text Present:" + isTextDisplayed);

    }

    public void clickButton(WebDriver driver ,By by) {
      driver.findElement(by).click();

    }

    public  boolean waitForElementToBecomeVisible(WebDriver driver, By by, long timeout)throws Exception {
        WebDriverWait wait = new WebDriverWait(driver, timeout, 500);
        try {
            wait.until(ExpectedConditions.elementToBeClickable(by));
            System.out.println("Element Become Visible");
            return true;
        } catch (TimeoutException te) {
            System.out.println("Element  Not Become Visible");
            return false;
        }

    }

       public boolean is_SomeCharactersPresent(){
        WebDriver driver = new FirefoxDriver();
		logger.info("CALLED:is_SomeCharactersPresent()");
                boolean result = driver.findElements(By.xpath("//a[@class ='ng-scope ng-binding editable editable-click']")).size() > 0;
                logger.info("result: " + result);
                return result;
                }


    public void addNewTask(){
        logger.info("CALLED:addNewTask()");
        WebDriver driver = new FirefoxDriver();
        driver.findElement(By.xpath("//span[@ng-click ='addTask()']/parent::before")).click();

        }


}





