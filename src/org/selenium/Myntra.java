package org.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Myntra {
	
	public static void main(String[] args) {
		
System.setProperty("webdriver.chrome.driver", "D:\\java and eclipse 32 bit\\java_workspace\\Selenium\\Driver\\chromedriver.exe");
		
		// to create an object//
		
		WebDriver driver = new ChromeDriver();
		
		// to launch//
		
		driver.get("https://www.myntra.com/register");
		
		// to find the element for email //
		
		WebElement email = driver.findElement(By.xpath("//input[@class='register-user-input-email register-user-input']"));
		
		email.sendKeys("rama@gmail.com");
		
		// to find the loacator for pwd //
		
		WebElement pwd = driver.findElement(By.xpath("//input[@class='register-user-input-password register-user-input']"));
		
		pwd.sendKeys("rama837478");
		
		// to find the locator for mobile//
		
		WebElement phe = driver.findElement(By.xpath("//input[@class='register-user-input-mobile register-user-input']"));
		
		phe.sendKeys("8347654254");
		
		// to find the locator for gender //
		
		WebElement gdr = driver.findElement(By.xpath("//input[@id='female']"));
		
		gdr.click();
		
		
	}

}
