package utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class DriverManager {
    public static WebDriver createDriver() {
        ChromeOptions options = new ChromeOptions();
        if (Boolean.getBoolean("headless")) options.addArguments("--headless=new");
        return new ChromeDriver(options);
    }
}
