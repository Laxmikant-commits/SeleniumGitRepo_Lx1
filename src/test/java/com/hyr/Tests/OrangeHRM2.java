package com.hyr.Tests;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class OrangeHRM2 {

	WebDriver driver;

	@BeforeTest

	public void initializeBrowser() {

		driver = new ChromeDriver();
		driver.manage().window().maximize();
	}

	@AfterTest

	public void TearDown() {

		driver.quit();
	}

	@Test

	public void LaunchApp() throws InterruptedException {
		driver.get("https://opensource-demo.orangehrmlive.com/");

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys("Admin");
		
		driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("admin123");
		
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		
		
	}

	@Test

	public void NavigateToMyInfo() {

		WebElement element = driver.findElement(By.xpath("//p[@class='oxd-userdropdown-name']"));
		
		System.out.println(element.isDisplayed());	
		System.out.println(element.getText());
		
				
	}

	@Test
	
	public void searchMenu() {
		
		WebElement element = driver.findElement(By.xpath("//input[@Placeholder='Search']"));
		
		System.out.println(element.getText());
		WebElement item = driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[1]/aside/nav/div[2]/ul/li[3]/a"));
		
		System.out.println(item.isDisplayed());
		System.out.println(item.getText());
	}
	
	
	@Test
	
	public void verifyDropDrown() {
		
		WebElement dropdown = driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[1]/header/div[2]/nav/ul/li[2]/span"));
		
		System.out.println(dropdown.getText());
	}
}
