import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.time.Duration;

public class FirstTest {
    WebDriver driver = new ChromeDriver();

    @Test
    public void firstTest(){
        driver.get("https://ilcarro.web.app/search");
        driver.manage().window().maximize();
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        pause(3);
        WebElement btnLetTheCarWork = driver.findElement(By.cssSelector("a[id='1']"));
        btnLetTheCarWork.click();
        pause(3);
        WebElement btnTOS = driver.findElement(By.cssSelector("*[ng-reflect-router-link='terms-of-use']"));
        btnTOS.click();
        pause(3);
        WebElement btnSignUp = driver.findElement(By.linkText("Sign up"));
        btnSignUp.click();
        System.out.println(btnSignUp.getText());
        pause(3);
        WebElement inputName = driver.findElement(By.id("name"));
        //WebElement inputName = driver.findElement(By.cssSelector("*[id='name']"));
        inputName.sendKeys("TestName");
        WebElement inputLastName = driver.findElement(By.id("lastName"));
        inputLastName.sendKeys("TestLastName");
        WebElement inputEmail = driver.findElement(By.id("email"));
        inputEmail.sendKeys("test@gmail.com");
        WebElement inputPassword = driver.findElement(By.id("password"));
        inputPassword.sendKeys("@Password123");
        WebElement chkbxTerms = driver.findElement(By.cssSelector("input[id='terms-of-use']"));
        chkbxTerms.isSelected();


        //System.out.println("===================");


    }
    public static void pause(int seconds) {
        try {
            Thread.sleep(seconds * 1000L);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}

