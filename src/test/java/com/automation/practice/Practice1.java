package com.automation.practice;

import com.automation.commons.CommonMethods;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Practice1  extends CommonMethods {


        @Test
        public void practice1(){
            //renaming driver
            WebDriver driver = getDriver();

            //calling method to log in
            loginToSauceDemo();

            //second part of the task, asserting a cart button
            WebElement cartBtn = driver.findElement(By.className("shopping_cart_link"));
            Assert.assertTrue("shopping cart button is not visible",cartBtn.isDisplayed());
            cartBtn.click();


            //third part of the task, asserting checkout button
            WebElement checkoutBtn = driver.findElement(By.cssSelector("#checkout"));
            Assert.assertTrue("checkout button is not visible",checkoutBtn.isDisplayed());

            //navigating back to homepage
            driver.navigate().back();

            //adding first item into our shopping cart
            WebElement addingItem = driver.findElement(By.id("add-to-cart-sauce-labs-backpack"));
            addingItem.click();

            //navigating back/back
            driver.navigate().forward();

            //checking if item is inside our shopping cart
            WebElement verifyingTheBagIsInCart = driver.findElement(By.className("inventory_item_name"));
            Assert.assertTrue("the item is not there",verifyingTheBagIsInCart.isDisplayed());

            System.out.println(verifyingTheBagIsInCart.getText());
        }


    @Before
    public void setUp() {
        createDriver("https://demoqa.com/upload-download");

    }

    @After
    public void cleanUp() {
        quitDriver();
    }
}

