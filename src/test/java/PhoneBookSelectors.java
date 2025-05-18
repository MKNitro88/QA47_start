import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import java.time.Duration;

public class PhoneBookSelectors
{
    WebDriver driver = new ChromeDriver();
    @Test
    public void phoneBookTest(){
        driver.get("https://telranedu.web.app/home");
        driver.manage().window().maximize();
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));


        /*
        home work
        1. open the page
        2. navigate to about page
        3. navigate to login page
        4. enter the email and password
        5. click on login button
        6. use pause() from FirstTest class
         */
    }
}
