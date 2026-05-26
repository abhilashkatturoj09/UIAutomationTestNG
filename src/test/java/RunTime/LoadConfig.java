package RunTime;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class LoadConfig {

    private static final String propPath = "/Users/abhilashkatturoj/Abhilash/UIAutomationTestNG/src/test/resources/properties";

    public static String load(String key) {
        Properties properties = new Properties();
        File fl = new File(propPath);
        FileInputStream fileInputStream = null;
        File[] files = fl.listFiles((dir, name) -> name.endsWith("properties"));
        if (files != null) {
            for (File file : files) {
                try {
                    fileInputStream = new FileInputStream(file);
                    properties.load(fileInputStream);
                } catch (Exception e) {
                } finally {
                    if (fileInputStream != null) {
                        try {
                            fileInputStream.close();
                        } catch (Exception e) {
                            e.printStackTrace();
                        }
                    }
                }
            }
        }
        return properties.getProperty(key);
    }
}
