package ru.otus.qa.appium2;

import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class FillingProfileTest {

    AppiumDriver driver;

    @BeforeMethod
    void setUp() {
        driver = DriverUtils.initDriver();
    }

    @AfterMethod
    void tearDown() {
        driver.quit();
    }

    @Test
    void shouldShowFillingProfileBtn() {
        driver.findElement(By.id("ru.skoda.service:id/cardViewFourDynamic"))
              .click();
        WebElement fillProfileButton = driver.findElement(By.id("ru.skoda.service:id/fillProfileButton"));
        String buttonText = fillProfileButton.getAttribute("text");
        assertEquals(buttonText, "ЗАПОЛНИТЬ ПРОФИЛЬ");
    }


    @Test
    void shouldBeClickableProfileBtn() {
        driver.findElement(By.id("ru.skoda.service:id/bottom_profile"))
              .click();
    }

}
