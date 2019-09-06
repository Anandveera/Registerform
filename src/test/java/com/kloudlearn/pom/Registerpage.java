package com.kloudlearn.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Registerpage extends Accessingelement {

    private WebDriver driver;

    @FindBy(id = "org_email")
    private WebElement emailTextElement;

    @FindBy(id = "password")
    private WebElement passwordTextElement;

    @FindBy(id = "org_name")
    private WebElement workspaceTextElement;

    @FindBy(id = "first_name")
    private WebElement fnameTextElement;

    @FindBy(id = "last_name")
    private WebElement lnameTextElement;

    @FindBy(xpath = "//button[@type='submit']")
    private WebElement registerBtnElement;

    public Registerpage(WebDriver driver) {

        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void enterEmail(String email) {
        enterTestBoxValues(emailTextElement, email);
    }

    public void enterPassword(String password) {
        enterTestBoxValues(passwordTextElement, password);
    }

    public void enterWorkspaceName(String name) {
        enterTestBoxValues(workspaceTextElement, name);
    }

    public void enterFirstName(String fname) {
        enterTestBoxValues(fnameTextElement, fname);
    }

    public void enterLastName(String lname) {
        enterTestBoxValues(lnameTextElement, lname);
    }

    public void clickRegisterBtn() {
        clickElement(registerBtnElement);
    }
}
