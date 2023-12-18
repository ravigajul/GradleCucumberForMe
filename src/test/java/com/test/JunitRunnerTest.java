package com.test;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;
import static io.cucumber.junit.CucumberOptions.SnippetType.CAMELCASE;

@RunWith(Cucumber.class)
@CucumberOptions(dryRun = true,
        glue = "com.test",
        monochrome = true,
        features = "src/test/resources",
        plugin = {"pretty","html:target/cucumber.html","summary"},
        snippets = CAMELCASE,
        tags = "@smoke22"
)
public class JunitRunnerTest {
}
