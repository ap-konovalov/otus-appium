package ru.otus.qa.appium2;

import io.appium.java_client.AppiumDriver;

class DriverUtils {

    private DriverUtils() {
    }

    public static AppiumDriver initDriver() {
        return new AppiumDriver(ConfigUtils.getAppiumServerUrl(), Capabilities.initCapabilities());
    }
}
