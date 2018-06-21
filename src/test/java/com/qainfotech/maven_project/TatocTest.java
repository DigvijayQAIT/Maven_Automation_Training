package com.qainfotech.maven_project;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.qainfotech.maven.Tatoc.course.BasicCourse;
import com.qainfotech.maven.Tatoc.course.CookieHandling;
import com.qainfotech.maven.Tatoc.course.DragAround;
import com.qainfotech.maven.Tatoc.course.FrameDungeon;
import com.qainfotech.maven.Tatoc.course.GridGate;
import com.qainfotech.maven.Tatoc.course.PopupWindows;

public class TatocTest {
	
	WebDriver driver;
	
	@Test(priority = 0)
	public void verifyBasicCourseSelection() {
		Assert.assertTrue(new BasicCourse().basicCourseSelection(driver));
	}
	
	@Test(priority = 1)
	public void verifyGreenBoxSelected() {
		Assert.assertTrue(new GridGate().clickBox(driver));
	}
	
	@Test(priority = 2)
	public void verifyBoxColorSame() {
		Assert.assertTrue(new FrameDungeon().colorMatching(driver));
	}
	
	@Test(priority = 3)
	public void verifyDragPerformed() {
		Assert.assertTrue(new DragAround().drag(driver));
	}
	
	@Test(priority = 4)
	public void verifyTextEnteredInPopupWindow() {
		Assert.assertTrue(new PopupWindows().launchPopupWindow(driver));
	}
	
	@Test(priority = 5)
	public void verifyCookieAdded() {
		Assert.assertTrue(new CookieHandling().addCookie(driver));
	}
	
	@BeforeTest
	public void launchBrowser() {
		driver = new ChromeDriver();
		driver.get("http://10.0.1.86/tatoc");
		driver.manage().window().maximize();
	}
	
	@AfterTest
	public void closeBrowser() throws InterruptedException {
		Thread.sleep(2000);
		driver.quit();
	}

}
