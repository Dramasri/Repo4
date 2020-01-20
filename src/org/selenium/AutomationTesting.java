package org.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutomationTesting {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "D:\\java and eclipse 32 bit\\java_workspace\\Selenium\\Driver\\chromedriver.exe");
		
		// to create an object//
		
		WebDriver drive = new ChromeDriver();
		
		// to launch //
		
		drive.get("http://demo.automationtesting.in/Register.html");
		
		// to find element //
		
		WebElement find = drive.findElement(By.xpath("//input[@ng-model='FirstName']"));
		
		// to enter into the name//
		
		find.sendKeys("Rama");
		
		// to find the element //
		
		WebElement addrs = drive.findElement(By.xpath("//textarea[@ng-model='Adress']"));
		
		// to enter into address //
		
		addrs.sendKeys("B 26, 201, pudupakkam, chennai");
		
		
		// to find the element for hobbies//
		
		WebElement hob = drive.findElement(By.xpath("//input[@id='checkbox2']"));
		
		// to click //
		
		hob.click();
		
		
		
		
	}

}
