package com.automation.commons;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class DropDowns extends CommonMethods {
    @Test
    public void learnDropdowns() throws InterruptedException {
        WebDriver driver = getDriver();
        driver.navigate().to("https://www.globalsqa.com/demo-site/select-dropdown-menu/");
        Thread.sleep(3000);

        WebElement dropdown = driver.findElement(By.xpath("//select"));
        WebElement selectCountryTitle = driver.findElement(By.id("Select Country"));


        System.out.println(selectCountryTitle.getText());
        System.out.println(selectCountryTitle.getAttribute("id"));
        System.out.println(selectCountryTitle.getAttribute("class"));
        System.out.println(selectCountryTitle.getAttribute("aria-controls"));
        System.out.println(selectCountryTitle.getAttribute("role"));


       //Select class has a constructor with parameter WebElement with parameter
        Select countriesDropdown = new Select(dropdown);

        System.out.println(countriesDropdown.getOptions()) ;

        List<WebElement> optionsList = countriesDropdown.getOptions();
        System.out.println("--------------------------");

        //optionsList.get(0).getText();


        for(WebElement option: optionsList){
            System.out.println(option.getText() + "\t" + option.getAttribute("value"));
        }




    countriesDropdown.selectByVisibleText("Bermuda");
        Thread.sleep(3000);

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


