package TrueRunner;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/resources/Feature/Linkedlist.feature",glue= {"Stepdefinition","AppHooks"},
monochrome=true,plugin= {"pretty","html:target/htmlReports/reports.html"})
public class Runnerdsalgo {
	

}
