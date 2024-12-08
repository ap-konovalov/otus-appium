package ru.otus.qa.appium1;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.remote.MobilePlatform;
import org.openqa.selenium.By;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class FillingProfileTest {

    AppiumDriver<MobileElement> driver;

    @BeforeMethod
    void setUp() {
        driver = Driver.initMobileDriver(MobilePlatform.ANDROID);
    }

    @AfterMethod
    void tearDown() {
        driver.quit();
    }

    @Test
    void shouldShowFillingProfileBtn() {
        driver.findElement(By.id("ru.skoda.service:id/cardViewFourDynamic"))
              .click();
        MobileElement fillProfileButton = driver.findElement(By.id("ru.skoda.service:id/fillProfileButton"));
        String buttonText = fillProfileButton.getAttribute("text");
        assertEquals(buttonText, "ЗАПОЛНИТЬ ПРОФИЛЬ");
    }


    @Test
    void shouldBeClickableProfileBtn() {
        driver.findElement(By.id("ru.skoda.service:id/bottom_profile"))
              .click();
    }

}
