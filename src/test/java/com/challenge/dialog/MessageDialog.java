package com.challenge.dialog;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.linkedin.pages.BasePage;

public class MessageDialog extends BasePage {
	
	public MessageDialog(WebDriver driver) {
		super(driver);
	}
	
	public void sendMessage(String message) {
		
		new WebDriverWait(driver, 20).until(driver->driver.findElement(By.cssSelector("[aria-multiline='true']")));
		driver.findElement(By.cssSelector("[aria-multiline='true']")).sendKeys(message);		
		clickEnter();
		closeMessageDialog();
	}
	
	private void clickEnter() {
		Actions action = new Actions(driver);
		action.sendKeys(Keys.RETURN).build().perform();
	}
	
	private void closeMessageDialog() {
		new WebDriverWait(driver, 20).until(driver->driver.findElement(By.cssSelector("[data-control-name='overlay.close_conversation_window']")));
		
		Actions action = new Actions(driver);
		action.moveToElement(driver.findElement(By.cssSelector("[data-control-name='overlay.close_conversation_window']"))).click().build().perform();
	}
}