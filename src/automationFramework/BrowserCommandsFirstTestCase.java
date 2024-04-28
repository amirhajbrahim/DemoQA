package automationFramework;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserCommandsFirstTestCase {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver-win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        String url = "https://shop.demoqa.com/";
        driver.get(url);
        String pageTitleName = driver.getTitle();
        int pageTitleNameLength = pageTitleName.length();
        System.out.println("Page Title is: " + pageTitleName);
        System.out.println("Page Title Name Length is: " + pageTitleNameLength);

        String currentUrl = driver.getCurrentUrl();
        if (currentUrl.equals(url)) {
            System.out.println("Verification Successful");
        }
        else {
            System.out.println("Verification Failed");

            System.out.println("Current URL is: " + currentUrl);
            System.out.println("Expected URL is: " + url);
        }

        String pageSource = driver.getPageSource();
        int pageSourceLength = pageSource.length();
        System.out.println("Page Length is: " + pageSourceLength);

        driver.quit();

    }
}
