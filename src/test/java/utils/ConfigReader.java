package utils;

import org.checkerframework.checker.units.qual.K;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ConfigReader {

    static Properties prop;

    public static Properties readProperties(String filePath) throws FileNotFoundException {

        try {
            FileInputStream fis = new FileInputStream(filePath);
            prop = new Properties();
            prop.load(fis);

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return prop;
    }

    public static String getPropertyValue(String Key){
        //from prop object we are calling get properties method, and we will pass the key of fetch the value
        return prop.getProperty(Key);

    }
}
