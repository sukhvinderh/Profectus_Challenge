package com.challenge.model;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.challenge.dialog.MessageDialog;

public class Person {
	
	private WebElement element;
	
	public Person(WebElement element) {
		this.element = element;
	}
	
	public void sendMessage(String message) {
		clickMessageButton();
		
	}
	
	public void clickMessageButton() {
		element.findElement(By.cssSelector("[class='artdeco-button__text']")).click();
		
		//return new MessageDialog(driver.findElement());
	}
	
	private void clickToSend() {
	}
	
	public String getPersonName() {
				
		return element.findElement(By.cssSelector("[aria-hidden='true']")).getText();
	}
	
	private void waitforawhile() {
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
