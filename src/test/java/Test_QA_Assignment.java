import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Test_QA_Assignment extends BaseClass {

    String    data      = "0/02/28";
    BaseClass baseClass = new BaseClass();
    public String notes = getRandomString(249, someWords.ALPHA);


    @Test

    public void firstTest () throws Exception {

        WebDriver driver = new ChromeDriver();
        Main_Page log_in = new Main_Page();

        log_in.navigate_To_Page_and_Chek_Title(driver);

        log_in.isHome_Insurance_Present(driver);
        log_in.isHomeInsuranceItemPresent(driver);

         Assert.assertTrue(log_in.isHomeInsuranceItemPresent(driver));

         Assert.assertTrue(log_in.isTwitterButtonPresent(driver));

         Assert.assertTrue(log_in.isFacebookButtonPresenta(driver));

        log_in.isBigSavingInsuranceTextPresent(driver);
        log_in.getAlldropDownTypeOfInsurance(driver);

        //Add  new Type of Insurance
        log_in.celesteDropDownTypeOfInsurance(driver);

        log_in.isGet_QuoteNowButtonPresent(driver);

        log_in.clickGet_QuoteNowButton(driver);
        pause(1);

        // Verify Get Quote_Home Type form

         GetQuote_HomeType getQuote_homeType = new GetQuote_HomeType();
         getQuote_homeType.chek_Title(driver);

          Assert.assertTrue(getQuote_homeType.isTwitterButtonPresent(driver));
          Assert.assertTrue(getQuote_homeType.isFacebookButtonPresent(driver));
          Assert.assertTrue(getQuote_homeType.isTellPresent(driver));

         getQuote_homeType.getAllTypeOfInsurance(driver);
         Assert.assertTrue(getQuote_homeType.isPrimacyPolicyElementViable(driver));
         getQuote_homeType.clickPrivacyButton(driver);

        GetQuote_HomeType.PrivacyPolicy privacyPolicy = new GetQuote_HomeType.PrivacyPolicy();
         Assert.assertTrue( privacyPolicy.privacyPolicyTitleVisebale(driver,200));
         Assert.assertTrue(privacyPolicy.isFacebookButtonPresent(driver));
         Assert.assertTrue(privacyPolicy.isTwitterButtonPresent(driver));
         privacyPolicy.isSocialSecurityNumberTextPresent(driver);


        driver.close();





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
