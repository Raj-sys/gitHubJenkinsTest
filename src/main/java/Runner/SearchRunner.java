package Runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
@RunWith(Cucumber.class)
@CucumberOptions(features={"C:\\Seleniumworkspace\\SearchTest\\src\\test\\resources\\Features"},glue={"StepDefination"}, tags={"@bing"}, monochrome=true)

public class SearchRunner {

		// TODO Auto-generated method stub

}
