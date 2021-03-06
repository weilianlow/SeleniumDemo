package test.java.junittestcases;

import org.junit.Assert;

import test.java.pageobjects.SearchForm;
import test.java.pageobjects.TopNavigation;

public class Testcase1 extends Hooks{
	@Override
	public void body() throws Exception {
		WD.get("https://google.com.sg");
		SearchForm.inputQ(WD).sendKeys("Hello World");
		Thread.sleep(2000);
		Assert.assertEquals("Great1!","Great1!");
		SearchForm.buttonSearch(WD).click();
		Thread.sleep(1000);
		TopNavigation.aImages(WD).click();
		Thread.sleep(2000);
		Assert.assertEquals("Great2!","Great2!");
	}
}