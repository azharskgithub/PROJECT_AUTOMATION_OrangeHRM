import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TC_01_HRM {
    public static void main(String[] args) {
        // TC_01: To verify that the OrangeHRM web URL functionality

        // Setting up ChromeDriver path
        System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver-win64\\chromedriver.exe");

        // Creating WebDriver instance
        WebDriver driver = new ChromeDriver();

        // Maximize the window
        driver.manage().window().maximize();

        // Navigate to the OrangeHRM web URL
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

        // Additional actions can be performed here...

        // Note: The browser will remain open, and you can continue with other actions if needed.
    }
}
