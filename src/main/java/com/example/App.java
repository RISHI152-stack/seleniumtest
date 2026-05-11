import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class App {
    public static void main(String[] args) {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--headless");                // Run without GUI
        options.addArguments("--no-sandbox");              // Linux sandbox issues
        options.addArguments("--disable-dev-shm-usage");   // Prevent /dev/shm errors
        options.addArguments("--remote-allow-origins=*"); // Avoid ChromeDriver origin errors

        WebDriver driver = new ChromeDriver(options);
        driver.get("https://www.google.com");
        System.out.println(driver.getTitle());
        driver.quit();
    }
}
