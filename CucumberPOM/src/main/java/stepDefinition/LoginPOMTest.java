package stepDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;                                                                                                          
import io.cucumber.java.en.When;

public class LoginPOMTest {
	WebDriver driver;
	
	@Given("User is on HerokuApp")
	public void user_is_on_HerokuApp() {
		System.setProperty("webdriver.chrome.driver","Resources\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://the-internet.herokuapp.com/login");
	}

	@When("User enters username and password")
	public void user_enters_username_and_password() {
		LoginOR obj = new LoginOR(driver);
		obj.usern.sendKeys("tomsmith");
		obj.password.sendKeys("SuperSecretPassword!");
		obj.login.click();
				
	}

	@Then("User logged in successfully")
	public void user_logged_in_successfully() {
	    System.out.println("user logged in successfully");
	}

}
