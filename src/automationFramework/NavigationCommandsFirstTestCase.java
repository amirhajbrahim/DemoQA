package automationFramework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class NavigationCommandsFirstTestCase {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver-win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        String url = "https://demoqa.com/";
        driver.get(url);

        WebElement BookStoreApp = driver.findElement(By.xpath("//div[@class='card-body']//h5[text()='Book Store Application']"));
        Actions actions = new Actions(driver);

        actions.moveToElement(BookStoreApp).click().perform();

        driver.navigate().back();
        driver.navigate().forward();
        driver.navigate().to(url);
        driver.navigate().refresh();

        System.out.println("Successful Operation!");

        driver.quit();
    }
}
