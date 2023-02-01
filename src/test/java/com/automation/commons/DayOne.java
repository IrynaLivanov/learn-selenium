package com.automation.commons;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class DayOne {
    private static WebDriver driver;
    public void createDriver(String url) {
        //Key + value
        System.setProperty("webdriver.chrome.driver", "src/test/java/com/automation/driver/chromedriver.exe");

        driver = new ChromeDriver();
        //methods
        driver.get(url);

        //Sets up an implicit wait that waits the Duration.ofSeconds() for every element while checking every 500
        //mili seconds before throwing NoSuchElementFoundException
        //Note: if the element exists before the time is up it will not wait for the full time
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
    }
    public void quitDriver(){
        driver.close();
        driver.quit();
    }
    public WebDriver getDriver(){
        return driver;
    }
}