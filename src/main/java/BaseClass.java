
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import java.util.logging.Logger;
import static java.util.logging.Logger.GLOBAL_LOGGER_NAME;


public class BaseClass {


    private static  Logger logger = Logger.getLogger(GLOBAL_LOGGER_NAME);

    public BaseClass(){
        System.setProperty("webdriver.gecko.driver", "./chromedriver.exe");

    }

    public void driverClose(WebDriver driver){
        logger.info("CALLED:driverClose()");
        driver.quit();
    }

    public WebDriver getDriverInstance()throws Exception{
        logger.info("CALLED:getDriverInstance()");
        WebDriver driver = null;

        String browser = "firefox";

        if (browser.equals("firefox")) {
            driver = new FirefoxDriver();
        }
        return driver;
    }

    public static void pause(int seconds){

        try {
            Thread.sleep(seconds * 10000);
        }catch (InterruptedException e){
            e.printStackTrace();
        }

    }

    public  enum  someWords {
        ALPHA, ALPHANUMERIC, NUMERIC,
    }

    public static String getRandomString(int length,someWords mode) {
        logger.info("CALLED:getRandomString()");

        StringBuffer buffer = new StringBuffer();
        String characters = "";

        switch(mode){

            case ALPHA:
                characters = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ";
                break;

            case ALPHANUMERIC:
                characters = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890";
                break;

            case NUMERIC:
                characters = "1234567890";
                break;


        }

        int charactersLength = characters.length();

        for (int i = 0; i < length; i++) {
            double index = Math.random() * charactersLength;
            buffer.append(characters.charAt((int) index));
        }
        return buffer.toString();
    }




}
