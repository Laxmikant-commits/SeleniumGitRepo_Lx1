package com.hyr.Tests;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import org.testng.annotations.Test;

public class OrangeHRM {

	
	WebDriver driver ;
	
@Test
	
	public void LaunchApp() throws InterruptedException {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS) ;
	
	}


	
	@Test
	
	public void EnterLoginDetails() throws InterruptedException {
		driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys("Admin");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("admin123");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//button[@type='submit']")).click();

		
	}
	
	
	
	
}
