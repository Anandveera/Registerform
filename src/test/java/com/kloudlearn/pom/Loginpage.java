package com.kloudlearn.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Loginpage extends Accessingelement {

    private WebDriver driver;
    public Loginpage(WebDriver driver) {

        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "(//button[@type='submit'])[1]")
    private WebElement registerBtnElement;

    public void clickRegisterBtn() {
        clickElement(registerBtnElement);
    }
}
