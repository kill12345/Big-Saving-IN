import java.io.*;
import java.util.Properties;
import java.util.logging.Logger;

import static java.util.logging.Logger.GLOBAL_LOGGER_NAME;

public  class PropertiesUtility {

    private static Logger logger = Logger.getLogger(GLOBAL_LOGGER_NAME);
    static String propertiesFilePath = "/Users/stepanmisiruk/rw-workspace/QA_Assignment/src/main/resources/main.properties";
    static Properties property = new Properties();


    private static void loadProperties() {
            try {
                FileInputStream objFile = new FileInputStream(propertiesFilePath);
                property.load(objFile);

            } catch (IOException e) {

            }
        }

        /**
         * @param propertyName
         * @return
         */
        public static String getProperty(String propertyName){
            loadProperties();
            return property.getProperty(propertyName);
        }


    }



