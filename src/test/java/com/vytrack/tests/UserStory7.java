package com.vytrack.tests;

import com.vytrack.tests.TestBase.TestBase;
import com.vytrack.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class UserStory7 extends TestBase {
/*
    WebDriver driver ;

    @BeforeMethod
    public void SetUp() throws InterruptedException {
        driver = WebDriverFactory.getDriver("Chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10 , TimeUnit.SECONDS);
    }

 */

    @Test
    public void US7 () throws InterruptedException {
        driver.get("https://qa2.vytrack.com/user/login");
        Thread.sleep(2000);


        WebElement UserNameBTN = driver.findElement(By.xpath("//input[@id='prependedInput']"));
        UserNameBTN.sendKeys("storemanager68");
        WebElement PassWordBTN = driver.findElement(By.id("prependedInput2"));
        PassWordBTN.sendKeys("UserUser123");
        WebElement LogInBTN = driver.findElement(By.xpath("//button[@id='_submit']"));
        LogInBTN.click();

        Thread.sleep(7000);


        //AC#1

        //Fleet > Vehicles

        WebElement FleetMenu = driver.findElement(By.xpath("//*[@id=\"main-menu\"]/ul/li[2]/a/span"));
        FleetMenu.click();
        WebElement VehiclesBTN = driver.findElement(By.xpath("//*[@id=\"main-menu\"]/ul/li[2]/div/div/ul/li[3]/a/span"));
        VehiclesBTN.click();

        Thread.sleep(3000);
        //Test all buttons are not selected

        List<WebElement> AllCheckbox = driver.findElements(By.xpath("//input[@data-role='select-row-cell']"));
        for (WebElement EachCheckBox : AllCheckbox) {
            if (EachCheckBox.isSelected()){
                System.out.println("All check boxes are selected");
            } else {
                System.out.println("All check boxes are not selected");
            }
        }
        Thread.sleep(5000);

        //AC #2:  user checks the first checkbox to check all the cars

        WebElement FirstCheckBox = driver.findElement(By.xpath("//button//input[@type='checkbox']"));
        FirstCheckBox.click();
        List<WebElement> AllCheckbox1 = driver.findElements(By.xpath("//input[@data-role='select-row-cell']"));
        for (WebElement EachCheckBox : AllCheckbox1) {
            if (EachCheckBox.isSelected()){
                System.out.println("All check boxes are selected");
            } else {
                System.out.println("All check boxes are not selected");
            }
        }
        Thread.sleep(3000);




























    }






}
