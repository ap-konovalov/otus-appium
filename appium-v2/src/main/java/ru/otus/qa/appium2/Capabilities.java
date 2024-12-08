package ru.otus.qa.appium2;

import io.appium.java_client.remote.AutomationName;
import org.openqa.selenium.Platform;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.nio.file.Paths;

class Capabilities {

    private Capabilities() {
    }

    public static DesiredCapabilities initCapabilities() {
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability("platformName", Platform.ANDROID);
        capabilities.setCapability("appium:automationName", AutomationName.ANDROID_UIAUTOMATOR2);
        capabilities.setCapability("appium:deviceName", "emulator-5554");
        capabilities.setCapability("appium:app", Paths.get("skoda.apk").toAbsolutePath().toString());
        return capabilities;
    }
}
