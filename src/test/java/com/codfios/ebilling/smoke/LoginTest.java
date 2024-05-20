package com.codfios.ebilling.smoke;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginTest {

	   WebDriver driver;
	 

	public static void main(String[] args) {
		// positive senario

	/*	setup();
		login("demo@codefios.com", "abc123");
		teardown();

		setup();
		login("jamesBond", "abc123");
		teardown();

		setup();
		login("demo@codefios.com", "478");
		teardown();*/
         // positive senario
		WebDriver driver = new ChromeDriver();
		driver.get("https://codefios.com/ebilling/");
		//WebDriverWait wait =new WebDriverWait(driver, 1);
		driver.findElement(By.id("user_name")).sendKeys("demo@codefios.com");
		driver.findElement(By.id("password")).sendKeys("abc123");
		driver.findElement(By.id("login_submit")).click();
		

		// Negative senario

		driver.get("https://codefios.com/ebilling/");
		driver.findElement(By.id("user_name")).sendKeys("jamesBond");
		driver.findElement(By.id("password")).sendKeys("abc123");
		driver.findElement(By.id("login_submit")).click();
		driver.close();
	}

	public static void login(String user, String pwd) {
		driver.findElement(By.id("user_name")).sendKeys(user);
		driver.findElement(By.id("password")).sendKeys(pwd);
		driver.findElement(By.id("login_submit")).click();
	}

	public static void setup() {
		driver = new ChromeDriver();
		driver.get("https://codefios.com/ebilling/");
	
	
	}

	/*public static void teardown() {
		driver.close();
	}*/
}
