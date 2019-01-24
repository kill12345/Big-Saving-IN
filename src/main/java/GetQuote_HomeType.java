import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;
import java.util.logging.Logger;

import static java.util.logging.Logger.GLOBAL_LOGGER_NAME;
import static junit.framework.TestCase.assertTrue;

/**
 * Created by Stepa on 1/22/2019.
 */
public class GetQuote_HomeType extends BaseClass {

    private static Logger logger = Logger.getLogger(GLOBAL_LOGGER_NAME);
    Items_ButtonsUtility items_buttonsUtility = new Items_ButtonsUtility();
    private By cellPhone = By.xpath("//*[@id='infopagecontent']/b/center");
    private By twitterButton = By.xpath("//*[@id='colophon']/span[2]/a[1]/img");
    private By facebookButton = By.xpath("//*[@id='colophon']/span[2]/a[2]/img");


   public void chek_Title(WebDriver driver){

       String titleGetQuote = driver.getTitle();
       logger.info("CALLED:Chek_Title");
       System.out.println("Get Quote | Big Savings Insurance Agency" + titleGetQuote);
       assertTrue (titleGetQuote.contains("Get Quote | Big Savings Insurance Agency"));

   }
   public boolean isTellPresent (WebDriver driver)throws Exception {
       logger.info("CALLED:isTellPresent");
       return items_buttonsUtility.isElementPresent(driver,cellPhone);

   }

   public boolean isTwitterButtonPresent(WebDriver driver)throws Exception{
       logger.info("isTwitterButtonPresent");
       return items_buttonsUtility.isElementPresent(driver,twitterButton);
   }

   public boolean isFacebookButtonPresent(WebDriver driver)throws Exception{
       logger.info("isFacebookButtonPresent");
       return items_buttonsUtility.isElementPresent(driver,facebookButton);
    }

    public void getAllTypeOfInsurance(WebDriver driver){
        logger.info("GetAllTypeOfInsurance");
        WebElement typeOfinsurance = driver.findElement(By.xpath("//*[@id='nmenu']/div/div/ul"));
        List<WebElement> links = typeOfinsurance.findElements(By.tagName("li"));
        for (int i = 1;i<links.size();i++)
        {
            System.out.println(links.get(i).getText());
        }


    }


















}
