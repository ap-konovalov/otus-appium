package ru.otus.qa.appium1;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

 class Driver {

    private Driver() {
    }

    public static AppiumDriver<MobileElement> initMobileDriver(String mobilePlatform) {
        if (mobilePlatform.equals("Android")) {
            return new AndroidDriver<>(ConfigUtils.getAppiumServerUrl(), Capabilities.initCapabilities());
        }
        throw new IllegalArgumentException(String.format("Для платформы '%s' не найден appium driver", mobilePlatform));
    }
}
