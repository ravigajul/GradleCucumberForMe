package com.test;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(dryRun = true,glue = "com.test",monochrome = true,features = "src/test/resources/Test.feature")
public class JunitRunnerTest {
}
