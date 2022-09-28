package TestRunner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;	

import org.junit.runner.RunWith;
 
@RunWith(Cucumber.class)

@CucumberOptions(
		// plugin = { "pretty","html:target/cucumber.html"},
		//plugin = { "pretty", "io.qameta.allure.cucumber7jvm.AllureCucumber7Jvm"}, 
		//plugin = {"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"},
		//plugin = { "pretty", "io.qameta.allure.cucumber7jvm.AllureCucumber7Jvm",
		//				"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"}, 
		monochrome = true, 
		dryRun = false, 
		features = "src/test/resources/Features", 
		glue = {"StepDefinition", "Hooks"},
		plugin={"pretty","html:target/HtmlReports.html","json:target/JSONReports/reports.json","junit:target/JUnitReports/report.xml"})


public class Runner  {
}
