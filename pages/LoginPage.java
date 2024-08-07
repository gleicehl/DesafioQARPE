package dev.gleice.selenium.dev.gleice.selenium.pages;

import org.openqa.selenium.By;

public class LoginPage extends BasePage {
	//Locators
	private By loginLocator = By.name("username");
	private By passwordLocator = By.name("password");
	private By submitBtnLocator = By.xpath("//*[@id=\\\"login-form\\\"]/footer/button");
	private By tagMychallengeLocator = By.tagName("h1");
	
	
	public void signin() {
		if(super.isDisplayed(loginLocator)) {
			super.type("admin", loginLocator);
			super.type("admin", passwordLocator);
			super.click(submitBtnLocator);
		} else {
			System.out.println("Username textbox was not present");
		}
	}
	
	public String getMyChallengeMessage() {
		return super.getText(tagMychallengeLocator);
	}

}