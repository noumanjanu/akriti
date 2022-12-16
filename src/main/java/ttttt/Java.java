package ttttt;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;


public class Java {	
	
	public WebDriver driver;
	@Given ("^open application$")
	 public void openapplication() {
		System.setProperty("webdriver.chrome driver", "C:\\chromedriver_win32\\chromedriver_win32\\chromedriver.exe");
	driver = new ChromeDriver();
	driver.navigate().to("http:183.82.103.245/nareshit/login.php");
	System.out.println("opened application");
	}
	@When("^login$")
	 public void login() {
		System.out.println("login completed");
	}
	@Then("^")
}
