package com.challenge.tests;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseTest {

	protected WebDriver driver;
	
	@BeforeClass(alwaysRun = true)
	public static void beforeClass() {
		WebDriverManager.chromedriver().setup();
	}

	@BeforeMethod
	public void beforeMethod() {
		
		this.driver = new ChromeDriver();
		this.driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);
		this.driver.manage().window().maximize();
		this.driver.navigate().to("https://www.linkedin.com/login");
		
	}

	@AfterMethod
	public void afterMethod() {
		//driver.quit();
	}
	
}
