package org.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Facebook {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "D:\\java and eclipse 32 bit\\java_workspace\\Selenium\\Driver\\chromedriver.exe");
		
		// to create an object//
		
		WebDriver drive = new ChromeDriver();
		
		// to launch the web pag//
		
				drive.get("https://www.facebook.com/");
				
		
		// to find element in that particular page//
		
				WebElement find = drive.findElement(By.xpath("//input[@id='email']"));
				
				
				// to enter into the email page// 
				
				find.sendKeys("ramaece.1@gmail.com");
				
				// to enter into password section//
				
				WebElement pwrd = drive.findElement(By.id("pass"));
				
				
				pwrd.sendKeys("sunflower");
				
				// to find element for click//
				
				WebElement clk = drive.findElement(By.xpath("//input[@id='u_0_b']"));
				
				// to click that activity//
				
				clk.click();
		
		
		
		
	}
	
	

}

