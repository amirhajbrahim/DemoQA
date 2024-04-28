package automationFramework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class BrowserCommandsSecondTestCase {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver-win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        String url = "https://demoqa.com/browser-windows/";
        driver.get(url);

        driver.findElement(By.id("windowButton")).click();

        driver.quit();
    }
}
