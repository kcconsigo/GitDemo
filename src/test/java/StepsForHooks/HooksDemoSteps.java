package StepsForHooks;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class HooksDemoSteps {
	
	
	  WebDriver driver = null;
	  
	  @Before public void browserSetup() {
	  
	  System.out.println("===== I am inside of browser =====");
	  System.setProperty("webdriver.chrome.driver",
	  "C:/Users/KC/eclipse-workspace/CucumberJava/src/test/resources/drivers/chromedriver.exe"
	  );
	  
	  driver = new ChromeDriver();
	  
	  driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
	  driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	  driver.manage().window().maximize(); driver.manage().deleteAllCookies(); }
	  
	  @After public void tearDown() { System.out.println("Im inside");
	  driver.close(); driver.quit(); }
	  
	  @Given("user is on the page") public void user_is_on_the_page() { 
		  
		  System.out.println("Hello Everyone");
	  }
	  
	  @When("user enters valid username and password") public void
	  user_enters_valid_username_and_password() { }
	  
	  @And("clicks on login button") public void clicks_on_login_button() { }
	  
	  @Then("user is navigated to the web page") public void
	  user_is_navigated_to_the_web_page() { }
	  
	 
}
