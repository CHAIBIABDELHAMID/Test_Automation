package cucumberOptions;

 
import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;


@RunWith(Cucumber.class)
@CucumberOptions(
		//plugin= {"pretty","html:target/amarla"},
		strict=true,
		features="src/test/java/TestCases_Amarla",
		glue= {"stepDefinitions_Amarla"},
		tags= "@Calendar,@Associate_Navigation")


public class TestRunner {

	
	
}
