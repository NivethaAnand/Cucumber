package testRunner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LoginPage {
WebDriver driver;
@Given("^user is on the facebook page$")
public void user_is_on_the_facebook_page() throws Throwable {
	System.setProperty("webdriver.chrome.driver", "D:\\Velmurugan\\JAVA\\eclipse-java-oxygen-3a-win32-x86_64\\eclipse\\Nivetha\\Cucumber\\Driver\\chromedriver.exe");
	driver=new ChromeDriver();
	driver.get("https://www.facebook.com/");
}

@When("^User enters user name and passwordn$")
public void user_enters_user_name_and_passwordn() throws Throwable {
	driver.findElement(By.id("email")).sendKeys("Nivetha");
	driver.findElement(By.id("pass")).sendKeys("Nivetha");

	
}

@Then("^user clicks login button$")
public void user_clicks_login_button() throws Throwable {
	driver.findElement(By.id("loginbutton")).click();

}

@When("^User enter details$")
public void user_enter_details() throws Throwable {
	driver.findElement(By.name("firstname")).sendKeys("Nivetha");
	driver.findElement(By.name("lastname")).sendKeys("Anand");
	
	driver.findElement(By.name("reg_email__")).sendKeys("nivethaanand30@gmail.com");
}

@Then("^user clicks register button$")
public void user_clicks_register_button() throws Throwable {
	
	driver.findElement(By.name("websubmit")).click();
	}


@When("^User Clicks the create a page$")
public void user_Clicks_the_create_a_page() throws Throwable {
}


}
