package com.kedar.tests;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Login_Test {

	public static void main(String[] args){
		// TODO Auto-generated method stub
		WebDriver driver= new ChromeDriver();
		
		driver.get("https://www.rediff.com/");
		WebDriverWait mywait = new WebDriverWait(driver, Duration.ofSeconds(10));
		mywait.until(ExpectedConditions.alertIsPresent());
		Alert myalert=driver.switchTo().alert();
		myalert.dismiss();
	}

}
