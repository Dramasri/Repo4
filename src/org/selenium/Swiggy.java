package org.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Swiggy {
	
	public static void main(String[] args) {
		
System.setProperty("webdriver.chrome.driver", "D:\\java and eclipse 32 bit\\java_workspace\\Selenium\\Driver\\chromedriver.exe");
		
		// to create an object//
		
		WebDriver drive = new ChromeDriver();
		
		// to launch//
		
		drive.get("https://www.swiggy.com/");
		
		// to find the location //
		
		WebElement login = drive.findElement(By.xpath("//a[@class='r2iyh']"));
		
		login.click();
		
		// to find the phone locator //
		
		WebElement phone = drive.findElement(By.xpath("//input[@id='mobile']"));
		
		phone.sendKeys("6380990778");
		
		// to find the locator for name///
		
		WebElement nme = drive.findElement(By.xpath("//input[@id='name']"));
		
		nme.sendKeys("Sriram");
		
		// to find the locator for email //
		
		WebElement emil = drive.findElement(By.xpath("//input[@id='email']"));
		
		emil.sendKeys("drama@gmail.com");
		
		// to find the locator for pwrd //\
		
			WebElement pwd = drive.findElement(By.xpath("//input[@id='password']"));
			
			pwd.sendKeys("vaishuRama");
			
			
		
	}

}
