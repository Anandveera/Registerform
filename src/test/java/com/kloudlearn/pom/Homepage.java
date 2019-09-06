package com.kloudlearn.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Homepage extends Accessingelement {

    private WebDriver driver;
    public Homepage(WebDriver driver) {

        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//button[contains(text(),'Sign up free ')]")
    private WebElement signUpFreeBtnElement;

    public void clickSignUpFreeBtn() {
        clickElement(signUpFreeBtnElement);
    }
}
