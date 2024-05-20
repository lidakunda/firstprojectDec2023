package com.codfios.ebilling.smoke;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators {

	public static WebDriver driver;

	@Before
	public void setup() {
		/* System.setProperty(webdriver.chrome.driver, "C:\\Users\\Alida
		 Iradukunda\\OneDrive\\Desktop\\Selenium\\chromedriver-win64\\chromedriver-win64");??????*/
		driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();

	}

	@Test
	public void test1() {
		driver.findElement(By.cssSelector("input#email")).sendKeys("kundalida");//css selector tag and id
		//driver.findElement(By.cssSelector("#email")).sendKeys("abcgmail.com");//css selector tag and id
		//driver.findElement(By.cssSelector("input[data-testid=royal_pass]")).sendKeys("123");//css selector tag and attribute
	   //  driver.findElement(By.cssSelector("button._42ft _4jy0 _6lth _4jy6 _4jy1 selected _51sy")).sendKeys("abc");//css selector tag and class??????
	     driver.findElement(By.cssSelector("input.inputtext[data-testid =royal_pass ]")).sendKeys("789");
	}

}