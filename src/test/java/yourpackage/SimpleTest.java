package yourpackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class SimpleTest {
    @Test
    public void testWebsiteLoading() {
        // Set the path to ChromeDriver
        System.setProperty("webdriver.chrome.driver", "chromedriver.exe");

        // Initialize ChromeDriver
        WebDriver driver = new ChromeDriver();

        // Open the website
        driver.get("https://krishnas-77.github.io/Exp05/home.html");

        // Check the title of the webpage
        String title = driver.getTitle();
        assertEquals("Expected Title", title);

        // Close the browser
        driver.quit();
    }
}