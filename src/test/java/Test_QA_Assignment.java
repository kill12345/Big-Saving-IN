import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Test_QA_Assignment extends BaseClass {

    String    data      = "0/02/28";
    BaseClass baseClass = new BaseClass();
    public String notes = baseClass.getRandomString(249, someWords.ALPHA);


    @Test

    public void firstTest() throws Exception {

        WebDriver driver = new ChromeDriver();

        Main_Page log_in = new Main_Page();
        log_in.navigate_To_Page_and_Chek_Title(driver);

        log_in.isHome_Insurance_Present(driver);

        log_in.isHomeInsuranceItemPresent(driver);

        log_in.isTwitterButtonPresent(driver);

        log_in.isFacebookButtnPresentat(driver);

        log_in.isBigSavingInsuranceTextPresent(driver);

        log_in.getAlldropDownTypeOfInsurance(driver);

        log_in.celectedDropDownTypeOfInsurance(driver);

        driver.close();



























//
//
//
//
//
//        assertTrue(create_task.isUserName_MassageDisplayed(driver));
//        assertTrue(create_task.isElement_MyTask_Present(driver));
//        assertEquals(create_task.isUserName_MassageDisplayed(driver),true);
//
//        //Add and verify new task
//
//        create_task.setSomeCharacters(driver);
//        assertTrue(create_task.is_SomeCharactersPresent());
//        create_task.addNewTask();
//
//         // Manage sub Task
//
//        CreateSub_Tasks createSub_tasks = new CreateSub_Tasks();
//        assertTrue(createSub_tasks.isButton_Manage_Subtasks_Present(driver));
//        assertEquals(createSub_tasks.isButton_Manage_Subtasks_Present(driver),true);
//        createSub_tasks.clickButtonManageSubtasks();
//
//        // Sub Tasks Form
//
//        createSub_tasks.waitForManageSubtasks_Form_ToBecomeVisible(1,driver);
//        assertEquals(createSub_tasks.is_ID_And_The_Task_Description_Present(driver),true);
//        createSub_tasks.setSomeSubTask_Description_249(driver);
//        createSub_tasks.setDateAndtime(driver);
//
//
//        // Verify Sub Tasks Form
//
//        assertEquals(createSub_tasks.getDateAndTime(),data);
//        assertEquals(createSub_tasks.getSomeTaskDescription(),notes);
//
//        assertTrue(createSub_tasks.isAddSubtaskButtonPresent(driver));
//        createSub_tasks.clickAddSubtaskButton(driver);
//
//
//        //Sub tasks that were added should be appended on the bottom part of the modal dialog
//
//        assertEquals(createSub_tasks.subtasksWereAdded(),notes);




    }

}
