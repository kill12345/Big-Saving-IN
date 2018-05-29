import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;
import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

public class Test_QA_Assignment extends BaseClass {

    String data = "0/02/28";
    BaseClass baseClass = new BaseClass();
    public String notes = baseClass.getRandomString(249, someWords.ALPHA);


    @Test

    public void firstTest() throws Exception {

        Log_In log_in = new Log_In();
        log_in.navigate_To_Page();

        Create_Task create_task =new Create_Task();
        WebDriver driver = new FirefoxDriver();

        // Verify all information on the application

        assertTrue(create_task.isUserName_MassageDisplayed(driver));
        assertTrue(create_task.isElement_MyTask_Present(driver));
        assertEquals(create_task.isUserName_MassageDisplayed(driver),true);

        //Add and verify new task
        create_task.setSomeCharacters(driver);
        assertTrue(create_task.is_SomeCharactersPresent());
        create_task.addNewTask();

         // Manage sub Task
        CreateSub_Tasks createSub_tasks = new CreateSub_Tasks();
        assertTrue(createSub_tasks.isButton_Manage_Subtasks_Present(driver));
        assertEquals(createSub_tasks.isButton_Manage_Subtasks_Present(driver),true);
        createSub_tasks.clickButtonManageSubtasks();

        // Sub Tasks Form
        createSub_tasks.waitForManageSubtasks_Form_ToBecomeVisible(1,driver);
        assertEquals(createSub_tasks.is_ID_And_The_Task_Description_Present(driver),true);
        createSub_tasks.setSomeSubTask_Description_249(driver);
        createSub_tasks.setDateAndtime(driver);


        // Verify Sub Tasks Form

        assertEquals(createSub_tasks.getDateAndTime(),data);
        assertEquals(createSub_tasks.getSomeTaskDescription(),notes);

        assertTrue(createSub_tasks.isAddSubtaskButtonPresent(driver));
        createSub_tasks.clickAddSubtaskButton(driver);


        //Subtasks that were added should be appended on the bottom part of the modal dialog

        assertEquals(createSub_tasks.subtasksWereAdded(),notes);

        driver.close();











    }

}
