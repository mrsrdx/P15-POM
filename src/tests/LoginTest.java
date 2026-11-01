package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import base.BaseTest;
import pages.HomePage;
import pages.LoginPage;

public class LoginTest extends BaseTest {
    @Test
    public void validLogin() {
        new LoginPage(driver).login("tomsmith", "SuperSecretPassword!");
        HomePage home = new HomePage(driver);
        Assert.assertEquals(home.title(), "Secure Area");
        Assert.assertTrue(home.logoutVisible(), "Logout must be visible");
    }

    @Test
    public void invalidLogin() {
        LoginPage login = new LoginPage(driver);
        login.login("tomsmith", "wrong-password");
        Assert.assertTrue(login.errorMessage().contains("Your password is invalid!"));
    }
}
