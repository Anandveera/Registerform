package com.kloudlearn.pom;


import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.Select;


public class Accessingelement {


    public void enterTestBoxValues(WebElement element, String content) {

        element.clear();
        element.sendKeys(content);
    }

    public void clickElement(WebElement element) {

        element.click();
    }

    public void selectDropDownByVText(WebElement element, String content) {

        Select dropDown = new Select(element);
        dropDown.selectByVisibleText(content);
    }
}