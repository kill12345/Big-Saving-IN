import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.List;
import java.util.logging.Logger;

import static java.util.logging.Logger.GLOBAL_LOGGER_NAME;
import static junit.framework.TestCase.assertTrue;


public class Main_Page extends BaseClass {

    Items_ButtonsUtility items_buttonsUtility = new Items_ButtonsUtility();

    private static Logger logger = Logger.getLogger(GLOBAL_LOGGER_NAME);
    private String signInButton = "//a[contains(text(),'Sign In')]";
    private String bI_button = "//div[@class='menu-main-menu-container']/ul/li[2]/a";
    private String url = "http://bigsavingsinsurance.com/";
    private By twitterButtonPresentat = By.xpath("//div[@id='colophon']/span[2]/a[1]/img");
    private By facebookButtnPresentat = By.xpath("//*[@id='colophon']/span[2]/a[2]/img");
    private By bigSavingInText = By.xpath("//div[@id='colophon']//*[text()='BIG SAVINGS INSURANCE AGENCY INC. ©  2005 - 2019 ']");
    private By zipCodeButton = By.xpath("//input[@type='submit']");

    public void navigate_To_Page_and_Chek_Title(WebDriver driver) {


        driver.get(url);
        String title = driver.getTitle();

        assertTrue(title.contains("Big Savings Insurance Agency"));
        System.out.println("title:" + title);

    }

    public void  isHome_Insurance_Present(WebDriver driver) {

        WebElement insurancePresent = driver.findElement(By.xpath("//div[@class='menu-main-menu-container']//*[text()='Home Insurance']"));
        boolean insyranceIsDisplayed = insurancePresent.isDisplayed();
        System.out.println("isHome_Insurance_Present:" + insyranceIsDisplayed);
    }

    public boolean isHomeInsuranceItemPresent(WebDriver driver) {
        logger.info("CALLED:isHomeInsuranceItemPresent");
        try {
            driver.findElement(By.xpath("//div[@class='menu-main-menu-container']//*[text()='Home Insurance']"));
            System.out.println("Present:");
            return true;

        } catch (NoSuchElementException e) {
            System.out.println("No Present ");
            return false;
        }
    }

    public boolean isTwitterButtonPresent(WebDriver driver) throws Exception {
        logger.info("CALLED:isTwitterButtonPresent");
        return items_buttonsUtility.isElementPresent(driver, twitterButtonPresentat);

    }

    public boolean isFacebookButtonPresenta(WebDriver driver) throws Exception {
        logger.info("isFacebookButtonPresenta");
        return items_buttonsUtility.isElementPresent(driver, facebookButtnPresentat);

    }

    public void isBigSavingInsuranceTextPresent(WebDriver driver) throws Exception {
        logger.info("isBigSavingInsuranceTextPresent");
        items_buttonsUtility.isSomeTextPresent(driver, bigSavingInText);
    }

    public boolean textPresent(WebDriver driver) throws Exception {
        logger.info("textPresent");
        return items_buttonsUtility.isElementPresent(driver, bigSavingInText);
    }

    public void getAlldropDownTypeOfInsurance(WebDriver driver) throws Exception {
        logger.info("getAlldropDownTypeOfInsurance");

        WebElement typeIns = driver.findElement(By.xpath("//*[@id='type']"));
         Select insuranceType = new Select(typeIns);

        List<WebElement> dropdown = insuranceType.getOptions();

        for (int i = 0; i < dropdown.size(); i++) {
            String typeIns_values = dropdown.get(i).getText();
            System.out.println(typeIns_values);
        }
    }

    public void celesteDropDownTypeOfInsurance(WebDriver driver) throws Exception{
        logger.info("celesteDropDownTypeOfInsurance");

        WebElement typeIns = driver.findElement(By.xpath("//*[@id='type']"));
         Select insType = new Select(typeIns);
         insType.selectByVisibleText("Home ");

        WebElement zipCode =  driver.findElement(By.xpath("//*[@id='zip']"));

         boolean isZipCodePresent = zipCode.isDisplayed();
        System.out.println("Is Zip Code Present:"  + isZipCodePresent);
        driver.findElement(By.xpath("//*[@id='zip']")).sendKeys("95821");
    }

    public boolean isGet_QuoteNowButtonPresent(WebDriver driver)throws Exception{
        logger.info("isGet_QuoteNowButtonPresent");
       return items_buttonsUtility.isElementPresent(driver,zipCodeButton);

    }

    public void clickGet_QuoteNowButton(WebDriver driver){
        logger.info("clickGet_QuoteNowButton");
        items_buttonsUtility.clickButton(driver,zipCodeButton);
    }

}






















