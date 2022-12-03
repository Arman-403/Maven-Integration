import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

import java.util.ArrayList;
import java.util.List;

public class TestCases {

    @Test
    public  void main() {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://www.armani.com/en-in/experience/ea7/man-quiz-step-2");
        driver.findElement(By.xpath("//a[@href='https://www.facebook.com/giorgioarmani']")).click();
        driver.findElement(By.xpath("//a[@href='https://www.instagram.com/giorgioarmani']")).click();
        driver.findElement(By.xpath("//a[@href='https://twitter.com/armani']")).click();
        driver.findElement(By.xpath("//a[@href='https://www.youtube.com/Armani']")).click();

        List<String> tabs = new ArrayList<>(driver.getWindowHandles());
        System.out.println(tabs);


        for (String tab : tabs) {
            driver.switchTo().window(tab);
            System.out.println(driver.getTitle());

            if (driver.getTitle().contains("Instagram")) {
                driver.switchTo().window(tab);
                System.out.println(driver.getCurrentUrl());
            }
        }

        driver.quit();

    }
}
