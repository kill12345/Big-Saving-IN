import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.util.logging.Logger;
import static java.util.logging.Logger.GLOBAL_LOGGER_NAME;

public class CreateSub_Tasks extends BaseClass {



    private static Logger logger = Logger.getLogger(GLOBAL_LOGGER_NAME);
    private By subtaskButton = By.xpath("//button[@class='btn btn-xs btn-primary ng-binding']");
    private By subtasksForm = By.xpath("//div[@class='modal-content']");
    private By iDTtaskDescription = By.xpath("//h3[contains(text(),'Editing Task 50816')]");
    private By subTaskDescription = By.id("//input[@id=new_sub_task]");
    private By addSubTaskButton = By.id("//button[@id=add-subtask]");
    String    data = "0/02/28";
    BaseClass baseClass = new BaseClass();
    String    notes = baseClass.getRandomString(249, someWords.ALPHA);





    public boolean isButton_Manage_Subtasks_Present(WebDriver driver) {
        logger.info("CALLED:isButton_Manage_Subtasks_Present()");

        try {
            driver.findElement(subtaskButton);
            System.out.println("Botton Present");
            return true;

        } catch (NoSuchElementException e) {
            System.out.println("Botton do not Present  ");
            return false;
        }
    }

    public void clickButtonManageSubtasks() {
        logger.info("CALLED:clickButtonManageSubtasks()");
        WebDriver driver = new FirefoxDriver();
        driver.findElement(subtaskButton).click();

    }

    /**
     * So use to run this method  2.45.0 version of selenium and all my waits were done in this way:
     */


    public boolean waitForManageSubtasks_Form_ToBecomeVisible(long timeout, WebDriver driver) throws Exception {
        logger.info("CALLED:waitForManageSubtasks_Form_ToBecomeVisible");

        WebDriverWait wait = new WebDriverWait(driver, timeout, 500);
        try {
            wait.until(ExpectedConditions.elementToBeClickable(subtasksForm));
            return true;
        } catch (TimeoutException te) {
            return false;
        }
    }


    public static boolean waitForManageSubtasks_Form_ToDisappear(WebDriver driver, long timeout) {
        logger.info("CALLED:waitForManageSubtasks_Form_ToDisappear()");

        WebDriverWait wait = new WebDriverWait(driver, timeout, 500);
        try {
            wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("")));
            return true;
        } catch (TimeoutException te) {
            // te.printStackTrace();
            return false;
        }

    }

    public boolean is_ID_And_The_Task_Description_Present(WebDriver driver) {
        logger.info("CALLED:is_ID_And_The_Task_Description_Present()");

        try {
            driver.findElement(iDTtaskDescription);
            System.out.println("Task_Description_Present()");
            return true;

        } catch (NoSuchElementException e) {
            System.out.println("Do not Task_Description_Present()");
            return false;


        }
    }

    public void setSomeSubTask_Description_249(WebDriver driver) {
        logger.info("CALLED:setSomeSubTask_Description_249()");
        BaseClass baseClass = new BaseClass();
        driver.findElement(subTaskDescription).sendKeys(notes);

    }
    public String getSomeTaskDescription() {
        logger.info("CALLED:getSomeTaskDescription()");
        return notes;
    }


    public void setDateAndtime(WebDriver driver) {
        logger.info("CALLED:setDateAndtime()");
        driver.findElement(By.id("//*[@id=dueDate]")).sendKeys(data);

    }

    public String getDateAndTime(){
        logger.info("CALLED:getDateAndTime()");
        return data; }

    public boolean isAddSubtaskButtonPresent(WebDriver driver) {
        logger.info("CALLED:isAddSubtaskButtonPresent()");
        try {
            driver.findElement(addSubTaskButton);
            return true;

        } catch (NoSuchElementException e) {
            return false;
        }

    }

    public void clickAddSubtaskButton(WebDriver driver){
        logger.info("CALLED:clickAddSubtaskButton()");
        driver.findElement(addSubTaskButton).click();

    }

    public String subtasksWereAdded (){
        logger.info("CALLED:subtasksWereAdded()");
        return notes;
    }




}











