package com.kloudlearn.business;

import com.kloudlearn.common.Testbase;
import com.kloudlearn.pom.Homepage;
import com.kloudlearn.pom.Loginpage;
import com.kloudlearn.pom.Registerpage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class Formregistration extends Testbase implements FormTestData {

    @BeforeTest
    public void configureBrowser() {

        setDriver();
    }

    @Test
    public void runRegistrationProcess() {

        // Launch kloudlearn url
        driver.get("https://www.kloudlearn.com/");

        Homepage homepage = new Homepage(driver);
        homepage.clickSignUpFreeBtn();

        Loginpage loginpage = new Loginpage(driver);
        loginpage.clickRegisterBtn();

        Registerpage registerpage = new Registerpage(driver);
        registerpage.enterEmail(email);
        registerpage.enterPassword(password);
        registerpage.enterWorkspaceName(workspaceName);
        registerpage.enterFirstName(firstName);
        registerpage.enterLastName(lastName);
        registerpage.clickRegisterBtn();
        try{TimeUnit.SECONDS.sleep(60);} catch (InterruptedException ex) {ex.printStackTrace();}
    }

    @AfterTest
    public void teardown() {
        tearDown();
    }
}
