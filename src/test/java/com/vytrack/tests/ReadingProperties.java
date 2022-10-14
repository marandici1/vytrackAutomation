package com.vytrack.tests;

import java.io.FileInputStream;
import java.util.Properties;

public class ReadingProperties {

    public void reading_properties_(){
        Properties properties = new Properties();
        FileInputStream file = new FileInputStream("config.properties");
        properties.load(file);









    }
}
