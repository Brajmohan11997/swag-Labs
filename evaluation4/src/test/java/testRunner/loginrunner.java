package testRunner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        features = "D:\\evaluation4\\src\\test\\resources\\login.feature",
        glue = {"loginPage"},
        monochrome = true
)

public class loginrunner extends AbstractTestNGCucumberTests {
}
