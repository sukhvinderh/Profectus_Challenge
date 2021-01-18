package com.linkedin.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BasePage {
	
	protected WebDriver driver;
	
	public BasePage(WebDriver driver) {
		this.driver = driver;
	}
	
	public void logout() {
		new WebDriverWait(driver, 20).until(driver->driver.findElement(By.id("ember39")));
		driver.findElement(By.id("ember39")).click();
		waitforawhile();
		new WebDriverWait(driver, 20).until(driver->driver.findElement(By.xpath("//*[@id=\"ember43\"]/div/ul/li[3]/a")));
		driver.findElement(By.xpath("//*[@id=\"ember43\"]/div/ul/li[3]/a")).click();
		
	}
	
	public void waitforawhile() {
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
