package cucumberoptions;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import cucumber.api.testng.AbstractTestNGCucumberTests;

//If want to run cucumber without testng, uncomment Runwith and remove extends
//@RunWith(Cucumber.class) 
@CucumberOptions(
		features="src/test/java/features", //if we run multiple file, no need to specify .feature file
		glue="stepDefinition") //package name
public class TestRunner extends AbstractTestNGCucumberTests {
	

}
