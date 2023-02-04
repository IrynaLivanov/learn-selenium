package com.automation.commons;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class AdvancedMouseInteraction  extends CommonMethods{


    @Test
    public void learnAdvancedMouseInteraction() throws InterruptedException {
        WebDriver driver = getDriver();

        //
        Actions actions = new Actions(driver);

        WebElement doubleClickBtn = driver.findElement(By.xpath("//button[contains(text(),'Double')]"));
        WebElement rightClickBtn = driver.findElement(By.xpath("//button[contains(text(),'Right')]"));

        //actions class has a lot of different methods to perform various different advanced mouse interactions and actions
        //In this case we are calling the .doubleClick() method and passing the element we wait to double click on
        //We are calling the .build() method in order to build the actual sequence
        //And then perform() method which actually performs the actions

        actions.doubleClick(doubleClickBtn).build().perform();


        //action.moveToElement(doubleClickBtn).doubleClick().build().perform();
        Thread.sleep(3000);


        //The actions contextClick() method will perform a right click/context click(synonyms)
        // on the webelement that is pass as a paarameter
        actions.contextClick(rightClickBtn).build().perform();
        Thread.sleep(3000);

        driver.navigate().to("http://the-internet.herokuapp.com/hovers");
        WebElement hoverIcon = driver.findElement(By.xpath("//div[@class='figure'][1]"));

        actions.moveToElement(hoverIcon).build().perform();
        Thread.sleep(3000);


        WebElement viewProfileLink = driver.findElement(By.xpath("//div[@class='figure'][1]//a"));
        actions.keyDown(Keys.COMMAND).click(viewProfileLink).keyUp(Keys.COMMAND).build().perform();

        Thread.sleep(3000);



    }
@Test
    public void learnDragAndDrop() throws InterruptedException {
        WebDriver driver = getDriver();
        Actions actions = new Actions(driver);
        driver.navigate().to("https://demoqa.com/droppable");

        WebElement draggable = driver.findElement(By.id("draggable"));
        WebElement droppable = driver.findElement(By.id("droppable"));

    //dragAndDrop(WebElement, WebElement) method will drag the first parameter
    // passed to the location of second parameter passed

        actions.dragAndDrop(draggable, droppable).build().perform();
        Thread.sleep(3000);


        driver.navigate().to("https://demoqa.com/slider");
        WebElement slider = driver.findElement(By.xpath("//input[@type='range']"));


      //dragAndDropBy(WebElement, xOffset, yOffset) this method will drag element by the given x and y offset
        actions.dragAndDropBy(slider,75,0).build().perform();
        Thread.sleep(3000);

        actions.dragAndDropBy(slider,-20,0).build().perform();
        Thread.sleep(3000);

} @Test
    public void learnScroll() throws InterruptedException {

        WebDriver driver = getDriver();
        Actions actions = new Actions(driver);

        driver.navigate().to("https://www.saucedemo.com/inventory.html");

        loginToSauceDemo();


        WebElement sauceLabOnesie = driver.findElement(By.xpath("//div[text()='Sauce Labs Onesie']"));

       // actions.scrollToElement(sauceLabOnesie).build().perform();

        Thread.sleep(3000);

        actions.scrollByAmount(0,500).build().perform();
        Thread.sleep(3000);


    }


    @Before
    public void setUp(){
        createDriver("https://demoqa.com/buttons");

    }
    @After
    public void cleanUp(){
        quitDriver();
    }

}
