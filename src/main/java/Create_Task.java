import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import java.util.logging.Logger;
import static java.util.logging.Logger.GLOBAL_LOGGER_NAME;



public class Create_Task {

    private static Logger logger = Logger.getLogger(GLOBAL_LOGGER_NAME);
    public static  String myTask_Present =   "//a[contains(text(),'My Tasks')]";
    public static  String massageDisplayed = "/html/body/div[1]/h1";
    public static  String characters =       "//input[@id='new_task']";

    public boolean isElement_MyTask_Present(WebDriver driver) {
        logger.info("isElement_MyTask_Present");

        try {
            driver.findElement(By.xpath(myTask_Present));
            System.out.println("My Task Present");
            return true;

        } catch (NoSuchElementException e) {
            System.out.println("My Task do not Present  ");
            return false;
        }
    }

    public boolean isUserName_MassageDisplayed(WebDriver driver) {
        logger.info("isUserName_MassageDisplayed");

        try {
            driver.findElement(By.xpath(massageDisplayed));
            System.out.println(" Massage Displayed ");
            return true;

        } catch (NoSuchElementException e) {
            System.out.println("Massage do Not Displayed  ");
            return false;
        }
    }

    public void setSomeCharacters(WebDriver driver) {
        driver.findElement(By.id(characters)).sendKeys("hello");

    }

       public boolean is_SomeCharactersPresent(){
        WebDriver driver = new FirefoxDriver();
		logger.info("is_SomeCharactersPresent()");
                boolean result = driver.findElements(By.xpath("//a[@class ='ng-scope ng-binding editable editable-click']")).size() > 0;
                logger.info("result: " + result);
                return result;
                }


    public void addNewTask(){
        logger.info("addNewTask");
        WebDriver driver = new FirefoxDriver();
        driver.findElement(By.xpath("//span[@ng-click ='addTask()']/parent::before")).click();

        }
    }





