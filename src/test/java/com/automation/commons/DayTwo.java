package com.automation.commons;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import java.util.List;




public class DayTwo extends DayOne{

    @Before
    public void setUp(){
        createDriver();
    }
    @Test
    public void login() throws InterruptedException {

        WebDriver driver = getDriver();

        WebElement usernameInput = driver.findElement(By.id("user-name"));
        WebElement passwordInput = driver.findElement(By.id("password"));
        WebElement loginButton = driver.findElement(By.id("login-button"));

        //login
        usernameInput.sendKeys("standard_user");
        passwordInput.sendKeys("secret_sauce");
        loginButton.click();

        Thread.sleep(500);


        // now we are on the product page
        WebElement productButton = driver.findElement(By.className("title"));

        Assert.assertTrue("Not on product page", productButton.isDisplayed());

        List<WebElement> inventoryItemDescriptions = driver.findElements(By.className("inventory_item_desc"));

        for (WebElement webElement : inventoryItemDescriptions){
            System.out.println(webElement.getText());
            System.out.println("==========================");
        }

        Thread.sleep(5000);

    }
    public void cleanUp(){
        quitDriver();
    }

}
