package test.java.cucumbertestcases;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class) 
@CucumberOptions(features="src/test/java/cucumbertestcases")//,format = {"pretty", "html:target/cucumber"}) 

public class TestSuite {}