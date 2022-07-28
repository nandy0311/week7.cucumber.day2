package runnerDay2;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;


@CucumberOptions(features="src/test/java/cucumberDay2Features", glue="stepsDay2",monochrome=true, publish=true,tags="@smoke or @regression")
//monochrome to remove junk char, publish to generate cucumber report

public class CucumberRunnerDay2 extends AbstractTestNGCucumberTests{

}
