package TestRunners;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)

@CucumberOptions(
		features = "features\\LoginPOM.feature",
		glue = {"stepDefinition"},
		plugin = {"json:target/cucumber-report/26August.json"}
		)
public class LoginPOMRunner {

}
