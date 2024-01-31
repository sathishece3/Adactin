package Runner;

import Base_class.Base_class;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.chrome.ChromeDriver;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/java/feature_file/feature_file.feature", glue = "Stepdefinition")

public class Runner_class extends Base_class {

@BeforeClass
    public static void start(){

    driver = new ChromeDriver();
}
@AfterClass
    public static void end(){

//    driver.quit();

}

}
