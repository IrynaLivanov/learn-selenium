package com.automation.commons;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DayOne {
    private static WebDriver driver;
    public void createDriver() {
        //Key + value
        System.setProperty("webdriver.chrome.driver", "src/test/java/com/automation/driver/chromedriver.exe");

        driver = new ChromeDriver();
        //methods
        driver.get("https://www.saucedemo.com/");
    }
    public void quitDriver(){
        driver.close();
        driver.quit();
    }
    public WebDriver getDriver(){
        return driver;
    }
}