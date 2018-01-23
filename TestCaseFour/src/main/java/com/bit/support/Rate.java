package com.bit.support;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Rate {
WebDriver dr;


@Before
public void openBrowser() {
System.setProperty("webdriver.gecko.driver", "/Users/jarrellsimon/Downloads/geckodriver");
dr = new FirefoxDriver();
dr.get("https://www.Bankrate.com");

}
@After
public void closeBrowser() {
dr.quit();
}
	


}
