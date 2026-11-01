package pages;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginPage {
    private final WebDriver driver;

    public LoginPage(WebDriver driver) { this.driver = driver; }

    public void login(String username, String password) {
        driver.findElement(By.id("username")).sendKeys(username);
        driver.findElement(By.id("password")).sendKeys(password);
        driver.findElement(By.cssSelector("#login button")).click();
    }

    public String errorMessage() {
        return new WebDriverWait(driver, Duration.ofSeconds(15)).until(
                ExpectedConditions.visibilityOfElementLocated(By.id("flash"))).getText();
    }
}
