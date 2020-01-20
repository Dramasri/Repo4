package org.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GreensTech {
	
	

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "D:\\java and eclipse 32 bit\\java_workspace\\Selenium\\Driver\\chromedriver.exe");
		
		// to create an object//
		
		WebDriver drive = new ChromeDriver();
		
		// to launch//
		
		drive.get("http://www.greenstechnologys.com/");
		
		// to find the element//
		
		WebElement fnd = drive.findElement(By.xpath("//a[@href='contact.php']"));
		
		// to click into that element//
		
		fnd.click();
		
		// to find the element//
		
		WebElement find = drive.findElement(By.xpath("//input[@id='InputName']"));
		
		// to enter into the name //
		
		find.sendKeys("Rama");
		
		// to find the element//
		
		WebElement elem = drive.findElement(By.xpath("//input[@id='InputEmail1']"));
		
		// to enter into the mail//
		
		elem.sendKeys("dramaapr@gmail.com");
		
		// to find the element for mobile num//
		
		WebElement mob = drive.findElement(By.xpath("//input[@id='InputSubject']"));
		
		// to enter in mobile //
		
		mob.sendKeys("6380990778");
		
		
		
		
		

		
		
		
		
	}
}
	     