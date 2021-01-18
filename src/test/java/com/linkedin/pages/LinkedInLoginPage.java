package com.linkedin.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LinkedInLoginPage {
	
	private WebDriver driver;
	
	public LinkedInLoginPage(WebDriver driver) {
		this.driver = driver;
	}
	
	public LinkedInHomepage login(String username, String password) {
		setUsername(username);
		setPassword(password);
		clickSignIn();
		
		return new LinkedInHomepage(driver);
	}
	
	private void setUsername(String username) {
		new WebDriverWait(driver, 15).until(driver->driver.findElement(By.id("username")));
		driver.findElement(By.id("username")).sendKeys(username);
	}
	
	private void setPassword(String password) {
		new WebDriverWait(driver, 15).until(driver->driver.findElement(By.id("password")));
		driver.findElement(By.id("password")).sendKeys(password);
		
	}
	
	private void clickSignIn() {
		new WebDriverWait(driver, 15).until(driver->driver.findElement(By.cssSelector("[data-litms-control-urn='login-submit']")));
		driver.findElement(By.cssSelector("[data-litms-control-urn='login-submit']")).click();
	}

}
