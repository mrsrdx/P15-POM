package pages;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HomePage {
    private final WebDriver driver;

    public HomePage(WebDriver driver) { this.driver = driver; }

    public String title() {
        new WebDriverWait(driver, Duration.ofSeconds(15)).until(ExpectedConditions.urlContains("/secure"));
        return driver.findElement(By.cssSelector(".example h2")).getText();
    }

    public boolean logoutVisible() {
        return driver.findElement(By.cssSelector("a[href='/logout']")).isDisplayed();
    }
}
