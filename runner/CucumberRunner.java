package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import io.cucumber.testng.CucumberOptions.SnippetType;
import steps.BaseClass;
import steps.SalesforceMethods;

@CucumberOptions(features = "src/test/java/features/F03_CreateOpportunity.feature", 
				 glue = "steps",
				 monochrome = true,
				 publish = true	,
				 snippets=SnippetType.CAMELCASE
				// tags="@smoke" //excute the featurefile/scenario with the given @tag
				 //"@Smoke and @regression" ->excutes the scenario with the both the condition to be true
				 //"@smoke or @regression"-->executes the scenario with any one condition is true		 
				 
				// "not @smoke"//excludes the given @tag and executes the other testcases
				 )
public class CucumberRunner extends SalesforceMethods  {

}
