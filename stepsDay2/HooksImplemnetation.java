package stepsDay2;

import java.time.Duration;

import org.openqa.selenium.chrome.ChromeDriver;

import StepsforLeads.BaseClass;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.github.bonigarcia.wdm.WebDriverManager;

public class HooksImplemnetation extends DriverClass {

	@Before
	public void precondition() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

		driver.get("http://leaftaps.com/opentaps/control/login");	
	}
	@After
	public void postcondition() {
		driver.close();
	}

}
