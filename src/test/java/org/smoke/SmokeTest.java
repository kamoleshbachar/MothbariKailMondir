package org.smoke;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class SmokeTest {
	WebDriver  driver = null;
	
	@BeforeMethod
	public void beforeMethod(){
		 //driver = new FirefoxDriver();
	}
	
	@Test
	public void login() {
		System.out.println(",kn");
		/*driver.get("http://mothbarikalimondir.org/");
		String title = driver.getTitle();
		Assert.assertEquals(title, "Moth Bari Kali Mondir");*/
	}
	@AfterMethod
	public void afterMethod(){
		//driver.quit();
		
	}

}
