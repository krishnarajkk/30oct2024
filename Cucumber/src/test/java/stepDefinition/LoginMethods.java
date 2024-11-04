package stepDefinition;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import junit.framework.Assert;

public class LoginMethods {
	
	WebDriver driver;

	@Given("Enter the URL in the Address Bar")
	public void enter_the_url_in_the_address_bar() {
		driver=new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}
	@When("user enter the valid username and password")
	public void user_enter_the_valid_username_and_password() {
		driver.findElement(By.name("username")).sendKeys("Admin");
		driver.findElement(By.name("password")).sendKeys("admin123");
	    
	}
	@When("click the login button")
	public void click_the_login_button() {
	    driver.findElement(By.xpath("//button[text()=' Login ']")).click();
	}
	@Then("It should logged into the Application Home page")
	public void it_should_logged_into_the_application_home_page() {
	  String actual= driver.getTitle();
	  String expected = "OrangeHRM";
	  
	  Assert.assertEquals(actual, expected);
	  System.out.println("Logged In Successfully");

	}

}
