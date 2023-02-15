package com.automation.commons;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Alerts extends CommonMethods{

    @Test
    public void findAlerts() {

        WebDriver driver = getDriver();
        WebElement frame1 = driver.findElement(By.xpath("//iframe[@"));

      //  driver.switchTo().frame(driver.findElement(By.xpath("//*[@id='frm1']")));
      //  new Select(driver.findElement(By.xpath("//*[@class='selectnav']"))).selectByVisibleText("Alert");


    }
        @Before
    public void setUp(){
        createDriver("https://www.hyrtutorials.com/p/frames-practice.html");

    }
    @After
    public void cleanUp(){
        quitDriver();
    }
}

