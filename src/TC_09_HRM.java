import java.time.Duration;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TC_09_HRM {

    public static void main(String[] args) throws InterruptedException {
        // TC09: To verify add candidate

        // Setting up ChromeDriver path
        System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver-win64\\chromedriver.exe");

        // Creating WebDriver instance
        WebDriver driver = new ChromeDriver();

        // Implicitly wait and maximize the window
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.manage().window().maximize();

        // Navigate to the login page
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

        // Perform login with valid credentials
        driver.findElement(By.name("username")).sendKeys("Admin");
        driver.findElement(By.name("password")).sendKeys("admin123");
        driver.findElement(By.xpath("//button[@type='submit']")).click();
        driver.findElement(By.xpath("//a[@href='/web/index.php/recruitment/viewRecruitmentModule']")).click();
        driver.findElement(By.xpath("//button[@class='oxd-button oxd-button--medium oxd-button--secondary']")).click();
        driver.findElement(By.xpath("//input[@class='oxd-input oxd-input--active orangehrm-firstname']")).sendKeys("azharttt");
        driver.findElement(By.xpath("//input[@class='oxd-input oxd-input--active orangehrm-middlename']")).sendKeys("ty");
        driver.findElement(By.xpath("//input[@class='oxd-input oxd-input--active orangehrm-lastname']")).sendKeys("shaikh");
        driver.findElement(By.xpath("(//input[@placeholder='Type here'])[1]")).sendKeys("ABC@gmail.com");
        driver.findElement(By.cssSelector("button[type='submit']")).click();
       //dropdown is not working 
        //WebElement dropdown =driver.findElement(By.xpath("//div[@class='oxd-select-text-input']"));
        
       // Select select = new Select(dropdown);
        
       // select.selectByVisibleText("Associate IT Manager");

       // WebElement dropdown = driver.findElement(By.xpath("//div[@class='oxd-select-text-input']"));
       // dropdown.click();

       // WebElement option = driver.findElement(By.xpath("//div[@id='app']//form//div[2]/div/div/div/div[2]/div/div/div[1]"));
       // option.click();
        
        
       //Select.selectByIndex(5);
        
        

        

        
        


  


    }
}


