package com.linkedin.pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.challenge.model.CompareSearch;
import com.challenge.model.Person;

public class LinkedInSearchPage extends BasePage {

	public LinkedInSearchPage(WebDriver driver) {
		super(driver);

	}

	public Person getPerson(CompareSearch comparator) {

		List<WebElement> results = driver.findElements(By.cssSelector("[class^='reusable-search__entity-results-list']"));
		for (WebElement result : results) {
			Person res = new Person(result);

			if (comparator.compare(res)) {
				return res;
			}
		}
		throw new RuntimeException("Person Not found in LinkedIn Search !");
	}

}