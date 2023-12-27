package com.hyr.Tests;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class FirstTest {
	
	
	@Test
	public void TestGoogle() throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://google.com/");
		driver.findElement(By.name("q")).sendKeys("hyr tutorial",Keys.ENTER);
		System.out.println(driver.getTitle());
		Thread.sleep(5000);
		driver.quit();
	}
		
		
		@Test
		
		public void TestFacebook() throws InterruptedException {
			WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://facebook.com/");
			driver.findElement(By.name("email")).sendKeys("hyr tutorial",Keys.ENTER);
			System.out.println(driver.getTitle());
			Thread.sleep(5000);
			driver.quit();
		
			
	
		
	}

}
