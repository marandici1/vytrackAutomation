package com.vytrack.utilities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.safari.SafariDriver;

public class WebDriverFactory {
    // TASK: NEW METHOD CREATION
// Method name : getDriver
// Static method
// Accepts String arg: browserType
//   - This arg will determine what type of browser is opened
//   - if "chrome" passed --> it will open chrome browser
//   - if "firefox" passed --> it will open firefox browser
// RETURN TYPE: "WebDriver"

        public static WebDriver getDriver(String browserType) {
            if (browserType.equalsIgnoreCase("safari")) {
                WebDriverManager.safaridriver().setup();
                return new SafariDriver();

            } else if (browserType.equalsIgnoreCase("chrome")) {
                WebDriverManager.chromedriver().setup();
                return new ChromeDriver();
            }else {
                System.out.println("Given browser type doesn't exist/or not currently supported!");
                return null;
            }
        }
    }


