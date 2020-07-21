package com.hilti.runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {"pretty", "json:target/cucumber-report.json", "html:target/cukes/index.html", "rerun:target/rerun.txt"},
        features = "src/test/resources/features/",
        glue = "com/hilti/step_definitions",
        dryRun = false,
        tags = "@Sample"

)
public class CukesRunner {

}
