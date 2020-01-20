package org.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Snapdeal {
	
	public static void main(String[] args) {
		
System.setProperty("webdriver.chrome.driver", "D:\\java and eclipse 32 bit\\java_workspace\\Selenium\\Driver\\chromedriver.exe");
		
		// to create an object//
		
		WebDriver driver = new ChromeDriver();
		
		// to launch//
		
		driver.get("https://www.snapdeal.com/");
		
		// to find the locator for sign in //
		
		WebElement sign = driver.findElement(By.xpath("//span[@class='accountUserName col-xs-12 reset-padding']"));
		
		sign.click();
		
		// to find for registr //
		
		WebElement rgr = driver.findElement(By.xpath("//span[@class='newUserRegister']"));
		
		rgr.click();
		
		// TO FIND THE LOCATOR FOR USER NAME //
		
		//WebElement mob = driver.findElement(By.xpath("//input[@class='col-xs-24 clickOnceOnly']"));
		
	//	mob.sendKeys("6380990778");
		
		
		
	}

}
