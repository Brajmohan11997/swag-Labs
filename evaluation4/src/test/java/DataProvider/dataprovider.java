package DataProvider;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.time.Duration;

public class dataprovider {

    @Test(dataProvider = "getTestData") 
    public void login(String userName, String password) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.saucedemo.com/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.findElement(By.id("user-name")).sendKeys(userName);
        driver.findElement(By.xpath("//input[@placeholder=\"Password\"]")).sendKeys(password);
        driver.findElement(By.id("login-button")).click();
        driver.quit();
    }

    @org.testng.annotations.DataProvider
    public Object[][] getTestData() {
        Object[][] data = new Object[2][2];
        data[0][0] = "standard_user";
        data[0][1] = "secret_sauce";
        data[1][0] = "problem_user";
        data[1][1] = "secret_sauce";
        return data;
    }
}
