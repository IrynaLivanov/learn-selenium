package com.automation.commons;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DayOne {
    public static void main(String[] args)  throws InterruptedException{

        //Key + value
        System.setProperty("webdriver.chrome.driver", "src/test/java/com/automation/driver/chromedriver.exe");

        //creating an object of the web driver interface
        WebDriver driver = new ChromeDriver(); //can be firefox, edge etc

        //methods
        driver.get("https://www.saucedemo.com/");
        Thread.sleep(10000); //this method throw exception
        driver.quit();
    }
}