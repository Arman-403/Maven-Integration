package org.example;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseClass {

    WebDriver driver;

    public WebDriver LaunchSite() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://www.facebook.com");
        return driver;
    }

    public void closeDriver() throws InterruptedException {
        Thread.sleep(3000);
        driver.close();
    }
}
