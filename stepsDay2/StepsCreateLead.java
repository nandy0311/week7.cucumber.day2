package stepsDay2;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepsCreateLead extends DriverClass {
	//public  ChromeDriver driver;
	@When("Run createleadmethod")
	public void createleadmethod() {
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Create Lead")).click();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("ANX");
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Nan");
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("A");
		driver.findElement(By.id("createLeadForm_primaryPhoneNumber")).sendKeys("899");
		driver.findElement(By.name("submitButton")).click();

	}
	@Then("Lead created successfully")
	public void leadCreation() {
		System.out.println("Lead created successfully");
		
	}


}
