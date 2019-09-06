package com.kloudlearn.common;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Testbase {

    public static WebDriver driver;

    public static void setDriver() {

        String chromeLocation = System.getProperty("user.dir")
                + "\\src\\test\\resources\\drivers\\chromedriver.exe";
        System.setProperty("webdriver.chrome.driver", chromeLocation);
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
        driver.manage().window().maximize();
    }

    public void tearDown() {

        driver.quit();
    }
}
