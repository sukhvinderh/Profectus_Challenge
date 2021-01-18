package com.linkedin.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LinkedInHomepage extends BasePage {
	
	public LinkedInHomepage(WebDriver driver) {
		super(driver);
	}
	
	public LinkedInSearchPage searchPerson(String personName) {
		new WebDriverWait(driver, 15).until(driver->driver.findElement(By.cssSelector("[placeholder='Search']")));
		driver.findElement(By.cssSelector("[placeholder='Search']")).sendKeys(personName);
		clickEnter();
		return new LinkedInSearchPage(driver);
		
	}
	
	public void clickEnter() {
		Actions action = new Actions(driver);
		action.sendKeys(Keys.RETURN).build().perform();
	}

}