package com.automation.utils;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class PropertiesReader {

    static Properties prop;

    public static void init() throws IOException {
        prop = new Properties();
        prop.load(new FileInputStream("src/test/resources/config/application.properties"));
    }

    public static String getPropValue(String key){
        return prop.getProperty(key);
    }
}
