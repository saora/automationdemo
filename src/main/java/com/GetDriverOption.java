package com;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetDriverOption {
     static WebDriver driver;
    public static WebDriver getDriverOpt(driverOption dopt){
        switch (dopt){
            case CHROME:
                System.setProperty("webdriver.chrome.driver","src/main/resources/webdriver/chromedriver.exe");
                driver = new ChromeDriver();
                break;
            case FIREFOX:
                break;
            case IE:
                break;
            case SAFARI:
                break;
        }
        driver.manage().window().maximize();
        return driver;
    }

}
