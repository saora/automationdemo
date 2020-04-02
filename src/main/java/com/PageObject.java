package com;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class PageObject {
    WebDriver driver;
    public PageObject(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }


    public void clickOnElement(WebElement element){
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        element.click();
    }

    public void typeOnElement(WebElement element, String txt){
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.visibilityOf(element));
        element.sendKeys(txt);
    }

    public void typeOnSelectedElements(List<WebElement> elements, String textContains, String textToType){
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.visibilityOfAllElements(elements));
        for(WebElement element:elements){
            String eAtt = element.getAttribute("id");
            if(eAtt.contains(textContains)){
                element.sendKeys(textToType);
            }
        }
    }
}
