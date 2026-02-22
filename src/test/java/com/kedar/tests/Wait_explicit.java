package com.kedar.tests;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Wait_explicit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		
		WebDriverWait mywait = new WebDriverWait(driver, Duration.ofSeconds(5));
		
		driver.get("https://orangehrm.com");
		
		WebElement x=mywait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='Form_submitForm_EmailHomePage']")));
		
		x.click();
	}

}
