package stepsDay2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.But;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class StepDefinitions extends DriverClass {
	
	//  public static ChromeDriver driver;
	  
	  @Given("Open Chromebrowser") public void Openbrowser() {
	  WebDriverManager.chromedriver().setup(); driver = new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5)); }
	  
	  @Given("Enter the url") public void openUrl() {
	  driver.get("http://leaftaps.com/opentaps/control/login");
	  
	  }
	 
	@Given("Enter the username {string}")
	public void enterUsername(String uName) {
		WebElement usernameElement = driver.findElement(By.id("username"));
		usernameElement.sendKeys(uName);
	}
	@Given("Enter the passoword {string}")
	public void enterPassword(String uPass) {
		WebElement passwordElement = driver.findElement(By.name("PASSWORD"));
		passwordElement.sendKeys(uPass);
	}
	@And("Click on Login button")
	public void clickLogin() {
		WebElement loginButton = driver.findElement(By.className("decorativeSubmit"));
		loginButton.click();
	}

	@Then("HomePage is launched")
	public void verifyHomepage() {
		boolean displayed = driver.findElement(By.linkText("CRM/SFA")).isDisplayed();
		if(displayed) {
			System.out.println("Homepage is dispalyed");}
		else {
			System.out.println("Something wrong");}

	}
	@But("Error message should be displayed")
	public void verifyNegativepage(){
		System.out.println("Error is dispalyed");
	}	

}