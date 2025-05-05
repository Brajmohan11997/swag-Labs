package loginPage;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class loginpage {
    WebDriver driver;

    @Given("launch the browser")
    public void launch_the_browser(){
        driver = new ChromeDriver();
        driver.get("https://www.saucedemo.com/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
    }

    @When("enter the valid data")
    public void enter_the_valid_data(){
        driver.findElement(By.id("user-name")).sendKeys("standard_user");
        driver.findElement(By.xpath("//input[@placeholder=\"Password\"]")).sendKeys("secret_sauce");
    }

    @And("click submit button")
    public void click_submit_button(){
        driver.findElement(By.id("login-button")).click();
    }

    @Then("close the browser")
    public void close_the_browser() throws InterruptedException {
        Thread.sleep(3000);
        driver.quit();
    }
}
