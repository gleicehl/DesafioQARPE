package dev.gleice.selenium.dev.gleice.selenium.pages.test;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import dev.gleice.selenium.dev.gleice.selenium.pages.LoginPage;

class LoginPageTest {
	private LoginPage loginPage;
	private final String URL = "http://provaqa.prc.rpe.tech:9080/desafioqa/";

	@BeforeEach
	void setUp() throws Exception {
		this.loginPage = new LoginPage();
		this.loginPage.visit(this.URL);
	}

	@AfterEach
	//void tearDown() throws Exception {
	//	this.loginPage.quitWebDriver();
	//}

	@Test
	void test() {
		this.loginPage.signin();
		
		Assertions.assertTrue(this.loginPage.getMyChallengeMessage().equals("Bem vindo ao Desafio"));
		Assertions.assertFalse(this.loginPage.getCurrentUrl().equals(this.URL));
	}

}