package com.challenge.tests;

import org.testng.annotations.Test;

import com.challenge.dialog.MessageDialog;
import com.challenge.model.Person;
import com.linkedin.pages.LinkedInHomepage;
import com.linkedin.pages.LinkedInLoginPage;
import com.linkedin.pages.LinkedInSearchPage;

public class ProfectusChallengeTests extends BaseTest {
	
	private LinkedInLoginPage login;
	private LinkedInHomepage homepage;
	private LinkedInSearchPage search;
	private Person person;
		
  @Test
  public void verifyMessageIsSentToPerson() {
	  login = new LinkedInLoginPage(driver);
	  homepage = login.login("sukhvinder.hanspal@gmail.com", "Coolio88$$");
	  search = homepage.searchPerson("Profectus Kamaljeet");
	  
	  person = search.getPerson(p->p.getPersonName().equals("Kamaljeet Singh"));
	  person.clickMessageButton();
	  new MessageDialog(driver).sendMessage("Hello, Kamaljeet.  This is the auto message from Sukhvinder");
	  search.logout();
	  
  }
}