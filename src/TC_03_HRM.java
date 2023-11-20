import java.time.Duration;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TC_03_HRM {

    public static void main(String[] args) {
        // TC03: To verify that login functionality with valid credentials

        // Setting up ChromeDriver path
        System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver-win64\\chromedriver.exe");

        // Creating WebDriver instance
        WebDriver driver = new ChromeDriver();

        // Implicitly wait and maximize the window
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().window().maximize();

        // Navigate to the login page
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

        // Perform login with valid credentials
        driver.findElement(By.name("username")).sendKeys("Admin");
        driver.findElement(By.name("password")).sendKeys("admin123");
        driver.findElement(By.xpath("//button[@type='submit']")).click();

        // The following are your element locators that you may use in other parts of your code
        // <input class="oxd-input oxd-input--active" name="username" placeholder="Username" autofocus="" data-v-1f99f73c="">
        // input[@placeholder='Username']
        // <input class="oxd-input oxd-input--active" type="password" name="password" placeholder="Password" data-v-1f99f73c="">
        // input[@placeholder='Password']
        // <button type="submit" class="oxd-button oxd-button--medium oxd-button--main orangehrm-login-button" data-v-10d463b7="" data-v-358db50f=""><!----> Login <!----></button>
        // button[@type='submit']

   
    }
}
