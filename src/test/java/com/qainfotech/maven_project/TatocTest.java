package com.qainfotech.maven_project;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TatocTest {
	
	private WebDriver driver;
	
	@Test
	public void checkForTheClicking() {
		
	}
	
	@BeforeTest
	public void launchBrowser() {
		driver = new ChromeDriver();
		driver.get("http://10.0.1.86/tatoc");
		System.out.println("Launched Successfully");
	}
	
	@AfterTest
	public void closeBrowser() {
		driver.quit();
	}

}
