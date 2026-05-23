package utils;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ReadPropertyValue {

    public static String getPropertyValue(String key)  {

        FileInputStream fis ;
        try {
            fis = new FileInputStream(new File("src/main/resources/configuration/frameworkconfig.properties"));
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
        Properties properties = new Properties();
        try {
            properties.load(fis);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        return properties.getProperty(key);

    }
}
