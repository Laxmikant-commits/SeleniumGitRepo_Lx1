package com.hyr.Tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Facebook {

	
	WebDriver driver ;
	
	@Test
		
		public void LaunchApp() throws InterruptedException {
			
		}
		
		@Test
		
		public void EnterLoginDetails() throws InterruptedException {
			
			WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://www.facebook.com/");
			
			driver.findElement(By.id("email")).sendKeys("kumarlaxmikant700@gmail.com");
			
			Thread.sleep(3000);
			
			driver.findElement(By.id("pass")).sendKeys("laxmmi@2512");
			
			Thread.sleep(3000);
			
			driver.findElement(By.xpath("//button[@name='login']")).click();
			
			Thread.sleep(3000);

			
		}
		

		@Test
		
		public void NavigateToMyInfo() {
			
			driver.findElement(By.id("menu_pim_viewMyDetails")).click();
		}
		
		
		@Test
		
		public void VerifyMyInfo() {
			
			System.out.println(driver.findElement(By.id("employee-details")).isDisplayed());
			
			driver.quit();	
		}
		

		@Test
		
		public void VerifyLogin() {
			
			WebElement element = driver.findElement(By.id("welcome"));
			
			System.out.println(element.isDisplayed());
			System.out.println(element.getText());
			driver.quit();
			
		}
}
