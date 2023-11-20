import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TC_05_HRM {

    public static void main(String[] args) {
        // TC05: To verify that login functionality with valid username and invalid password

        // Setting up ChromeDriver path
        System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver-win64\\chromedriver.exe");

        // Creating WebDriver instance
        WebDriver driver = new ChromeDriver();

        // Implicitly wait and maximize the window
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();

        // Navigate to the login page
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

        // Perform login with valid username and invalid password
        driver.findElement(By.name("username")).sendKeys("Admin");
        driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("admin1234");
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

