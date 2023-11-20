import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TC_02_HRM {

    public static void main(String[] args) {
        // TC02: To verify that OrangeHRM handles invalid URL

        // Setting up ChromeDriver path
        System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver-win64\\chromedriver.exe");

        // Creating WebDriver instance
        WebDriver driver = new ChromeDriver();

        // Maximize the window
        driver.manage().window().maximize();

        // Navigate to an invalid OrangeHRM URL
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login--");

        // Additional actions or verifications can be performed here...

        // Note: The browser will remain open for further analysis or actions.
    }
}
