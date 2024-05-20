package com.codfios.ebilling.smoke;

import java.util.concurrent.TimeUnit;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AddDeposit {
	public static WebDriver driver;

	@Before

	public void Setup() {
		driver = new ChromeDriver();
		driver.get("https://codefios.com/ebilling/");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
	}

	@Test
	public void login() throws InterruptedException {
		driver.findElement(By.id("user_name")).sendKeys("demo@codefios.com");
		driver.findElement(By.id("password")).sendKeys("abc123");
		driver.findElement(By.id("login_submit")).click();
		driver.findElement(By.linkText("List Accounts")).click();
		driver.findElement(By.cssSelector("button[type='button'")).click();
		
		Thread.sleep(4000);
		driver.findElement(By.id("account_name")).sendKeys("QA");
		driver.findElement(By.id("description")).sendKeys("New account");
		driver.findElement(By.id("balance")).sendKeys("8000");
		driver.findElement(By.id("account_number")).sendKeys("44798732");
		driver.findElement(By.id("contact_person")).sendKeys("cdf");
		//driver.findElement(By.ByXPath(//button[@id='accountSave']));
		//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		

	}
}
