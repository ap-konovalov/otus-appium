package ru.otus.qa.appium2;

import java.net.MalformedURLException;
import java.net.URL;

class ConfigUtils {

    private ConfigUtils() {
    }

    public static URL getAppiumServerUrl(){
        try {
            return new URL("http://0.0.0.0:4723/wd/hub");
        } catch (MalformedURLException e) {
            throw new IllegalArgumentException("Invalid Appium server URL.", e);
        }
    }
}
