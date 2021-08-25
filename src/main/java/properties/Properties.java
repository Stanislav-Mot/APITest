package properties;

import utils.Log;

import java.io.FileInputStream;

public class Properties {

    public static String getProperties(String PropertyKey) {
        String result = "";
        try {
            java.util.Properties properties = new java.util.Properties();
            properties.load(new FileInputStream("E:\\API\\src\\main\\resources\\body.properties"));
            result = properties.getProperty(PropertyKey);
        } catch (Exception e) {
            Log.error(e);
        }
        return result;
    }
}
