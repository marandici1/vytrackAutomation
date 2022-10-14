package com.vytrack.tests;

import org.testng.annotations.Test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ReadingProperties {

    @Test
    public void reading_properties_() throws IOException {
        Properties properties = new Properties();
        FileInputStream file = new FileInputStream("config.properties");
        properties.load(file);
        System.out.println("properties.getProperty(\"name\") = " + properties.getProperty("name"));
        System.out.println("properties.getProperty(\"version\") = " + properties.getProperty("version"));


    }
}
