package com.codfios.ebilling.smoke;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators1 {
	 WebDriver driver;

	@Before
	public void setup() {

		driver = new ChromeDriver();
		driver.get("https://objectspy.space/");
		driver.manage().window().maximize();

	}

	// absolute and relative  Xpath
	@Test
	public void test1() {
	//driver.findElement(By.linkText("OS-API Product FrontEnd")).click();
	//driver.findElement(By.partialLinkText("OS-API ")).click();
	driver.findElement(By.partialLinkText("  Product ")).click();
	}
}