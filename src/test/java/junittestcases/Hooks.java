package test.java.junittestcases;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;

import test.java.automationframework.GenericWebDriverFactory;

import org.junit.Before;
import org.junit.After;
import org.junit.Test;
import org.junit.Assert;

public class Hooks {
	WebDriver WD;
	@Before
	public void start(){
		WD = new GenericWebDriverFactory("chrome").getWebDriver();
		WD.manage().window().maximize();
		WD.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
	}
	@After
	public void end(){
		WD.quit();
	}
	@Test
	public void main() throws Exception{
		try{
			body();
		}catch(Exception e){
			Assert.fail(e.getMessage());
		}
	}

	public void body() throws Exception{};
}
