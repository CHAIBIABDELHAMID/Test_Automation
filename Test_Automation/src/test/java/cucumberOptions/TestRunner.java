package cucumberOptions;

 
import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;


@RunWith(Cucumber.class)
@CucumberOptions(
		features="src/test/java/TestCases_Amarla",
		glue= {"stepDefinitions_Amarla"},
		tags= "@Calendar",
		strict=true,
		plugin= {"pretty","html:src/test/java/target/report"})


public class TestRunner {

	
	
}
