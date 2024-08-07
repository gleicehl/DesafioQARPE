package dev.gleice.selenium.dev.gleice.selenium;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

class LoginTest {
	private WebDriver driver;

	@BeforeEach
	void setUp() throws Exception {
		System.setProperty("webdriver.chrome.driver","driver/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://provaqa.prc.rpe.tech:9080/desafioqa/");
	}

	@AfterEach
	void tearDown() throws Exception {
		driver.quit();
	}

	@Test
	void test() {
		WebElement loginElement = driver.findElement(By.name("username"));
		loginElement.sendKeys("admin");
		
		WebElement passwordElement = driver.findElement(By.name("password"));
		passwordElement.sendKeys("admin");
		
		WebElement submitBtnElement = driver.findElement(By.xpath("//*[@id=\"login-form\"]/footer/button"));
		submitBtnElement.click();
		
		WebElement tagMyChallenge = driver.findElement(By.tagName("h1"));
		String textTagH1 = tagMyChallenge.getText();
		
		Assertions.assertTrue(textTagH1.equals("Bem vindo ao Desafio"));
	}

}
